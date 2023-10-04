//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.05 at 12:30:58 AM CEST 
//


package se.javajive.juniorleague.adapters.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CCardId"/&gt;
 *         &lt;element ref="{}PunchingUnitType"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
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
    "cCardId",
    "punchingUnitType",
    "modifyDate",
    "modifiedBy"
})
@XmlRootElement(name = "CCard")
public class CCard {

    @XmlElement(name = "CCardId", required = true)
    protected CCardId cCardId;
    @XmlElement(name = "PunchingUnitType", required = true)
    protected PunchingUnitType punchingUnitType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;

    /**
     * Gets the value of the cCardId property.
     * 
     * @return
     *     possible object is
     *     {@link CCardId }
     *     
     */
    public CCardId getCCardId() {
        return cCardId;
    }

    /**
     * Sets the value of the cCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCardId }
     *     
     */
    public void setCCardId(CCardId value) {
        this.cCardId = value;
    }

    /**
     * Gets the value of the punchingUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link PunchingUnitType }
     *     
     */
    public PunchingUnitType getPunchingUnitType() {
        return punchingUnitType;
    }

    /**
     * Sets the value of the punchingUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchingUnitType }
     *     
     */
    public void setPunchingUnitType(PunchingUnitType value) {
        this.punchingUnitType = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyDate }
     *     
     */
    public ModifyDate getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyDate }
     *     
     */
    public void setModifyDate(ModifyDate value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ModifiedBy }
     *     
     */
    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifiedBy }
     *     
     */
    public void setModifiedBy(ModifiedBy value) {
        this.modifiedBy = value;
    }

}
