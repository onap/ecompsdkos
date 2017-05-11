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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFAdditionalOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFAdditionalOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDF_font" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_fontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PDF_orientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_logo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_logo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_logo1Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PDF_logo2Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PDF_coverPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PDF_footer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_footer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFAdditionalOptions", propOrder = {
    "pdfFont",
    "pdfFontSize",
    "pdfOrientation",
    "pdfLogo1",
    "pdfLogo2",
    "pdfLogo1Size",
    "pdfLogo2Size",
    "pdfCoverPage",
    "pdfFooter1",
    "pdfFooter2"
})
public class PDFAdditionalOptions {

    @XmlElement(name = "PDF_font")
    protected String pdfFont;
    @XmlElement(name = "PDF_fontSize")
    protected Integer pdfFontSize;
    @XmlElement(name = "PDF_orientation")
    protected String pdfOrientation;
    @XmlElement(name = "PDF_logo1")
    protected String pdfLogo1;
    @XmlElement(name = "PDF_logo2")
    protected String pdfLogo2;
    @XmlElement(name = "PDF_logo1Size")
    protected Integer pdfLogo1Size;
    @XmlElement(name = "PDF_logo2Size")
    protected Integer pdfLogo2Size;
    @XmlElement(name = "PDF_coverPage", defaultValue = "false")
    protected Boolean pdfCoverPage;
    @XmlElement(name = "PDF_footer1")
    protected String pdfFooter1;
    @XmlElement(name = "PDF_footer2")
    protected String pdfFooter2;

    /**
     * Gets the value of the pdfFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFFont() {
        return pdfFont;
    }

    /**
     * Sets the value of the pdfFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFFont(String value) {
        this.pdfFont = value;
    }

    /**
     * Gets the value of the pdfFontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDFFontSize() {
        return pdfFontSize;
    }

    /**
     * Sets the value of the pdfFontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDFFontSize(Integer value) {
        this.pdfFontSize = value;
    }

    /**
     * Gets the value of the pdfOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFOrientation() {
        return pdfOrientation;
    }

    /**
     * Sets the value of the pdfOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFOrientation(String value) {
        this.pdfOrientation = value;
    }

    /**
     * Gets the value of the pdfLogo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFLogo1() {
        return pdfLogo1;
    }

    /**
     * Sets the value of the pdfLogo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFLogo1(String value) {
        this.pdfLogo1 = value;
    }

    /**
     * Gets the value of the pdfLogo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFLogo2() {
        return pdfLogo2;
    }

    /**
     * Sets the value of the pdfLogo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFLogo2(String value) {
        this.pdfLogo2 = value;
    }

    /**
     * Gets the value of the pdfLogo1Size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDFLogo1Size() {
        return pdfLogo1Size;
    }

    /**
     * Sets the value of the pdfLogo1Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDFLogo1Size(Integer value) {
        this.pdfLogo1Size = value;
    }

    /**
     * Gets the value of the pdfLogo2Size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDFLogo2Size() {
        return pdfLogo2Size;
    }

    /**
     * Sets the value of the pdfLogo2Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDFLogo2Size(Integer value) {
        this.pdfLogo2Size = value;
    }

    /**
     * Gets the value of the pdfCoverPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPDFCoverPage() {
        return pdfCoverPage;
    }

    /**
     * Sets the value of the pdfCoverPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPDFCoverPage(Boolean value) {
        this.pdfCoverPage = value;
    }

    /**
     * Gets the value of the pdfFooter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFFooter1() {
        return pdfFooter1;
    }

    /**
     * Sets the value of the pdfFooter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFFooter1(String value) {
        this.pdfFooter1 = value;
    }

    /**
     * Gets the value of the pdfFooter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFFooter2() {
        return pdfFooter2;
    }

    /**
     * Sets the value of the pdfFooter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFFooter2(String value) {
        this.pdfFooter2 = value;
    }

}
