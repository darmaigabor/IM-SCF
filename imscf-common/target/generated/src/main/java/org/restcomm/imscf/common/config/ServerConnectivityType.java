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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for ServerConnectivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerConnectivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internalCommunicationAddress" type="{http://common.imscf.restcomm.org/config}ListenAddressType"/&gt;
 *         &lt;element name="administrationAddress" type="{http://common.imscf.restcomm.org/config}ListenAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerConnectivityType", propOrder = {
    "internalCommunicationAddress",
    "administrationAddress"
})
@XmlSeeAlso({
    ExecutionLayerServerConnectivityType.class
})
public class ServerConnectivityType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ListenAddressType internalCommunicationAddress;
    @XmlElement(required = true)
    protected ListenAddressType administrationAddress;

    /**
     * Gets the value of the internalCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListenAddressType }
     *     
     */
    public ListenAddressType getInternalCommunicationAddress() {
        return internalCommunicationAddress;
    }

    /**
     * Sets the value of the internalCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListenAddressType }
     *     
     */
    public void setInternalCommunicationAddress(ListenAddressType value) {
        this.internalCommunicationAddress = value;
    }

    /**
     * Gets the value of the administrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListenAddressType }
     *     
     */
    public ListenAddressType getAdministrationAddress() {
        return administrationAddress;
    }

    /**
     * Sets the value of the administrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListenAddressType }
     *     
     */
    public void setAdministrationAddress(ListenAddressType value) {
        this.administrationAddress = value;
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