/*-
 * ================================================================================
 * eCOMP Portal SDK
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ================================================================================
 */
package org.openecomp.portalsdk.workflow.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openecomp.portalsdk.core.logging.logic.EELFLoggerDelegate;
import org.openecomp.portalsdk.core.service.DataAccessService;
import org.openecomp.portalsdk.workflow.domain.WorkflowSchedule;
import org.openecomp.portalsdk.workflow.scheduler.WorkFlowScheduleRegistry;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("workflowScheduleService")
@Transactional

public class WorkflowScheduleServiceImpl implements WorkflowScheduleService{
	
	EELFLoggerDelegate logger = EELFLoggerDelegate.getLogger(WorkflowScheduleServiceImpl.class);

	
	@Autowired
	private DataAccessService  dataAccessService;
	
	@Autowired
	private WorkFlowScheduleRegistry workflowRegistry;
	
	@Autowired
	private ApplicationContext appContext;
	

	public List<WorkflowSchedule> findAll() {
		
	/*	List<WorkflowSchedule> allworkflows = getDataAccessService().getList(WorkflowSchedule.class, null);
		for (WorkflowSchedule ws : allworkflows) {
			
			System.out.println("Key:"+ws.getWorkflowKey()+" "+"CronDetails:"+ws.getStartdatetimecron());
		} */
		@SuppressWarnings("unchecked")
		List<WorkflowSchedule> list = getDataAccessService().getList(WorkflowSchedule.class, null);
		return list;
	}
	
	
	public void saveWorkflowSchedule(WorkflowSchedule ws){
		
		getDataAccessService().saveDomainObject(ws, null);
		logger.info(EELFLoggerDelegate.debugLogger, ("Workflow Scheduled " + ws.getId() + " " + ws.getEndDateTime()));
		triggerWorkflowScheduling((SchedulerFactoryBean)appContext.getBean(SchedulerFactoryBean.class),ws);
		
	}
	
	public void triggerWorkflowScheduling(SchedulerFactoryBean schedulerBean, WorkflowSchedule ws) {
		
		try {
			final CronTriggerFactoryBean triggerBean = workflowRegistry.setUpTrigger(ws.getId(), ws.getServerUrl(), ws.getWorkflowKey(),ws.getArguments(),ws.getCronDetails(), ws.getStartDateTime(),ws.getEndDateTime());
			schedulerBean.getScheduler().scheduleJob((JobDetail)triggerBean.getJobDataMap().get("jobDetail"),triggerBean.getObject());
		} catch (Exception e) {
			logger.debug(EELFLoggerDelegate.debugLogger, ("Error scheduling work flow with Id" + ws.getId() + e.getMessage()));
		}
		
	}
	
	public List<Trigger> triggerWorkflowScheduling() {
		
		 Date date = new Date();
		 List<Trigger> triggers = new ArrayList<Trigger>();
		 
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		if (getDataAccessService() != null) {
			@SuppressWarnings("unchecked")
			List<WorkflowSchedule> allWorkflows = getDataAccessService()
					.executeQuery("From  WorkflowSchedule where endDateTime > '" + dateFormat.format(date) + "'", null);

			for (WorkflowSchedule ws : allWorkflows) {
				logger.info(EELFLoggerDelegate.debugLogger, ("Workflow Scheduled " + ws.getId() + "/ End Time: " + ws.getEndDateTime()));
		
				try {
					
					final CronTriggerFactoryBean triggerBean = workflowRegistry.setUpTrigger(ws.getId(), ws.getServerUrl(), ws.getWorkflowKey(),ws.getArguments(), ws.getCronDetails(), ws.getStartDateTime(),ws.getEndDateTime());
					
					triggers.add(triggerBean.getObject());
					
					//schedulerBean.getScheduler().scheduleJob(trigger);
				
				
				} catch (Exception e) {
					logger.debug(EELFLoggerDelegate.debugLogger, ("Error scheduling work flow with Id" + ws.getId() + e.getMessage()));
				}
			
			
			}
		}
		
		return triggers;
	}
	
	
	public DataAccessService getDataAccessService() {
		return dataAccessService;
	}


	public void setDataAccessService(DataAccessService dataAccessService) {
		this.dataAccessService = dataAccessService;
	}

	@Override
	public WorkflowSchedule getWorkflowScheduleByKey(Long key) {
		return  (WorkflowSchedule)(getDataAccessService().getDomainObject(WorkflowSchedule.class, key, null));
	}
}


