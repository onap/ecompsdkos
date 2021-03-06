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
package org.openecomp.portalsdk.workflow.domain;
import java.util.Date;

import org.openecomp.portalsdk.core.domain.support.DomainVo;
public class WorkflowSchedule extends DomainVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private String serverUrl;
    private String workflowKey;
    private String arguments;
    private String cronDetails;
    private Date endDateTime;
    private Date startDateTime;
    private String recurrence;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServerUrl() {
		return serverUrl;
	}
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public String getWorkflowKey() {
		return workflowKey;
	}
	public void setWorkflowKey(String workflowKey) {
		this.workflowKey = workflowKey;
	}
	public String getArguments() {
		return arguments;
	}
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
	public String getCronDetails() {
		return cronDetails;
	}
	public void setCronDetails(String cronDetails) {
		this.cronDetails = cronDetails;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getRecurrence() {
		return recurrence;
	}
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
  
}
