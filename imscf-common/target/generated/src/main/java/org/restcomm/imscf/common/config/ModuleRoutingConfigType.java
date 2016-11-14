//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 11:44:58 AM CET 
//


package org.restcomm.imscf.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for ModuleRoutingConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleRoutingConfigType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routingCriterias"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="routingCriteria" type="{http://common.imscf.restcomm.org/config}RoutingCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="capModule" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *           &lt;element name="mapModule" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
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
@XmlType(name = "ModuleRoutingConfigType", propOrder = {
    "routingCriterias",
    "capModule",
    "mapModule"
})
public class ModuleRoutingConfigType {

    @XmlElementWrapper(required = true)
    @XmlElement(name = "routingCriteria", namespace = "http://common.imscf.restcomm.org/config")
    protected List<RoutingCriteriaType> routingCriterias = new ArrayList<RoutingCriteriaType>();
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected CapModuleType capModule;
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected MapModuleType mapModule;

    /**
     * Gets the value of the capModule property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public CapModuleType getCapModule() {
        return capModule;
    }

    /**
     * Sets the value of the capModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCapModule(CapModuleType value) {
        this.capModule = value;
    }

    /**
     * Gets the value of the mapModule property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public MapModuleType getMapModule() {
        return mapModule;
    }

    /**
     * Sets the value of the mapModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMapModule(MapModuleType value) {
        this.mapModule = value;
    }

    public List<RoutingCriteriaType> getRoutingCriterias() {
        return routingCriterias;
    }

    public void setRoutingCriterias(List<RoutingCriteriaType> routingCriterias) {
        this.routingCriterias = routingCriterias;
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