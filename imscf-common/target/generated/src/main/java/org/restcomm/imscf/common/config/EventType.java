//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 11:44:59 AM CET 
//


package org.restcomm.imscf.common.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="routeSelectFailure"/&gt;
 *     &lt;enumeration value="oCalledPartyBusy"/&gt;
 *     &lt;enumeration value="oNoAnswer"/&gt;
 *     &lt;enumeration value="oAnswer"/&gt;
 *     &lt;enumeration value="oMidCall"/&gt;
 *     &lt;enumeration value="oDisconnect"/&gt;
 *     &lt;enumeration value="oDisconnectLeg1"/&gt;
 *     &lt;enumeration value="oDisconnectLeg2"/&gt;
 *     &lt;enumeration value="oAbandon"/&gt;
 *     &lt;enumeration value="tBusy"/&gt;
 *     &lt;enumeration value="tNoAnswer"/&gt;
 *     &lt;enumeration value="tAnswer"/&gt;
 *     &lt;enumeration value="tMidCall"/&gt;
 *     &lt;enumeration value="tDisconnect"/&gt;
 *     &lt;enumeration value="tDisconnectLeg1"/&gt;
 *     &lt;enumeration value="tDisconnectLeg2"/&gt;
 *     &lt;enumeration value="tAbandon"/&gt;
 *     &lt;enumeration value="oTermSeized"/&gt;
 *     &lt;enumeration value="callAccepted"/&gt;
 *     &lt;enumeration value="oSmsFailure"/&gt;
 *     &lt;enumeration value="oSmsSubmission"/&gt;
 *     &lt;enumeration value="tSmsFailure"/&gt;
 *     &lt;enumeration value="tSmsSubmission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    @XmlEnumValue("routeSelectFailure")
    ROUTE_SELECT_FAILURE("routeSelectFailure"),
    @XmlEnumValue("oCalledPartyBusy")
    O_CALLED_PARTY_BUSY("oCalledPartyBusy"),
    @XmlEnumValue("oNoAnswer")
    O_NO_ANSWER("oNoAnswer"),
    @XmlEnumValue("oAnswer")
    O_ANSWER("oAnswer"),
    @XmlEnumValue("oMidCall")
    O_MID_CALL("oMidCall"),
    @XmlEnumValue("oDisconnect")
    O_DISCONNECT("oDisconnect"),
    @XmlEnumValue("oDisconnectLeg1")
    O_DISCONNECT_LEG_1("oDisconnectLeg1"),
    @XmlEnumValue("oDisconnectLeg2")
    O_DISCONNECT_LEG_2("oDisconnectLeg2"),
    @XmlEnumValue("oAbandon")
    O_ABANDON("oAbandon"),
    @XmlEnumValue("tBusy")
    T_BUSY("tBusy"),
    @XmlEnumValue("tNoAnswer")
    T_NO_ANSWER("tNoAnswer"),
    @XmlEnumValue("tAnswer")
    T_ANSWER("tAnswer"),
    @XmlEnumValue("tMidCall")
    T_MID_CALL("tMidCall"),
    @XmlEnumValue("tDisconnect")
    T_DISCONNECT("tDisconnect"),
    @XmlEnumValue("tDisconnectLeg1")
    T_DISCONNECT_LEG_1("tDisconnectLeg1"),
    @XmlEnumValue("tDisconnectLeg2")
    T_DISCONNECT_LEG_2("tDisconnectLeg2"),
    @XmlEnumValue("tAbandon")
    T_ABANDON("tAbandon"),
    @XmlEnumValue("oTermSeized")
    O_TERM_SEIZED("oTermSeized"),
    @XmlEnumValue("callAccepted")
    CALL_ACCEPTED("callAccepted"),
    @XmlEnumValue("oSmsFailure")
    O_SMS_FAILURE("oSmsFailure"),
    @XmlEnumValue("oSmsSubmission")
    O_SMS_SUBMISSION("oSmsSubmission"),
    @XmlEnumValue("tSmsFailure")
    T_SMS_FAILURE("tSmsFailure"),
    @XmlEnumValue("tSmsSubmission")
    T_SMS_SUBMISSION("tSmsSubmission");
    private final String value;

    EventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}