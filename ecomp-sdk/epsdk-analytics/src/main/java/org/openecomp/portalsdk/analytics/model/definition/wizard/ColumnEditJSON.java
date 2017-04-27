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
package org.openecomp.portalsdk.analytics.model.definition.wizard;

public class ColumnEditJSON implements WizardJSON {

	private String tabId;
	private String tabName;
	
	private String colId;
	private String colName;
	private String displayAlignment;
	private String displayHeaderAlignment;
	private boolean sortable;
	private boolean visible;
	
	private String drilldownURL;
	private String drilldownParams;
	private String drilldownType;
	
	public String getTabId() {
		return tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}
	public String getTabName() {
		return tabName;
	}
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	public String getColId() {
		return colId;
	}
	public void setColId(String colId) {
		this.colId = colId;
	}
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public String getDisplayAlignment() {
		return displayAlignment;
	}
	public void setDisplayAlignment(String displayAlignment) {
		this.displayAlignment = displayAlignment;
	}
	public String getDisplayHeaderAlignment() {
		return displayHeaderAlignment;
	}
	public void setDisplayHeaderAlignment(String displayHeaderAlignment) {
		this.displayHeaderAlignment = displayHeaderAlignment;
	}
	public boolean isSortable() {
		return sortable;
	}
	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public String getDrilldownURL() {
		return drilldownURL;
	}
	public void setDrilldownURL(String drilldownURL) {
		this.drilldownURL = drilldownURL;
	}
	public String getDrilldownParams() {
		return drilldownParams;
	}
	public void setDrilldownParams(String drilldownParams) {
		this.drilldownParams = drilldownParams;
	}
	public String getDrilldownType() {
		return drilldownType;
	}
	public void setDrilldownType(String drilldownType) {
		this.drilldownType = drilldownType;
	}
	
	
	
	
	
	
}
