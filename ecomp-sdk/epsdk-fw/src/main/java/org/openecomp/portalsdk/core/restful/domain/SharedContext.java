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
package org.openecomp.portalsdk.core.restful.domain;

/**
 * Bean that represents shared-context data transferred in JSON objects. This is
 * a minimum example:
 * 
 * <PRE>
 * {
 *   "context_id": "abc123",
 *   "ckey": "myKey",
 *   "cvalue": "my context value to share"
 * }
 * </PRE>
 */
public class SharedContext {

	// Response field indicates nothing else is present
	private String response;
	// Required fields when data is present
	private String context_id, ckey, cvalue;
	private Long id, create_time;
	// Additional database fields from the DomainVO object.
	private String created, modified, createdId, modifiedId, auditUserId, auditTrail, rowNum;

	/**
	 * Gets the response field.
	 * 
	 * @return response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Sets the response field.
	 * 
	 * @param response
	 *            The response to set
	 */
	public void setResponse(final String response) {
		this.response = response;
	}

	/**
	 * Gets the database row ID.
	 * 
	 * @return Database row ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the database row ID.
	 * 
	 * @param id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Gets the creation time
	 * 
	 * @return Creation time as a Long
	 */
	public Long getCreate_time() {
		return create_time;
	}

	/**
	 * Sets the creation time
	 * 
	 * @param create_time
	 */
	public void setCreate_time(final Long create_time) {
		this.create_time = create_time;
	}

	/**
	 * Gets the context ID
	 * 
	 * @return Context ID
	 */
	public String getContext_id() {
		return context_id;
	}

	/**
	 * Sets the context ID
	 * 
	 * @param context_id
	 */
	public void setContext_id(final String context_id) {
		this.context_id = context_id;
	}

	/**
	 * Gets the key of the key-value pair. Called ckey because "key" is a
	 * reserved word in Mysql.
	 * 
	 * @return The key
	 */
	public String getCkey() {
		return ckey;
	}

	/**
	 * Sets the key of the key-value pair.
	 * 
	 * @param ckey
	 */
	public void setCkey(final String ckey) {
		this.ckey = ckey;
	}

	/**
	 * Gets the value of the key-value pair. Called cvalue because "value" is a
	 * reserved word in Mysql.
	 * 
	 * @return Value of the key-value pair.
	 */
	public String getCvalue() {
		return cvalue;
	}

	/**
	 * Sets the value of the key-value pair.
	 * 
	 * @param cvalue
	 */
	public void setCvalue(final String cvalue) {
		this.cvalue = cvalue;
	}

	/**
	 * Gets the created value.
	 * 
	 * @return Created info from database
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * Sets the created value.
	 * 
	 * @param created
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * Gets the modified value.
	 * 
	 * @return Modified info from database
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * Sets the modified value.
	 * 
	 * @param modified
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}

	/**
	 * Gets the createdId value.
	 * 
	 * @return CreatedId info from database
	 */
	public String getCreatedId() {
		return createdId;
	}

	/**
	 * Sets the createdId value.
	 * 
	 * @param createdId
	 */
	public void setCreatedId(String createdId) {
		this.createdId = createdId;
	}

	/**
	 * Gets the modifiedId value.
	 * 
	 * @return ModifiedId info from database
	 */
	public String getModifiedId() {
		return modifiedId;
	}

	/**
	 * Sets the modifiedId value.
	 * 
	 * @param modifiedId
	 */
	public void setModifiedId(String modifiedId) {
		this.modifiedId = modifiedId;
	}

	/**
	 * Gets the audit user ID value.
	 * 
	 * @return AuditUserId from database
	 */
	public String getAuditUserId() {
		return auditUserId;
	}

	/**
	 * Sets the audit user ID value.
	 * 
	 * @param auditUserId
	 */
	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}

	/**
	 * Gets the audit trail value.
	 * 
	 * @return AuditTrail from database.
	 */
	public String getAuditTrail() {
		return auditTrail;
	}

	/**
	 * Sets the audit trail value.
	 * 
	 * @param auditTrail
	 */
	public void setAuditTrail(String auditTrail) {
		this.auditTrail = auditTrail;
	}

	/**
	 * Gets the row num value.
	 * 
	 * @return rowNum from database.
	 */
	public String getRowNum() {
		return rowNum;
	}

	/**
	 * Sets the row num value.
	 * 
	 * @param rowNum
	 */
	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}

	@Override
	public boolean equals(Object obj) {
		SharedContext other = (SharedContext) obj;
		return this.id == other.id && this.context_id.equals(other.context_id) && this.ckey.equals(other.ckey)
				&& this.cvalue.equals(other.cvalue);
	}

	@Override
	public int hashCode() {
		return (int) (id + context_id.hashCode() + ckey.hashCode() + cvalue.hashCode());
	}

	@Override
	public String toString() {
		String s = "@SharedContext[id: " + id + "; context_id: " + context_id + "; ckey: " + ckey + "; cvalue: "
				+ cvalue + "]";
		return s;
	}

}