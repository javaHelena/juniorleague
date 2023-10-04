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
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}OrganisationId" minOccurs="0"/&gt;
 *         &lt;element ref="{}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{}ShortName"/&gt;
 *         &lt;element ref="{}MediaName" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}OrganisationTypeId"/&gt;
 *           &lt;element ref="{}OrganisationType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}CountryId"/&gt;
 *           &lt;element ref="{}Country"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Tele" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ParentOrganisation" minOccurs="0"/&gt;
 *         &lt;element ref="{}SubOrganisation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}OrganisationOfficial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}OrganisationStatusId"/&gt;
 *           &lt;element ref="{}OrganisationStatus"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}CreateDate"/&gt;
 *         &lt;element ref="{}MemberToDate"/&gt;
 *         &lt;element ref="{}HashTableEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "organisationId",
    "name",
    "shortName",
    "mediaName",
    "organisationTypeId",
    "organisationType",
    "countryId",
    "country",
    "address",
    "tele",
    "parentOrganisation",
    "subOrganisation",
    "organisationOfficial",
    "organisationStatusId",
    "organisationStatus",
    "createDate",
    "memberToDate",
    "hashTableEntry",
    "modifyDate",
    "modifiedBy"
})
@XmlRootElement(name = "Organisation")
public class Organisation {

    @XmlElement(name = "OrganisationId")
    protected OrganisationId organisationId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "ShortName", required = true)
    protected ShortName shortName;
    @XmlElement(name = "MediaName")
    protected MediaName mediaName;
    @XmlElement(name = "OrganisationTypeId")
    protected OrganisationTypeId organisationTypeId;
    @XmlElement(name = "OrganisationType")
    protected OrganisationType organisationType;
    @XmlElement(name = "CountryId")
    protected CountryId countryId;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Tele")
    protected List<Tele> tele;
    @XmlElement(name = "ParentOrganisation")
    protected ParentOrganisation parentOrganisation;
    @XmlElement(name = "SubOrganisation")
    protected List<SubOrganisation> subOrganisation;
    @XmlElement(name = "OrganisationOfficial")
    protected List<OrganisationOfficial> organisationOfficial;
    @XmlElement(name = "OrganisationStatusId")
    protected OrganisationStatusId organisationStatusId;
    @XmlElement(name = "OrganisationStatus")
    protected OrganisationStatus organisationStatus;
    @XmlElement(name = "CreateDate", required = true)
    protected CreateDate createDate;
    @XmlElement(name = "MemberToDate", required = true)
    protected MemberToDate memberToDate;
    @XmlElement(name = "HashTableEntry")
    protected List<HashTableEntry> hashTableEntry;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationId }
     *     
     */
    public OrganisationId getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationId }
     *     
     */
    public void setOrganisationId(OrganisationId value) {
        this.organisationId = value;
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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link ShortName }
     *     
     */
    public ShortName getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortName }
     *     
     */
    public void setShortName(ShortName value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the mediaName property.
     * 
     * @return
     *     possible object is
     *     {@link MediaName }
     *     
     */
    public MediaName getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaName }
     *     
     */
    public void setMediaName(MediaName value) {
        this.mediaName = value;
    }

    /**
     * Gets the value of the organisationTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationTypeId }
     *     
     */
    public OrganisationTypeId getOrganisationTypeId() {
        return organisationTypeId;
    }

    /**
     * Sets the value of the organisationTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationTypeId }
     *     
     */
    public void setOrganisationTypeId(OrganisationTypeId value) {
        this.organisationTypeId = value;
    }

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisationType(OrganisationType value) {
        this.organisationType = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link CountryId }
     *     
     */
    public CountryId getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryId }
     *     
     */
    public void setCountryId(CountryId value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the tele property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tele property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTele().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tele }
     * 
     * 
     */
    public List<Tele> getTele() {
        if (tele == null) {
            tele = new ArrayList<Tele>();
        }
        return this.tele;
    }

    /**
     * Gets the value of the parentOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link ParentOrganisation }
     *     
     */
    public ParentOrganisation getParentOrganisation() {
        return parentOrganisation;
    }

    /**
     * Sets the value of the parentOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentOrganisation }
     *     
     */
    public void setParentOrganisation(ParentOrganisation value) {
        this.parentOrganisation = value;
    }

    /**
     * Gets the value of the subOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubOrganisation }
     * 
     * 
     */
    public List<SubOrganisation> getSubOrganisation() {
        if (subOrganisation == null) {
            subOrganisation = new ArrayList<SubOrganisation>();
        }
        return this.subOrganisation;
    }

    /**
     * Gets the value of the organisationOfficial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationOfficial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationOfficial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationOfficial }
     * 
     * 
     */
    public List<OrganisationOfficial> getOrganisationOfficial() {
        if (organisationOfficial == null) {
            organisationOfficial = new ArrayList<OrganisationOfficial>();
        }
        return this.organisationOfficial;
    }

    /**
     * Gets the value of the organisationStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationStatusId }
     *     
     */
    public OrganisationStatusId getOrganisationStatusId() {
        return organisationStatusId;
    }

    /**
     * Sets the value of the organisationStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationStatusId }
     *     
     */
    public void setOrganisationStatusId(OrganisationStatusId value) {
        this.organisationStatusId = value;
    }

    /**
     * Gets the value of the organisationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationStatus }
     *     
     */
    public OrganisationStatus getOrganisationStatus() {
        return organisationStatus;
    }

    /**
     * Sets the value of the organisationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationStatus }
     *     
     */
    public void setOrganisationStatus(OrganisationStatus value) {
        this.organisationStatus = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link CreateDate }
     *     
     */
    public CreateDate getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateDate }
     *     
     */
    public void setCreateDate(CreateDate value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the memberToDate property.
     * 
     * @return
     *     possible object is
     *     {@link MemberToDate }
     *     
     */
    public MemberToDate getMemberToDate() {
        return memberToDate;
    }

    /**
     * Sets the value of the memberToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberToDate }
     *     
     */
    public void setMemberToDate(MemberToDate value) {
        this.memberToDate = value;
    }

    /**
     * Gets the value of the hashTableEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hashTableEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHashTableEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashTableEntry }
     * 
     * 
     */
    public List<HashTableEntry> getHashTableEntry() {
        if (hashTableEntry == null) {
            hashTableEntry = new ArrayList<HashTableEntry>();
        }
        return this.hashTableEntry;
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