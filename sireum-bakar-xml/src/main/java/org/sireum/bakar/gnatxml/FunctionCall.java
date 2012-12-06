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
 * <p>Java class for Function_Call complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function_Call">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="prefix_q" type="{}Expression_Class"/>
 *         &lt;element name="function_call_parameters_ql" type="{}Association_List"/>
 *         &lt;element name="is_prefix_call_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="is_prefix_call" type="{}Is_Prefix_Call"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="is_prefix_notation_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "Function_Call", propOrder = {
    "sloc",
    "prefixQ",
    "functionCallParametersQl",
    "isPrefixCallQ",
    "isPrefixNotationQ"
})
public class FunctionCall {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "prefix_q", required = true)
    protected ExpressionClass prefixQ;
    @XmlElement(name = "function_call_parameters_ql", required = true)
    protected AssociationList functionCallParametersQl;
    @XmlElement(name = "is_prefix_call_q", required = true)
    protected FunctionCall.IsPrefixCallQ isPrefixCallQ;
    @XmlElement(name = "is_prefix_notation_q", required = true)
    protected FunctionCall.IsPrefixNotationQ isPrefixNotationQ;
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
     * Gets the value of the prefixQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getPrefixQ() {
        return prefixQ;
    }

    /**
     * Sets the value of the prefixQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setPrefixQ(ExpressionClass value) {
        this.prefixQ = value;
    }

    /**
     * Gets the value of the functionCallParametersQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getFunctionCallParametersQl() {
        return functionCallParametersQl;
    }

    /**
     * Sets the value of the functionCallParametersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setFunctionCallParametersQl(AssociationList value) {
        this.functionCallParametersQl = value;
    }

    /**
     * Gets the value of the isPrefixCallQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionCall.IsPrefixCallQ }
     *     
     */
    public FunctionCall.IsPrefixCallQ getIsPrefixCallQ() {
        return isPrefixCallQ;
    }

    /**
     * Sets the value of the isPrefixCallQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionCall.IsPrefixCallQ }
     *     
     */
    public void setIsPrefixCallQ(FunctionCall.IsPrefixCallQ value) {
        this.isPrefixCallQ = value;
    }

    /**
     * Gets the value of the isPrefixNotationQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionCall.IsPrefixNotationQ }
     *     
     */
    public FunctionCall.IsPrefixNotationQ getIsPrefixNotationQ() {
        return isPrefixNotationQ;
    }

    /**
     * Sets the value of the isPrefixNotationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionCall.IsPrefixNotationQ }
     *     
     */
    public void setIsPrefixNotationQ(FunctionCall.IsPrefixNotationQ value) {
        this.isPrefixNotationQ = value;
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
     *         &lt;element name="is_prefix_call" type="{}Is_Prefix_Call"/>
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
        "isPrefixCall",
        "notAnElement"
    })
    public static class IsPrefixCallQ {

        @XmlElement(name = "is_prefix_call")
        protected IsPrefixCall isPrefixCall;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the isPrefixCall property.
         * 
         * @return
         *     possible object is
         *     {@link IsPrefixCall }
         *     
         */
        public IsPrefixCall getIsPrefixCall() {
            return isPrefixCall;
        }

        /**
         * Sets the value of the isPrefixCall property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsPrefixCall }
         *     
         */
        public void setIsPrefixCall(IsPrefixCall value) {
            this.isPrefixCall = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

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
     *         &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
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
        "isPrefixNotation",
        "notAnElement"
    })
    public static class IsPrefixNotationQ {

        @XmlElement(name = "is_prefix_notation")
        protected IsPrefixNotation isPrefixNotation;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the isPrefixNotation property.
         * 
         * @return
         *     possible object is
         *     {@link IsPrefixNotation }
         *     
         */
        public IsPrefixNotation getIsPrefixNotation() {
            return isPrefixNotation;
        }

        /**
         * Sets the value of the isPrefixNotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsPrefixNotation }
         *     
         */
        public void setIsPrefixNotation(IsPrefixNotation value) {
            this.isPrefixNotation = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }

}
