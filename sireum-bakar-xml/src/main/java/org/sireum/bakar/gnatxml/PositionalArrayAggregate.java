//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:58:19 AM CST 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Positional_Array_Aggregate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Positional_Array_Aggregate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="array_component_associations_ql" type="{}Association_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Positional_Array_Aggregate", propOrder = {
    "sloc",
    "arrayComponentAssociationsQl"
})
public class PositionalArrayAggregate {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "array_component_associations_ql", required = true)
    protected AssociationList arrayComponentAssociationsQl;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the arrayComponentAssociationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getArrayComponentAssociationsQl() {
        return arrayComponentAssociationsQl;
    }

    /**
     * Sets the value of the arrayComponentAssociationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setArrayComponentAssociationsQl(AssociationList value) {
        this.arrayComponentAssociationsQl = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
