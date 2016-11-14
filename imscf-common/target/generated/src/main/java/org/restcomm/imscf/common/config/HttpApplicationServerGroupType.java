//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:33 PM CET 
//


package org.restcomm.imscf.common.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for HttpApplicationServerGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpApplicationServerGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectTimeoutMs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="readTimeoutMs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reenableTimeMs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="url" type="{http://common.imscf.restcomm.org/config}HttpUrlType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpApplicationServerGroupType", propOrder = {
    "connectTimeoutMs",
    "readTimeoutMs",
    "reenableTimeMs",
    "url"
})
public class HttpApplicationServerGroupType implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int connectTimeoutMs;
    protected int readTimeoutMs;
    protected int reenableTimeMs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> url;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;

    /**
     * Gets the value of the connectTimeoutMs property.
     * 
     */
    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    /**
     * Sets the value of the connectTimeoutMs property.
     * 
     */
    public void setConnectTimeoutMs(int value) {
        this.connectTimeoutMs = value;
    }

    /**
     * Gets the value of the readTimeoutMs property.
     * 
     */
    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }

    /**
     * Sets the value of the readTimeoutMs property.
     * 
     */
    public void setReadTimeoutMs(int value) {
        this.readTimeoutMs = value;
    }

    /**
     * Gets the value of the reenableTimeMs property.
     * 
     */
    public int getReenableTimeMs() {
        return reenableTimeMs;
    }

    /**
     * Sets the value of the reenableTimeMs property.
     * 
     */
    public void setReenableTimeMs(int value) {
        this.reenableTimeMs = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrl() {
        if (url == null) {
            url = new ArrayList<String>();
        }
        return this.url;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
