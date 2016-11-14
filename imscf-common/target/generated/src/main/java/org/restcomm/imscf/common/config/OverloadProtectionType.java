//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:33 PM CET 
//


package org.restcomm.imscf.common.config;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for OverloadProtectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverloadProtectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cpuOverloadThresholdPercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cpuMeasurementWindow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dataCollectionPeriodSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heapOverloadThresholdPercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="nonHeapOverloadThresholdPercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;element name="nonHeapOverloadThresholdAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverloadProtectionType", propOrder = {
    "enabled",
    "cpuOverloadThresholdPercent",
    "cpuMeasurementWindow",
    "dataCollectionPeriodSec",
    "heapOverloadThresholdPercent",
    "nonHeapOverloadThresholdPercent",
    "nonHeapOverloadThresholdAmount"
})
public class OverloadProtectionType implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean enabled;
    protected int cpuOverloadThresholdPercent;
    protected int cpuMeasurementWindow;
    protected int dataCollectionPeriodSec;
    protected int heapOverloadThresholdPercent;
    protected Integer nonHeapOverloadThresholdPercent;
    protected Integer nonHeapOverloadThresholdAmount;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the cpuOverloadThresholdPercent property.
     * 
     */
    public int getCpuOverloadThresholdPercent() {
        return cpuOverloadThresholdPercent;
    }

    /**
     * Sets the value of the cpuOverloadThresholdPercent property.
     * 
     */
    public void setCpuOverloadThresholdPercent(int value) {
        this.cpuOverloadThresholdPercent = value;
    }

    /**
     * Gets the value of the cpuMeasurementWindow property.
     * 
     */
    public int getCpuMeasurementWindow() {
        return cpuMeasurementWindow;
    }

    /**
     * Sets the value of the cpuMeasurementWindow property.
     * 
     */
    public void setCpuMeasurementWindow(int value) {
        this.cpuMeasurementWindow = value;
    }

    /**
     * Gets the value of the dataCollectionPeriodSec property.
     * 
     */
    public int getDataCollectionPeriodSec() {
        return dataCollectionPeriodSec;
    }

    /**
     * Sets the value of the dataCollectionPeriodSec property.
     * 
     */
    public void setDataCollectionPeriodSec(int value) {
        this.dataCollectionPeriodSec = value;
    }

    /**
     * Gets the value of the heapOverloadThresholdPercent property.
     * 
     */
    public int getHeapOverloadThresholdPercent() {
        return heapOverloadThresholdPercent;
    }

    /**
     * Sets the value of the heapOverloadThresholdPercent property.
     * 
     */
    public void setHeapOverloadThresholdPercent(int value) {
        this.heapOverloadThresholdPercent = value;
    }

    /**
     * Gets the value of the nonHeapOverloadThresholdPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonHeapOverloadThresholdPercent() {
        return nonHeapOverloadThresholdPercent;
    }

    /**
     * Sets the value of the nonHeapOverloadThresholdPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonHeapOverloadThresholdPercent(Integer value) {
        this.nonHeapOverloadThresholdPercent = value;
    }

    /**
     * Gets the value of the nonHeapOverloadThresholdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonHeapOverloadThresholdAmount() {
        return nonHeapOverloadThresholdAmount;
    }

    /**
     * Sets the value of the nonHeapOverloadThresholdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonHeapOverloadThresholdAmount(Integer value) {
        this.nonHeapOverloadThresholdAmount = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
