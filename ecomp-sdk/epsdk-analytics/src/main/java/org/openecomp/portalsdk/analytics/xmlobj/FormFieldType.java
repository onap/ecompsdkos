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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.07 at 02:07:29 PM EDT 
//


package org.openecomp.portalsdk.analytics.xmlobj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FormFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderBySeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldDefaultSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rangeEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rangeStartDateSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeEndDateSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}comment" minOccurs="0"/>
 *         &lt;element name="predefinedValueList" type="{}PredefinedValueList" minOccurs="0"/>
 *         &lt;element name="dependsOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupFormField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiSelectListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fieldId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFieldType", propOrder = {
    "colId",
    "fieldName",
    "fieldType",
    "visible",
    "validationType",
    "mandatory",
    "defaultValue",
    "orderBySeq",
    "fieldSQL",
    "fieldDefaultSQL",
    "rangeStartDate",
    "rangeEndDate",
    "rangeStartDateSQL",
    "rangeEndDateSQL",
    "comment",
    "predefinedValueList",
    "dependsOn",
    "groupFormField",
    "multiSelectListSize"
})
public class FormFieldType {

    @XmlElement(required = true)
    protected String colId;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String fieldType;
    protected String visible;
    protected String validationType;
    protected String mandatory;
    protected String defaultValue;
    protected Integer orderBySeq;
    protected String fieldSQL;
    protected String fieldDefaultSQL;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rangeStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rangeEndDate;
    protected String rangeStartDateSQL;
    protected String rangeEndDateSQL;
    protected String comment;
    protected PredefinedValueList predefinedValueList;
    protected String dependsOn;
    @XmlElement(defaultValue = "false")
    protected Boolean groupFormField;
    @XmlElement(defaultValue = "4")
    protected String multiSelectListSize;
    @XmlAttribute(name = "fieldId")
    protected String fieldId;

    /**
     * Gets the value of the colId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColId() {
        return colId;
    }

    /**
     * Sets the value of the colId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColId(String value) {
        this.colId = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisible(String value) {
        this.visible = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatory(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the orderBySeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderBySeq() {
        return orderBySeq;
    }

    /**
     * Sets the value of the orderBySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderBySeq(Integer value) {
        this.orderBySeq = value;
    }

    /**
     * Gets the value of the fieldSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldSQL() {
        return fieldSQL;
    }

    /**
     * Sets the value of the fieldSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldSQL(String value) {
        this.fieldSQL = value;
    }

    /**
     * Gets the value of the fieldDefaultSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDefaultSQL() {
        return fieldDefaultSQL;
    }

    /**
     * Sets the value of the fieldDefaultSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDefaultSQL(String value) {
        this.fieldDefaultSQL = value;
    }

    /**
     * Gets the value of the rangeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeStartDate() {
        return rangeStartDate;
    }

    /**
     * Sets the value of the rangeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeStartDate(XMLGregorianCalendar value) {
        this.rangeStartDate = value;
    }

    /**
     * Gets the value of the rangeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeEndDate() {
        return rangeEndDate;
    }

    /**
     * Sets the value of the rangeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeEndDate(XMLGregorianCalendar value) {
        this.rangeEndDate = value;
    }

    /**
     * Gets the value of the rangeStartDateSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeStartDateSQL() {
        return rangeStartDateSQL;
    }

    /**
     * Sets the value of the rangeStartDateSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeStartDateSQL(String value) {
        this.rangeStartDateSQL = value;
    }

    /**
     * Gets the value of the rangeEndDateSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeEndDateSQL() {
        return rangeEndDateSQL;
    }

    /**
     * Sets the value of the rangeEndDateSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeEndDateSQL(String value) {
        this.rangeEndDateSQL = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the predefinedValueList property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedValueList }
     *     
     */
    public PredefinedValueList getPredefinedValueList() {
        return predefinedValueList;
    }

    /**
     * Sets the value of the predefinedValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedValueList }
     *     
     */
    public void setPredefinedValueList(PredefinedValueList value) {
        this.predefinedValueList = value;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependsOn() {
        return dependsOn;
    }

    /**
     * Sets the value of the dependsOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependsOn(String value) {
        this.dependsOn = value;
    }

    /**
     * Gets the value of the groupFormField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupFormField() {
        return groupFormField;
    }

    /**
     * Sets the value of the groupFormField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupFormField(Boolean value) {
        this.groupFormField = value;
    }

    /**
     * Gets the value of the multiSelectListSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiSelectListSize() {
        return multiSelectListSize;
    }

    /**
     * Sets the value of the multiSelectListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiSelectListSize(String value) {
        this.multiSelectListSize = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldId(String value) {
        this.fieldId = value;
    }

}
