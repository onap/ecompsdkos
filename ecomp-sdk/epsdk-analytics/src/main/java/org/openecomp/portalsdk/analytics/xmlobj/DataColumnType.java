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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataColumnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataColumnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbColName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="crossTabValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="displayWidthInPxls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfDisplayWidthInPxls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayAlignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayHeaderAlignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calculated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="colType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hyperlinkURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionImg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupByPos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subTotalCustomText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideRepeatedKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupBreak" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderBySeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderByAscDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colOnChart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chartSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chartColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chartLineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chartSeries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRangeAxisFilled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSortable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createInNewChart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="drillDownType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drillinPoPUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="drillDownURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drillDownParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}comment" minOccurs="0"/>
 *         &lt;element name="colFilterList" type="{}ColFilterList" minOccurs="0"/>
 *         &lt;element name="semaphoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbColType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chartGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dependsOnFormField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nowrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indentation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enhancedPagination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="colspan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataMiningCol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="colId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataColumnType", propOrder = {
    "tableId",
    "dbColName",
    "crossTabValue",
    "colName",
    "displayName",
    "displayWidth",
    "displayWidthInPxls",
    "pdfDisplayWidthInPxls",
    "displayAlignment",
    "displayHeaderAlignment",
    "orderSeq",
    "visible",
    "calculated",
    "colType",
    "hyperlinkURL",
    "hyperlinkType",
    "actionImg",
    "groupByPos",
    "subTotalCustomText",
    "hideRepeatedKey",
    "colFormat",
    "groupBreak",
    "orderBySeq",
    "orderByAscDesc",
    "displayTotal",
    "colOnChart",
    "chartSeq",
    "chartColor",
    "chartLineType",
    "chartSeries",
    "isRangeAxisFilled",
    "isSortable",
    "createInNewChart",
    "drillDownType",
    "drillinPoPUp",
    "drillDownURL",
    "drillDownParams",
    "comment",
    "colFilterList",
    "semaphoreId",
    "dbColType",
    "chartGroup",
    "yAxis",
    "dependsOnFormField",
    "nowrap",
    "indentation",
    "enhancedPagination",
    "level",
    "start",
    "colspan",
    "dataMiningCol"
})
public class DataColumnType {

    @XmlElement(required = true)
    protected String tableId;
    @XmlElement(required = true)
    protected String dbColName;
    protected String crossTabValue;
    @XmlElement(required = true)
    protected String colName;
    @XmlElement(required = true)
    protected String displayName;
    protected Integer displayWidth;
    protected String displayWidthInPxls;
    protected String pdfDisplayWidthInPxls;
    protected String displayAlignment;
    protected String displayHeaderAlignment;
    protected int orderSeq;
    @XmlElement(defaultValue = "true")
    protected boolean visible;
    @XmlElement(defaultValue = "false")
    protected boolean calculated;
    @XmlElement(required = true)
    protected String colType;
    @XmlElement(required = true)
    protected String hyperlinkURL;
    @XmlElement(required = true)
    protected String hyperlinkType;
    @XmlElement(required = true)
    protected String actionImg;
    protected Integer groupByPos;
    protected String subTotalCustomText;
    @XmlElement(defaultValue = "false")
    protected Boolean hideRepeatedKey;
    protected String colFormat;
    @XmlElement(defaultValue = "false")
    protected boolean groupBreak;
    protected Integer orderBySeq;
    protected String orderByAscDesc;
    protected String displayTotal;
    protected String colOnChart;
    protected Integer chartSeq;
    protected String chartColor;
    protected String chartLineType;
    @XmlElement(defaultValue = "false")
    protected Boolean chartSeries;
    @XmlElement(defaultValue = "false")
    protected Boolean isRangeAxisFilled;
    @XmlElement(defaultValue = "false")
    protected Boolean isSortable;
    @XmlElement(defaultValue = "false")
    protected Boolean createInNewChart;
    protected String drillDownType;
    @XmlElement(defaultValue = "false")
    protected Boolean drillinPoPUp;
    protected String drillDownURL;
    protected String drillDownParams;
    protected String comment;
    protected ColFilterList colFilterList;
    protected String semaphoreId;
    protected String dbColType;
    protected String chartGroup;
    protected String yAxis;
    protected String dependsOnFormField;
    protected String nowrap;
    @XmlElement(defaultValue = "0")
    protected Integer indentation;
    @XmlElement(defaultValue = "false")
    protected Boolean enhancedPagination;
    @XmlElement(defaultValue = "0")
    protected Integer level;
    @XmlElement(defaultValue = "0")
    protected Integer start;
    @XmlElement(defaultValue = "0")
    protected Integer colspan;
    protected String dataMiningCol;
    @XmlAttribute(name = "colId")
    protected String colId;

