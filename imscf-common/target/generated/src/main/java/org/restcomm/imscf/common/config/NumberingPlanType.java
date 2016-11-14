//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:07:34 PM CET 
//


package org.restcomm.imscf.common.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberingPlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NumberingPlanType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISDN"/&gt;
 *     &lt;enumeration value="data"/&gt;
 *     &lt;enumeration value="telex"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NumberingPlanType")
@XmlEnum
public enum NumberingPlanType {

    ISDN("ISDN"),
    @XmlEnumValue("data")
    DATA("data"),
    @XmlEnumValue("telex")
    TELEX("telex");
    private final String value;

    NumberingPlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumberingPlanType fromValue(String v) {
        for (NumberingPlanType c: NumberingPlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
