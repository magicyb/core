//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:58:19 AM CST 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discriminant_Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discriminant_Association">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="discriminant_selector_names_ql" type="{}Expression_List"/>
 *         &lt;element name="discriminant_expression_q" type="{}Expression_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discriminant_Association", propOrder = {
    "sloc",
    "discriminantSelectorNamesQl",
    "discriminantExpressionQ"
})
public class DiscriminantAssociation {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "discriminant_selector_names_ql", required = true)
    protected ExpressionList discriminantSelectorNamesQl;
    @XmlElement(name = "discriminant_expression_q", required = true)
    protected ExpressionClass discriminantExpressionQ;

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
     * Gets the value of the discriminantSelectorNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getDiscriminantSelectorNamesQl() {
        return discriminantSelectorNamesQl;
    }

    /**
     * Sets the value of the discriminantSelectorNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setDiscriminantSelectorNamesQl(ExpressionList value) {
        this.discriminantSelectorNamesQl = value;
    }

    /**
     * Gets the value of the discriminantExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getDiscriminantExpressionQ() {
        return discriminantExpressionQ;
    }

    /**
     * Sets the value of the discriminantExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setDiscriminantExpressionQ(ExpressionClass value) {
        this.discriminantExpressionQ = value;
    }

}
