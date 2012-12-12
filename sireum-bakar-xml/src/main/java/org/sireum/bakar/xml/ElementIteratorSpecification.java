//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Element_Iterator_Specification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element_Iterator_Specification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="subtype_indication_q" type="{}Element_Class"/>
 *         &lt;element name="has_reverse_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="reverse" type="{}Reverse"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="iteration_scheme_name_q" type="{}Element_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element_Iterator_Specification", propOrder = {
    "sloc",
    "namesQl",
    "subtypeIndicationQ",
    "hasReverseQ",
    "iterationSchemeNameQ"
})
public class ElementIteratorSpecification {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "subtype_indication_q", required = true)
    protected ElementClass subtypeIndicationQ;
    @XmlElement(name = "has_reverse_q", required = true)
    protected ElementIteratorSpecification.HasReverseQ hasReverseQ;
    @XmlElement(name = "iteration_scheme_name_q", required = true)
    protected ElementClass iterationSchemeNameQ;

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
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the subtypeIndicationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getSubtypeIndicationQ() {
        return subtypeIndicationQ;
    }

    /**
     * Sets the value of the subtypeIndicationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setSubtypeIndicationQ(ElementClass value) {
        this.subtypeIndicationQ = value;
    }

    /**
     * Gets the value of the hasReverseQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementIteratorSpecification.HasReverseQ }
     *     
     */
    public ElementIteratorSpecification.HasReverseQ getHasReverseQ() {
        return hasReverseQ;
    }

    /**
     * Sets the value of the hasReverseQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementIteratorSpecification.HasReverseQ }
     *     
     */
    public void setHasReverseQ(ElementIteratorSpecification.HasReverseQ value) {
        this.hasReverseQ = value;
    }

    /**
     * Gets the value of the iterationSchemeNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getIterationSchemeNameQ() {
        return iterationSchemeNameQ;
    }

    /**
     * Sets the value of the iterationSchemeNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setIterationSchemeNameQ(ElementClass value) {
        this.iterationSchemeNameQ = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="reverse" type="{}Reverse"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasReverse"
    })
    public static class HasReverseQ {

        @XmlElements({
            @XmlElement(name = "reverse", type = Reverse.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Object hasReverse;

        /**
         * Gets the value of the hasReverse property.
         * 
         * @return
         *     possible object is
         *     {@link Reverse }
         *     {@link NotAnElement }
         *     
         */
        public Object getHasReverse() {
            return hasReverse;
        }

        /**
         * Sets the value of the hasReverse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reverse }
         *     {@link NotAnElement }
         *     
         */
        public void setHasReverse(Object value) {
            this.hasReverse = value;
        }

    }

}