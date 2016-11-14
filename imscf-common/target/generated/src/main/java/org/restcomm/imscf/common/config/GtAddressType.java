//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:33 PM CET 
//


package org.restcomm.imscf.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for GtAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GtAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globalTitle" type="{http://common.imscf.restcomm.org/config}GlobalTitleType"/&gt;
 *         &lt;element name="subSystemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gtIndicator" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="gtNoa" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="gtNumberingPlan" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="gtTranslationType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtAddressType", propOrder = {
    "globalTitle",
    "subSystemNumber",
    "gtIndicator",
    "gtNoa",
    "gtNumberingPlan",
    "gtTranslationType"
})
@XmlSeeAlso({
    RemoteGtAddressType.class
})
public class GtAddressType {

    @XmlElement(required = true)
    protected String globalTitle;
    protected int subSystemNumber;
    @XmlElement(defaultValue = "4")
    @XmlSchemaType(name = "unsignedShort")
    protected int gtIndicator;
    @XmlElement(defaultValue = "4")
    @XmlSchemaType(name = "unsignedShort")
    protected int gtNoa;
    @XmlElement(defaultValue = "1")
    @XmlSchemaType(name = "unsignedShort")
    protected int gtNumberingPlan;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedShort")
    protected int gtTranslationType;
    @XmlAttribute(name = "alias", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String alias;

    /**
     * Gets the value of the globalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTitle() {
        return globalTitle;
    }

    /**
     * Sets the value of the globalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTitle(String value) {
        this.globalTitle = value;
    }

    /**
     * Gets the value of the subSystemNumber property.
     * 
     */
    public int getSubSystemNumber() {
        return subSystemNumber;
    }

    /**
     * Sets the value of the subSystemNumber property.
     * 
     */
    public void setSubSystemNumber(int value) {
        this.subSystemNumber = value;
    }

    /**
     * Gets the value of the gtIndicator property.
     * 
     */
    public int getGtIndicator() {
        return gtIndicator;
    }

    /**
     * Sets the value of the gtIndicator property.
     * 
     */
    public void setGtIndicator(int value) {
        this.gtIndicator = value;
    }

    /**
     * Gets the value of the gtNoa property.
     * 
     */
    public int getGtNoa() {
        return gtNoa;
    }

    /**
     * Sets the value of the gtNoa property.
     * 
     */
    public void setGtNoa(int value) {
        this.gtNoa = value;
    }

    /**
     * Gets the value of the gtNumberingPlan property.
     * 
     */
    public int getGtNumberingPlan() {
        return gtNumberingPlan;
    }

    /**
     * Sets the value of the gtNumberingPlan property.
     * 
     */
    public void setGtNumberingPlan(int value) {
        this.gtNumberingPlan = value;
    }

    /**
     * Gets the value of the gtTranslationType property.
     * 
     */
    public int getGtTranslationType() {
        return gtTranslationType;
    }

    /**
     * Sets the value of the gtTranslationType property.
     * 
     */
    public void setGtTranslationType(int value) {
        this.gtTranslationType = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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
