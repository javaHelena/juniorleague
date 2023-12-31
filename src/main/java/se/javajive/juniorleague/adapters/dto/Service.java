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
 *         &lt;element ref="{}ServiceId"/&gt;
 *         &lt;element ref="{}Name" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}ShortName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}MaxNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}EventId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}ServiceType"/&gt;
 *           &lt;element ref="{}ServiceTypeId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}ServiceFee" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ValidRoles" minOccurs="0"/&gt;
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
    "serviceId",
    "name",
    "shortName",
    "comment",
    "maxNumber",
    "eventId",
    "serviceType",
    "serviceTypeId",
    "serviceFee",
    "serviceRequest",
    "validRoles",
    "modifyDate",
    "modifiedBy"
})
@XmlRootElement(name = "Service")
public class Service {

    @XmlElement(name = "ServiceId", required = true)
    protected ServiceId serviceId;
    @XmlElement(name = "Name", required = true)
    protected List<Name> name;
    @XmlElement(name = "ShortName")
    protected List<ShortName> shortName;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlElement(name = "MaxNumber")
    protected MaxNumber maxNumber;
    @XmlElement(name = "EventId", required = true)
    protected EventId eventId;
    @XmlElement(name = "ServiceType")
    protected ServiceType serviceType;
    @XmlElement(name = "ServiceTypeId")
    protected ServiceTypeId serviceTypeId;
    @XmlElement(name = "ServiceFee", required = true)
    protected List<ServiceFee> serviceFee;
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "ValidRoles")
    protected ValidRoles validRoles;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceId }
     *     
     */
    public ServiceId getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceId }
     *     
     */
    public void setServiceId(ServiceId value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortName }
     * 
     * 
     */
    public List<ShortName> getShortName() {
        if (shortName == null) {
            shortName = new ArrayList<ShortName>();
        }
        return this.shortName;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the maxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MaxNumber }
     *     
     */
    public MaxNumber getMaxNumber() {
        return maxNumber;
    }

    /**
     * Sets the value of the maxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxNumber }
     *     
     */
    public void setMaxNumber(MaxNumber value) {
        this.maxNumber = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link EventId }
     *     
     */
    public EventId getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventId }
     *     
     */
    public void setEventId(EventId value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeId }
     *     
     */
    public ServiceTypeId getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the value of the serviceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeId }
     *     
     */
    public void setServiceTypeId(ServiceTypeId value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFee }
     * 
     * 
     */
    public List<ServiceFee> getServiceFee() {
        if (serviceFee == null) {
            serviceFee = new ArrayList<ServiceFee>();
        }
        return this.serviceFee;
    }

    /**
     * Gets the value of the serviceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * 
     * 
     */
    public List<ServiceRequest> getServiceRequest() {
        if (serviceRequest == null) {
            serviceRequest = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequest;
    }

    /**
     * Gets the value of the validRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ValidRoles }
     *     
     */
    public ValidRoles getValidRoles() {
        return validRoles;
    }

    /**
     * Sets the value of the validRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidRoles }
     *     
     */
    public void setValidRoles(ValidRoles value) {
        this.validRoles = value;
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
