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
package org.openecomp.portalsdk.core.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.openecomp.portalsdk.core.domain.support.CollaborateList;

public class CollaborateListBindingListener implements HttpSessionBindingListener, Serializable {

	private static final long serialVersionUID = 1L;
	private String userName;
	public static final String SESSION_ATTR_NAME = "CollaborateListSessionAttrName";

	public CollaborateListBindingListener(String _userName) {
		userName = _userName;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		final CollaborateListBindingListener value = ((CollaborateListBindingListener) event.getValue());
		CollaborateList.addUserName(value.getUserName());

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		final CollaborateListBindingListener value = ((CollaborateListBindingListener) event.getValue());
		if (value != null)
			CollaborateList.delUserName(value.getUserName());
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
