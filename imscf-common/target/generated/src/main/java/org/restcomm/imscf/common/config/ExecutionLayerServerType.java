//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 11:44:58 AM CET 
//


package org.restcomm.imscf.common.config;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for ExecutionLayerServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionLayerServerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.imscf.restcomm.org/config}AbstractServerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectivity" type="{http://common.imscf.restcomm.org/config}ExecutionLayerServerConnectivityType"/&gt;
 *         &lt;element name="tcapTransactionIdRange" type="{http://common.imscf.restcomm.org/config}TcapTransactionIdRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionLayerServerType", propOrder = {
    "connectivity",
    "tcapTransactionIdRange"
})
public class ExecutionLayerServerType
    extends AbstractServerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ExecutionLayerServerConnectivityType connectivity;
    protected TcapTransactionIdRangeType tcapTransactionIdRange;

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionLayerServerConnectivityType }
     *     
     */
    public ExecutionLayerServerConnectivityType getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionLayerServerConnectivityType }
     *     
     */
    public void setConnectivity(ExecutionLayerServerConnectivityType value) {
        this.connectivity = value;
    }

    /**
     * Gets the value of the tcapTransactionIdRange property.
     * 
     * @return
     *     possible object is
     *     {@link TcapTransactionIdRangeType }
     *     
     */
    public TcapTransactionIdRangeType getTcapTransactionIdRange() {
        return tcapTransactionIdRange;
    }

    /**
     * Sets the value of the tcapTransactionIdRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcapTransactionIdRangeType }
     *     
     */
    public void setTcapTransactionIdRange(TcapTransactionIdRangeType value) {
        this.tcapTransactionIdRange = value;
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