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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;


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
 *         &lt;element ref="{}EntryFeeId" minOccurs="0"/&gt;
 *         &lt;element ref="{}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{}Amount"/&gt;
 *         &lt;element ref="{}PaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{}ExternalFee" minOccurs="0"/&gt;
 *         &lt;element ref="{}ValidFromDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ValidToDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}FromDateOfBirth" minOccurs="0"/&gt;
 *         &lt;element ref="{}ToDateOfBirth" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
 *         &lt;element name="EntryFeeGroupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="taxIncluded" default="Y"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="Y"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="valueOperator" default="fixed"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="fixed"/&gt;
 *             &lt;enumeration value="percent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="entryFeeType" default="notSpecified"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="elite"/&gt;
 *             &lt;enumeration value="adult"/&gt;
 *             &lt;enumeration value="youth"/&gt;
 *             &lt;enumeration value="notSpecified"/&gt;
 *             &lt;enumeration value="Imported"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entryFeeId",
    "name",
    "amount",
    "paidAmount",
    "externalFee",
    "validFromDate",
    "validToDate",
    "fromDateOfBirth",
    "toDateOfBirth",
    "modifyDate",
    "modifiedBy",
    "entryFeeGroupId"
})
@XmlRootElement(name = "EntryFee")
public class EntryFee {

    @XmlElement(name = "EntryFeeId")
    protected EntryFeeId entryFeeId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlElement(name = "PaidAmount")
    protected PaidAmount paidAmount;
    @XmlElement(name = "ExternalFee")
    protected ExternalFee externalFee;
    @XmlElement(name = "ValidFromDate")
    protected ValidFromDate validFromDate;
    @XmlElement(name = "ValidToDate")
    protected ValidToDate validToDate;
    @XmlElement(name = "FromDateOfBirth")
    protected FromDateOfBirth fromDateOfBirth;
    @XmlElement(name = "ToDateOfBirth")
    protected ToDateOfBirth toDateOfBirth;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;
    @XmlElement(name = "EntryFeeGroupId")
    protected BigInteger entryFeeGroupId;
    @XmlAttribute(name = "taxIncluded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxIncluded;
    @XmlAttribute(name = "valueOperator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueOperator;
    @XmlAttribute(name = "entryFeeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String entryFeeType;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;

    /**
     * Gets the value of the entryFeeId property.
     * 
     * @return
     *     possible object is
     *     {@link EntryFeeId }
     *     
     */
    public EntryFeeId getEntryFeeId() {
        return entryFeeId;
    }

    /**
     * Sets the value of the entryFeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryFeeId }
     *     
     */
    public void setEntryFeeId(EntryFeeId value) {
        this.entryFeeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaidAmount }
     *     
     */
    public PaidAmount getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidAmount }
     *     
     */
    public void setPaidAmount(PaidAmount value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the externalFee property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFee }
     *     
     */
    public ExternalFee getExternalFee() {
        return externalFee;
    }

    /**
     * Sets the value of the externalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFee }
     *     
     */
    public void setExternalFee(ExternalFee value) {
        this.externalFee = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidFromDate }
     *     
     */
    public ValidFromDate getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFromDate }
     *     
     */
    public void setValidFromDate(ValidFromDate value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidToDate }
     *     
     */
    public ValidToDate getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidToDate }
     *     
     */
    public void setValidToDate(ValidToDate value) {
        this.validToDate = value;
    }

    /**
     * Gets the value of the fromDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link FromDateOfBirth }
     *     
     */
    public FromDateOfBirth getFromDateOfBirth() {
        return fromDateOfBirth;
    }

    /**
     * Sets the value of the fromDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromDateOfBirth }
     *     
     */
    public void setFromDateOfBirth(FromDateOfBirth value) {
        this.fromDateOfBirth = value;
    }

    /**
     * Gets the value of the toDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link ToDateOfBirth }
     *     
     */
    public ToDateOfBirth getToDateOfBirth() {
        return toDateOfBirth;
    }

    /**
     * Sets the value of the toDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToDateOfBirth }
     *     
     */
    public void setToDateOfBirth(ToDateOfBirth value) {
        this.toDateOfBirth = value;
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

    /**
     * Gets the value of the entryFeeGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntryFeeGroupId() {
        return entryFeeGroupId;
    }

    /**
     * Sets the value of the entryFeeGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntryFeeGroupId(BigInteger value) {
        this.entryFeeGroupId = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIncluded() {
        if (taxIncluded == null) {
            return "Y";
        } else {
            return taxIncluded;
        }
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIncluded(String value) {
        this.taxIncluded = value;
    }

    /**
     * Gets the value of the valueOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueOperator() {
        if (valueOperator == null) {
            return "fixed";
        } else {
            return valueOperator;
        }
    }

    /**
     * Sets the value of the valueOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueOperator(String value) {
        this.valueOperator = value;
    }

    /**
     * Gets the value of the entryFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryFeeType() {
        if (entryFeeType == null) {
            return "notSpecified";
        } else {
            return entryFeeType;
        }
    }

    /**
     * Sets the value of the entryFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryFeeType(String value) {
        this.entryFeeType = value;
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
