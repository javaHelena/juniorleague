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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TeleType" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="faxNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="webURL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teleType",
    "modifyDate",
    "modifiedBy"
})
@XmlRootElement(name = "Tele")
public class Tele {

    @XmlElement(name = "TeleType")
    protected TeleType teleType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;
    @XmlAttribute(name = "phoneNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String phoneNumber;
    @XmlAttribute(name = "faxNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String faxNumber;
    @XmlAttribute(name = "mobilePhoneNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String mobilePhoneNumber;
    @XmlAttribute(name = "mailAddress")
    @XmlSchemaType(name = "anySimpleType")
    protected String mailAddress;
    @XmlAttribute(name = "webURL")
    @XmlSchemaType(name = "anySimpleType")
    protected String webURL;

    /**
     * Gets the value of the teleType property.
     * 
     * @return
     *     possible object is
     *     {@link TeleType }
     *     
     */
    public TeleType getTeleType() {
        return teleType;
    }

    /**
     * Sets the value of the teleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleType }
     *     
     */
    public void setTeleType(TeleType value) {
        this.teleType = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the webURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURL() {
        return webURL;
    }

    /**
     * Sets the value of the webURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURL(String value) {
        this.webURL = value;
    }

}
