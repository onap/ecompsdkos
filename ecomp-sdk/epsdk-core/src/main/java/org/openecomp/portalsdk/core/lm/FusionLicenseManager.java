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
package org.openecomp.portalsdk.core.lm;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

//import de.schlichtherle.license.LicenseContent;

public interface FusionLicenseManager {
	
	
	public static final int DEVELOPER_LICENSE = 0;
	public static final int EXPIRED_LICENSE = 1;
	public static final int VALID_LICENSE = 2;
	public static final int INVALID_LICENSE = 3;
	public static final int OPENSOURCE_LICENSE = 4;

	public void initKeyStoreParam();

	public void initCipherParam();

	public void initLicenseParam();

	public void doInitWork();

	public int installLicense();

	public int verifyLicense(ServletContext context);

	//public LicenseContent createLicenseContent(Map<String, String> clientInfoMap, List<String> ipAddressList);

	public void generateLicense(Map<String, String> clientInfoMap, List<String> ipAddressList) throws Exception;

	public String nvl(String s);

	public Date getExpiredDate();

	public void setExpiredDate(Date expiredDate);
}