//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:33 PM CET 
//


package org.restcomm.imscf.common.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapCounterNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MapCounterNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyTimeInterrogationCount"/&gt;
 *     &lt;enumeration value="anyTimeInterrogationResultCount"/&gt;
 *     &lt;enumeration value="tcapReceivedCount"/&gt;
 *     &lt;enumeration value="tcapBeginReceivedCount"/&gt;
 *     &lt;enumeration value="tcapContinueReceivedCount"/&gt;
 *     &lt;enumeration value="tcapEndReceivedCount"/&gt;
 *     &lt;enumeration value="tcapAbortReceivedCount"/&gt;
 *     &lt;enumeration value="tcapSentCount"/&gt;
 *     &lt;enumeration value="tcapBeginSentCount"/&gt;
 *     &lt;enumeration value="tcapContinueSentCount"/&gt;
 *     &lt;enumeration value="tcapEndSentCount"/&gt;
 *     &lt;enumeration value="tcapAbortSentCount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapCounterNameType")
@XmlEnum
public enum MapCounterNameType {

    @XmlEnumValue("anyTimeInterrogationCount")
    ANY_TIME_INTERROGATION_COUNT("anyTimeInterrogationCount"),
    @XmlEnumValue("anyTimeInterrogationResultCount")
    ANY_TIME_INTERROGATION_RESULT_COUNT("anyTimeInterrogationResultCount"),
    @XmlEnumValue("tcapReceivedCount")
    TCAP_RECEIVED_COUNT("tcapReceivedCount"),
    @XmlEnumValue("tcapBeginReceivedCount")
    TCAP_BEGIN_RECEIVED_COUNT("tcapBeginReceivedCount"),
    @XmlEnumValue("tcapContinueReceivedCount")
    TCAP_CONTINUE_RECEIVED_COUNT("tcapContinueReceivedCount"),
    @XmlEnumValue("tcapEndReceivedCount")
    TCAP_END_RECEIVED_COUNT("tcapEndReceivedCount"),
    @XmlEnumValue("tcapAbortReceivedCount")
    TCAP_ABORT_RECEIVED_COUNT("tcapAbortReceivedCount"),
    @XmlEnumValue("tcapSentCount")
    TCAP_SENT_COUNT("tcapSentCount"),
    @XmlEnumValue("tcapBeginSentCount")
    TCAP_BEGIN_SENT_COUNT("tcapBeginSentCount"),
    @XmlEnumValue("tcapContinueSentCount")
    TCAP_CONTINUE_SENT_COUNT("tcapContinueSentCount"),
    @XmlEnumValue("tcapEndSentCount")
    TCAP_END_SENT_COUNT("tcapEndSentCount"),
    @XmlEnumValue("tcapAbortSentCount")
    TCAP_ABORT_SENT_COUNT("tcapAbortSentCount");
    private final String value;

    MapCounterNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapCounterNameType fromValue(String v) {
        for (MapCounterNameType c: MapCounterNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
