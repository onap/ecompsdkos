/*-
 * ================================================================================
 * ECOMP Portal SDK
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
package org.openecomp.portalapp.controller.core;

import static com.att.eelf.configuration.Configuration.MDC_KEY_REQUEST_ID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openecomp.portalsdk.core.controller.RestrictedBaseController;
import org.openecomp.portalsdk.core.domain.App;
import org.openecomp.portalsdk.core.domain.User;
import org.openecomp.portalsdk.core.logging.aspect.AuditLog;
import org.openecomp.portalsdk.core.logging.format.AlarmSeverityEnum;
import org.openecomp.portalsdk.core.logging.logic.EELFLoggerDelegate;
import org.openecomp.portalsdk.core.onboarding.rest.FavoritesClient;
import org.openecomp.portalsdk.core.onboarding.util.CipherUtil;
import org.openecomp.portalsdk.core.service.AppService;
import org.openecomp.portalsdk.core.util.SystemProperties;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@org.springframework.context.annotation.Configuration
@EnableAspectJAutoProxy
@AuditLog
public class FavoritesController extends RestrictedBaseController {

	private EELFLoggerDelegate logger = EELFLoggerDelegate.getLogger(FavoritesController.class);

	@Autowired
	private AppService appService;

	/**
	 * Makes the REST API call to Portal Back-end and retrieves Favorite menu
	 * items for the currently logged in user.
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = { "/get_favorites" }, method = RequestMethod.GET)
	public void getFavorites(HttpServletRequest request, HttpServletResponse response) {
		String appName			= "";
		String requestId 		= "";
		String appUserName 		= "";
		String decryptedPwd 	= "";
		
		try {
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute(SystemProperties.getProperty(SystemProperties.USER_ATTRIBUTE_NAME));
			if (user == null || user.getId() == null) {
				logger.info(EELFLoggerDelegate.errorLogger,
						("Http request did not contain user info, cannot retrieve favorites."));

				response.setContentType("application/json");
				JSONArray jsonResponse = new JSONArray();
				JSONObject error = new JSONObject();
				error.put("error", "Http request did not contain user info, cannot retrieve favorites.");
				jsonResponse.put(error);
				response.getWriter().write(jsonResponse.toString());
			} else {
				logger.info(EELFLoggerDelegate.errorLogger,
						"Retrieving Favorites for the user '" + MDC.get(SystemProperties.MDC_LOGIN_ID) + "'.");
				
				App app = appService.getDefaultApp();
				if (app!=null) {
					appName	= app.getName();
					appUserName = app.getUsername();
					try{
						decryptedPwd = CipherUtil.decrypt(app.getAppPassword(), SystemProperties.getProperty(SystemProperties.Decryption_Key));
					} catch(Exception e) {
						logger.error(EELFLoggerDelegate.errorLogger, "Exception occurred in WebServiceCallServiceImpl.get while decrypting the password. Details: " + e.getMessage());
					}
				} else {
					logger.warn(EELFLoggerDelegate.errorLogger, "Unable to locate the app information from the database.");
					appName	= SystemProperties.SDK_NAME;
				}
				requestId = MDC.get(MDC_KEY_REQUEST_ID);
				
				String jsonResponse = FavoritesClient.getFavorites(MDC.get(SystemProperties.MDC_LOGIN_ID), appName, requestId, appUserName, decryptedPwd);
				
				logger.debug(EELFLoggerDelegate.debugLogger, "FavoritesMenu response: " + jsonResponse);
				
				response.setContentType("application/json");
				response.getWriter().write(jsonResponse);
			}
		} catch (Exception e) {
			logger.error(EELFLoggerDelegate.errorLogger,
					"Exception occurred in FavoritesController.getFavorites while performing get_favorites. Details: "
							+ e.getMessage(), AlarmSeverityEnum.MINOR);
		}
	}
}
