//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.05 at 12:30:58 AM CEST 
//


package se.javajive.juniorleague.adapters.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}BaseClassId"/&gt;
 *         &lt;element ref="{}ClassShortName"/&gt;
 *         &lt;element ref="{}BaseClass"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseClassId",
    "classShortName",
    "baseClass"
})
@XmlRootElement(name = "PreSelectedClass")
public class PreSelectedClass {

    @XmlElement(name = "BaseClassId")
    protected BaseClassId baseClassId;
    @XmlElement(name = "ClassShortName")
    protected ClassShortName classShortName;
    @XmlElement(name = "BaseClass")
    protected BaseClass baseClass;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;

    /**
     * Gets the value of the baseClassId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseClassId }
     *     
     */
    public BaseClassId getBaseClassId() {
        return baseClassId;
    }

    /**
     * Sets the value of the baseClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseClassId }
     *     
     */
    public void setBaseClassId(BaseClassId value) {
        this.baseClassId = value;
    }

    /**
     * Gets the value of the classShortName property.
     * 
     * @return
     *     possible object is
     *     {@link ClassShortName }
     *     
     */
    public ClassShortName getClassShortName() {
        return classShortName;
    }

    /**
     * Sets the value of the classShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassShortName }
     *     
     */
    public void setClassShortName(ClassShortName value) {
        this.classShortName = value;
    }

    /**
     * Gets the value of the baseClass property.
     * 
     * @return
     *     possible object is
     *     {@link BaseClass }
     *     
     */
    public BaseClass getBaseClass() {
        return baseClass;
    }

    /**
     * Sets the value of the baseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseClass }
     *     
     */
    public void setBaseClass(BaseClass value) {
        this.baseClass = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}