    /**
     * Gets the value of the tableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableId(String value) {
        this.tableId = value;
    }

    /**
     * Gets the value of the dbColName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbColName() {
        return dbColName;
    }

    /**
     * Sets the value of the dbColName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbColName(String value) {
        this.dbColName = value;
    }

    /**
     * Gets the value of the crossTabValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossTabValue() {
        return crossTabValue;
    }

    /**
     * Sets the value of the crossTabValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossTabValue(String value) {
        this.crossTabValue = value;
    }

    /**
     * Gets the value of the colName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColName() {
        return colName;
    }

    /**
     * Sets the value of the colName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColName(String value) {
        this.colName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayWidth(Integer value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the displayWidthInPxls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayWidthInPxls() {
        return displayWidthInPxls;
    }

    /**
     * Sets the value of the displayWidthInPxls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayWidthInPxls(String value) {
        this.displayWidthInPxls = value;
    }

    /**
     * Gets the value of the pdfDisplayWidthInPxls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfDisplayWidthInPxls() {
        return pdfDisplayWidthInPxls;
    }

    /**
     * Sets the value of the pdfDisplayWidthInPxls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfDisplayWidthInPxls(String value) {
        this.pdfDisplayWidthInPxls = value;
    }

    /**
     * Gets the value of the displayAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayAlignment() {
        return displayAlignment;
    }

    /**
     * Sets the value of the displayAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayAlignment(String value) {
        this.displayAlignment = value;
    }

    /**
     * Gets the value of the displayHeaderAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayHeaderAlignment() {
        return displayHeaderAlignment;
    }

    /**
     * Sets the value of the displayHeaderAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayHeaderAlignment(String value) {
        this.displayHeaderAlignment = value;
    }

    /**
     * Gets the value of the orderSeq property.
     * 
     */
    public int getOrderSeq() {
        return orderSeq;
    }

