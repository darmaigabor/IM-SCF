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
 * <p>Java class for NetworkIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="nationalExtension"/&gt;
 *     &lt;enumeration value="international"/&gt;
 *     &lt;enumeration value="internationalExtension"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkIndicatorType")
@XmlEnum
public enum NetworkIndicatorType {

    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("nationalExtension")
    NATIONAL_EXTENSION("nationalExtension"),
    @XmlEnumValue("international")
    INTERNATIONAL("international"),
    @XmlEnumValue("internationalExtension")
    INTERNATIONAL_EXTENSION("internationalExtension");
    private final String value;

    NetworkIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkIndicatorType fromValue(String v) {
        for (NetworkIndicatorType c: NetworkIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}