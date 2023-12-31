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
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
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
 *         &lt;element ref="{}Name"/&gt;
 *         &lt;element ref="{}Information" minOccurs="0"/&gt;
 *         &lt;element ref="{}ActivityAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ActivityRegistration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="organisationId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="visibleFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="registrationDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="visibleTo" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="allowExternalRegistrations" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="contactPersonId" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="registrationCount" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="entryAccessLevel" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="All"/&gt;
 *             &lt;enumeration value="LoggedIn"/&gt;
 *             &lt;enumeration value="Admin"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="modifiedBy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="modifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "information",
    "activityAttribute",
    "activityRegistration"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "ActivityAttribute")
    protected List<ActivityAttribute> activityAttribute;
    @XmlElement(name = "ActivityRegistration")
    protected List<ActivityRegistration> activityRegistration;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "organisationId", required = true)
    protected BigInteger organisationId;
    @XmlAttribute(name = "visibleFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visibleFrom;
    @XmlAttribute(name = "registrationDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDeadline;
    @XmlAttribute(name = "startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlAttribute(name = "visibleTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visibleTo;
    @XmlAttribute(name = "allowExternalRegistrations", required = true)
    protected boolean allowExternalRegistrations;
    @XmlAttribute(name = "contactPersonId")
    protected BigInteger contactPersonId;
    @XmlAttribute(name = "registrationCount", required = true)
    protected BigInteger registrationCount;
    @XmlAttribute(name = "url", required = true)
    protected String url;
    @XmlAttribute(name = "entryAccessLevel", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String entryAccessLevel;
    @XmlAttribute(name = "modifiedBy")
    protected BigInteger modifiedBy;
    @XmlAttribute(name = "modifyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;

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
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the activityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityAttribute }
     * 
     * 
     */
    public List<ActivityAttribute> getActivityAttribute() {
        if (activityAttribute == null) {
            activityAttribute = new ArrayList<ActivityAttribute>();
        }
        return this.activityAttribute;
    }

    /**
     * Gets the value of the activityRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityRegistration }
     * 
     * 
     */
    public List<ActivityRegistration> getActivityRegistration() {
        if (activityRegistration == null) {
            activityRegistration = new ArrayList<ActivityRegistration>();
        }
        return this.activityRegistration;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrganisationId(BigInteger value) {
        this.organisationId = value;
    }

    /**
     * Gets the value of the visibleFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisibleFrom() {
        return visibleFrom;
    }

    /**
     * Sets the value of the visibleFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisibleFrom(XMLGregorianCalendar value) {
        this.visibleFrom = value;
    }

    /**
     * Gets the value of the registrationDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDeadline() {
        return registrationDeadline;
    }

    /**
     * Sets the value of the registrationDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDeadline(XMLGregorianCalendar value) {
        this.registrationDeadline = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the visibleTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisibleTo() {
        return visibleTo;
    }

    /**
     * Sets the value of the visibleTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisibleTo(XMLGregorianCalendar value) {
        this.visibleTo = value;
    }

    /**
     * Gets the value of the allowExternalRegistrations property.
     * 
     */
    public boolean isAllowExternalRegistrations() {
        return allowExternalRegistrations;
    }

    /**
     * Sets the value of the allowExternalRegistrations property.
     * 
     */
    public void setAllowExternalRegistrations(boolean value) {
        this.allowExternalRegistrations = value;
    }

    /**
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContactPersonId(BigInteger value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the registrationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegistrationCount() {
        return registrationCount;
    }

    /**
     * Sets the value of the registrationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegistrationCount(BigInteger value) {
        this.registrationCount = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the entryAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryAccessLevel() {
        return entryAccessLevel;
    }

    /**
     * Sets the value of the entryAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryAccessLevel(String value) {
        this.entryAccessLevel = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModifiedBy(BigInteger value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
    }

}
