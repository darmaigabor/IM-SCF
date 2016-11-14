//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:33 PM CET 
//


package org.restcomm.imscf.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for SctpAssociationLocalSideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SctpAssociationLocalSideType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sigtranIp1" type="{http://common.imscf.restcomm.org/config}Ipv4AddressType"/&gt;
 *         &lt;element name="sigtranIp2" type="{http://common.imscf.restcomm.org/config}Ipv4AddressType" minOccurs="0"/&gt;
 *         &lt;element name="port" type="{http://common.imscf.restcomm.org/config}PortType"/&gt;
 *         &lt;element name="side"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="client"/&gt;
 *               &lt;enumeration value="server"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="m3uaProfile" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *           &lt;element name="sctpAssociationRemoteSideProfile" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
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
@XmlType(name = "SctpAssociationLocalSideType", propOrder = {
    "sigtranIp1",
    "sigtranIp2",
    "port",
    "side",
    "m3UaProfile",
    "sctpAssociationRemoteSideProfile"
})
public class SctpAssociationLocalSideType {

    @XmlElement(required = true)
    protected String sigtranIp1;
    protected String sigtranIp2;
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    @XmlElement(required = true)
    protected String side;
    @XmlElement(name = "m3uaProfile", type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected M3UaProfileType m3UaProfile;
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected SctpAssociationRemoteSideProfileType sctpAssociationRemoteSideProfile;

    /**
     * Gets the value of the sigtranIp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigtranIp1() {
        return sigtranIp1;
    }

    /**
     * Sets the value of the sigtranIp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigtranIp1(String value) {
        this.sigtranIp1 = value;
    }

    /**
     * Gets the value of the sigtranIp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigtranIp2() {
        return sigtranIp2;
    }

    /**
     * Sets the value of the sigtranIp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigtranIp2(String value) {
        this.sigtranIp2 = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the m3UaProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public M3UaProfileType getM3UaProfile() {
        return m3UaProfile;
    }

    /**
     * Sets the value of the m3UaProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setM3UaProfile(M3UaProfileType value) {
        this.m3UaProfile = value;
    }

    /**
     * Gets the value of the sctpAssociationRemoteSideProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public SctpAssociationRemoteSideProfileType getSctpAssociationRemoteSideProfile() {
        return sctpAssociationRemoteSideProfile;
    }

    /**
     * Sets the value of the sctpAssociationRemoteSideProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSctpAssociationRemoteSideProfile(SctpAssociationRemoteSideProfileType value) {
        this.sctpAssociationRemoteSideProfile = value;
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
