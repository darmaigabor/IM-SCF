//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:34 PM CET 
//


package org.restcomm.imscf.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;


/**
 * <p>Java class for CapModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="localGt" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *           &lt;element name="localSsn" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="inTriggering" type="{http://common.imscf.restcomm.org/config}InTriggeringType"/&gt;
 *         &lt;element name="generalProperties"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resetTimerSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="resetTimerUiSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="activityTestIntervalSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="asReactionTimeoutSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="maxCallLengthMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gsmScfAddress" type="{http://common.imscf.restcomm.org/config}Ss7AddressType" minOccurs="0"/&gt;
 *         &lt;element name="sipProperties" type="{http://common.imscf.restcomm.org/config}SipPropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="mediaResources"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mediaResourceWrapper" type="{http://common.imscf.restcomm.org/config}MediaResourceWrapperType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="inviteErrorHandlers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="inviteErrorHandler" type="{http://common.imscf.restcomm.org/config}InviteErrorHandlerType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "CapModuleType", propOrder = {
    "localGt",
    "localSsn",
    "inTriggering",
    "generalProperties",
    "gsmScfAddress",
    "sipProperties",
    "mediaResources",
    "inviteErrorHandlers"
})
public class CapModuleType {

    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected GtAddressType localGt;
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected SubSystemType localSsn;
    @XmlElement(required = true)
    protected InTriggeringType inTriggering;
    @XmlElement(required = true)
    protected CapModuleType.GeneralProperties generalProperties;
    protected Ss7AddressType gsmScfAddress;
    protected SipPropertiesType sipProperties;
    @XmlElementWrapper(required = true)
    @XmlElement(name = "mediaResourceWrapper", namespace = "http://common.imscf.restcomm.org/config")
    protected List<MediaResourceWrapperType> mediaResources = new ArrayList<MediaResourceWrapperType>();
    @XmlElementWrapper(required = true)
    @XmlElement(name = "inviteErrorHandler", namespace = "http://common.imscf.restcomm.org/config")
    protected List<InviteErrorHandlerType> inviteErrorHandlers = new ArrayList<InviteErrorHandlerType>();
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;

    /**
     * Gets the value of the localGt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public GtAddressType getLocalGt() {
        return localGt;
    }

    /**
     * Sets the value of the localGt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocalGt(GtAddressType value) {
        this.localGt = value;
    }

    /**
     * Gets the value of the localSsn property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public SubSystemType getLocalSsn() {
        return localSsn;
    }

    /**
     * Sets the value of the localSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocalSsn(SubSystemType value) {
        this.localSsn = value;
    }

    /**
     * Gets the value of the inTriggering property.
     * 
     * @return
     *     possible object is
     *     {@link InTriggeringType }
     *     
     */
    public InTriggeringType getInTriggering() {
        return inTriggering;
    }

    /**
     * Sets the value of the inTriggering property.
     * 
     * @param value
     *     allowed object is
     *     {@link InTriggeringType }
     *     
     */
    public void setInTriggering(InTriggeringType value) {
        this.inTriggering = value;
    }

    /**
     * Gets the value of the generalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CapModuleType.GeneralProperties }
     *     
     */
    public CapModuleType.GeneralProperties getGeneralProperties() {
        return generalProperties;
    }

    /**
     * Sets the value of the generalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapModuleType.GeneralProperties }
     *     
     */
    public void setGeneralProperties(CapModuleType.GeneralProperties value) {
        this.generalProperties = value;
    }

    /**
     * Gets the value of the gsmScfAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Ss7AddressType }
     *     
     */
    public Ss7AddressType getGsmScfAddress() {
        return gsmScfAddress;
    }

    /**
     * Sets the value of the gsmScfAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ss7AddressType }
     *     
     */
    public void setGsmScfAddress(Ss7AddressType value) {
        this.gsmScfAddress = value;
    }

    /**
     * Gets the value of the sipProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SipPropertiesType }
     *     
     */
    public SipPropertiesType getSipProperties() {
        return sipProperties;
    }

    /**
     * Sets the value of the sipProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SipPropertiesType }
     *     
     */
    public void setSipProperties(SipPropertiesType value) {
        this.sipProperties = value;
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

    public List<MediaResourceWrapperType> getMediaResources() {
        return mediaResources;
    }

    public void setMediaResources(List<MediaResourceWrapperType> mediaResources) {
        this.mediaResources = mediaResources;
    }

    public List<InviteErrorHandlerType> getInviteErrorHandlers() {
        return inviteErrorHandlers;
    }

    public void setInviteErrorHandlers(List<InviteErrorHandlerType> inviteErrorHandlers) {
        this.inviteErrorHandlers = inviteErrorHandlers;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="resetTimerSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="resetTimerUiSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="activityTestIntervalSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="asReactionTimeoutSec" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="maxCallLengthMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resetTimerSec",
        "resetTimerUiSec",
        "activityTestIntervalSec",
        "asReactionTimeoutSec",
        "maxCallLengthMinutes"
    })
    public static class GeneralProperties {

        protected int resetTimerSec;
        protected int resetTimerUiSec;
        protected int activityTestIntervalSec;
        protected int asReactionTimeoutSec;
        protected int maxCallLengthMinutes;

        /**
         * Gets the value of the resetTimerSec property.
         * 
         */
        public int getResetTimerSec() {
            return resetTimerSec;
        }

        /**
         * Sets the value of the resetTimerSec property.
         * 
         */
        public void setResetTimerSec(int value) {
            this.resetTimerSec = value;
        }

        /**
         * Gets the value of the resetTimerUiSec property.
         * 
         */
        public int getResetTimerUiSec() {
            return resetTimerUiSec;
        }

        /**
         * Sets the value of the resetTimerUiSec property.
         * 
         */
        public void setResetTimerUiSec(int value) {
            this.resetTimerUiSec = value;
        }

        /**
         * Gets the value of the activityTestIntervalSec property.
         * 
         */
        public int getActivityTestIntervalSec() {
            return activityTestIntervalSec;
        }

        /**
         * Sets the value of the activityTestIntervalSec property.
         * 
         */
        public void setActivityTestIntervalSec(int value) {
            this.activityTestIntervalSec = value;
        }

        /**
         * Gets the value of the asReactionTimeoutSec property.
         * 
         */
        public int getAsReactionTimeoutSec() {
            return asReactionTimeoutSec;
        }

        /**
         * Sets the value of the asReactionTimeoutSec property.
         * 
         */
        public void setAsReactionTimeoutSec(int value) {
            this.asReactionTimeoutSec = value;
        }

        /**
         * Gets the value of the maxCallLengthMinutes property.
         * 
         */
        public int getMaxCallLengthMinutes() {
            return maxCallLengthMinutes;
        }

        /**
         * Sets the value of the maxCallLengthMinutes property.
         * 
         */
        public void setMaxCallLengthMinutes(int value) {
            this.maxCallLengthMinutes = value;
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

}