    /**
     * Sets the value of the orderSeq property.
     * 
     */
    public void setOrderSeq(int value) {
        this.orderSeq = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     */
    public boolean isCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     */
    public void setCalculated(boolean value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the colType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColType() {
        return colType;
    }

    /**
     * Sets the value of the colType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColType(String value) {
        this.colType = value;
    }

    /**
     * Gets the value of the hyperlinkURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperlinkURL() {
        return hyperlinkURL;
    }

    /**
     * Sets the value of the hyperlinkURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperlinkURL(String value) {
        this.hyperlinkURL = value;
    }

    /**
     * Gets the value of the hyperlinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperlinkType() {
        return hyperlinkType;
    }

    /**
     * Sets the value of the hyperlinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperlinkType(String value) {
        this.hyperlinkType = value;
    }

    /**
     * Gets the value of the actionImg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionImg() {
        return actionImg;
    }

    /**
     * Sets the value of the actionImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionImg(String value) {
        this.actionImg = value;
    }

    /**
     * Gets the value of the groupByPos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupByPos() {
        return groupByPos;
    }

    /**
     * Sets the value of the groupByPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupByPos(Integer value) {
        this.groupByPos = value;
    }

    /**
     * Gets the value of the subTotalCustomText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTotalCustomText() {
        return subTotalCustomText;
    }

    /**
     * Sets the value of the subTotalCustomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTotalCustomText(String value) {
        this.subTotalCustomText = value;
    }

    /**
     * Gets the value of the hideRepeatedKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideRepeatedKey() {
        return hideRepeatedKey;
    }

    /**
     * Sets the value of the hideRepeatedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideRepeatedKey(Boolean value) {
        this.hideRepeatedKey = value;
    }

    /**
     * Gets the value of the colFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColFormat() {
        return colFormat;
    }

    /**
     * Sets the value of the colFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColFormat(String value) {
        this.colFormat = value;
    }

    /**
     * Gets the value of the groupBreak property.
     * 
     */
    public boolean isGroupBreak() {
        return groupBreak;
    }

    /**
     * Sets the value of the groupBreak property.
     * 
     */
    public void setGroupBreak(boolean value) {
        this.groupBreak = value;
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
     * Gets the value of the orderByAscDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderByAscDesc() {
        return orderByAscDesc;
    }

    /**
     * Sets the value of the orderByAscDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderByAscDesc(String value) {
        this.orderByAscDesc = value;
    }

    /**
     * Gets the value of the displayTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTotal() {
        return displayTotal;
    }

    /**
     * Sets the value of the displayTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTotal(String value) {
        this.displayTotal = value;
    }

    /**
     * Gets the value of the colOnChart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColOnChart() {
        return colOnChart;
    }

    /**
     * Sets the value of the colOnChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColOnChart(String value) {
        this.colOnChart = value;
    }

    /**
     * Gets the value of the chartSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChartSeq() {
        return chartSeq;
    }

    /**
     * Sets the value of the chartSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChartSeq(Integer value) {
        this.chartSeq = value;
    }

    /**
     * Gets the value of the chartColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartColor() {
        return chartColor;
    }

    /**
     * Sets the value of the chartColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartColor(String value) {
        this.chartColor = value;
    }

    /**
     * Gets the value of the chartLineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartLineType() {
        return chartLineType;
    }

    /**
     * Sets the value of the chartLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartLineType(String value) {
        this.chartLineType = value;
    }

    /**
     * Gets the value of the chartSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChartSeries() {
        return chartSeries;
    }

    /**
     * Sets the value of the chartSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChartSeries(Boolean value) {
        this.chartSeries = value;
    }

    /**
     * Gets the value of the isRangeAxisFilled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRangeAxisFilled() {
        return isRangeAxisFilled;
    }

    /**
     * Sets the value of the isRangeAxisFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRangeAxisFilled(Boolean value) {
        this.isRangeAxisFilled = value;
    }

    /**
     * Gets the value of the isSortable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSortable() {
        return isSortable;
    }

    /**
     * Sets the value of the isSortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSortable(Boolean value) {
        this.isSortable = value;
    }

    /**
     * Gets the value of the createInNewChart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateInNewChart() {
        return createInNewChart;
    }

    /**
     * Sets the value of the createInNewChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateInNewChart(Boolean value) {
        this.createInNewChart = value;
    }

    /**
     * Gets the value of the drillDownType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrillDownType() {
        return drillDownType;
    }

    /**
     * Sets the value of the drillDownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrillDownType(String value) {
        this.drillDownType = value;
    }

    /**
     * Gets the value of the drillinPoPUp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrillinPoPUp() {
        return drillinPoPUp;
    }

    /**
     * Sets the value of the drillinPoPUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillinPoPUp(Boolean value) {
        this.drillinPoPUp = value;
    }

    /**
     * Gets the value of the drillDownURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrillDownURL() {
        return drillDownURL;
    }

    /**
     * Sets the value of the drillDownURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrillDownURL(String value) {
        this.drillDownURL = value;
    }

    /**
     * Gets the value of the drillDownParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrillDownParams() {
        return drillDownParams;
    }

    /**
     * Sets the value of the drillDownParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrillDownParams(String value) {
        this.drillDownParams = value;
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
     * Gets the value of the colFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link ColFilterList }
     *     
     */
    public ColFilterList getColFilterList() {
        return colFilterList;
    }

    /**
     * Sets the value of the colFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColFilterList }
     *     
     */
    public void setColFilterList(ColFilterList value) {
        this.colFilterList = value;
    }

    /**
     * Gets the value of the semaphoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemaphoreId() {
        return semaphoreId;
    }

    /**
     * Sets the value of the semaphoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemaphoreId(String value) {
        this.semaphoreId = value;
    }

    /**
     * Gets the value of the dbColType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbColType() {
        return dbColType;
    }

    /**
     * Sets the value of the dbColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbColType(String value) {
        this.dbColType = value;
    }

    /**
     * Gets the value of the chartGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartGroup() {
        return chartGroup;
    }

    /**
     * Sets the value of the chartGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartGroup(String value) {
        this.chartGroup = value;
    }

    /**
     * Gets the value of the yAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYAxis() {
        return yAxis;
    }

    /**
     * Sets the value of the yAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYAxis(String value) {
        this.yAxis = value;
    }

    /**
     * Gets the value of the dependsOnFormField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependsOnFormField() {
        return dependsOnFormField;
    }

    /**
     * Sets the value of the dependsOnFormField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependsOnFormField(String value) {
        this.dependsOnFormField = value;
    }

    /**
     * Gets the value of the nowrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNowrap() {
        return nowrap;
    }

    /**
     * Sets the value of the nowrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNowrap(String value) {
        this.nowrap = value;
    }

    /**
     * Gets the value of the indentation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndentation() {
        return indentation;
    }

    /**
     * Sets the value of the indentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndentation(Integer value) {
        this.indentation = value;
    }

    /**
     * Gets the value of the enhancedPagination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedPagination() {
        return enhancedPagination;
    }

    /**
     * Sets the value of the enhancedPagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedPagination(Boolean value) {
        this.enhancedPagination = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColspan() {
        return colspan;
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColspan(Integer value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the dataMiningCol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMiningCol() {
        return dataMiningCol;
    }

    /**
     * Sets the value of the dataMiningCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMiningCol(String value) {
        this.dataMiningCol = value;
    }

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

}