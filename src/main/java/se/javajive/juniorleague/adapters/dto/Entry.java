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
 *         &lt;element ref="{}EntryId" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}Competitor"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}TeamName"/&gt;
 *             &lt;element ref="{}TeamContact" minOccurs="0"/&gt;
 *             &lt;element ref="{}TeamCompetitor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{}OrganisationId" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{}ResponsibleOrganisationId" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}EntryClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element ref="{}EventId"/&gt;
 *               &lt;element ref="{}Event"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element ref="{}EventRaceId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;element ref="{}EventRace" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}BibNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}AllocationControl" minOccurs="0"/&gt;
 *         &lt;element ref="{}EntryDate"/&gt;
 *         &lt;element ref="{}EntryEntryFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Data" minOccurs="0"/&gt;
 *         &lt;element name="EntryFeeGroupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}CompetitorStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{}CreatedBy" minOccurs="0"/&gt;
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
    "entryId",
    "competitor",
    "teamName",
    "teamContact",
    "teamCompetitor",
    "organisationId",
    "responsibleOrganisationId",
    "entryClass",
    "eventId",
    "event",
    "eventRaceId",
    "eventRace",
    "bibNumber",
    "allocationControl",
    "entryDate",
    "entryEntryFee",
    "data",
    "entryFeeGroupId",
    "competitorStatus",
    "createdBy",
    "modifyDate",
    "modifiedBy"
})
@XmlRootElement(name = "Entry")
public class Entry {

    @XmlElement(name = "EntryId")
    protected EntryId entryId;
    @XmlElement(name = "Competitor")
    protected Competitor competitor;
    @XmlElement(name = "TeamName")
    protected TeamName teamName;
    @XmlElement(name = "TeamContact")
    protected TeamContact teamContact;
    @XmlElement(name = "TeamCompetitor")
    protected List<TeamCompetitor> teamCompetitor;
    @XmlElement(name = "OrganisationId")
    protected List<OrganisationId> organisationId;
    @XmlElement(name = "ResponsibleOrganisationId")
    protected ResponsibleOrganisationId responsibleOrganisationId;
    @XmlElement(name = "EntryClass")
    protected List<EntryClass> entryClass;
    @XmlElement(name = "EventId")
    protected EventId eventId;
    @XmlElement(name = "Event")
    protected Event event;
    @XmlElement(name = "EventRaceId")
    protected List<EventRaceId> eventRaceId;
    @XmlElement(name = "EventRace")
    protected List<EventRace> eventRace;
    @XmlElement(name = "BibNumber")
    protected BibNumber bibNumber;
    @XmlElement(name = "AllocationControl")
    protected AllocationControl allocationControl;
    @XmlElement(name = "EntryDate", required = true)
    protected EntryDate entryDate;
    @XmlElement(name = "EntryEntryFee")
    protected List<EntryEntryFee> entryEntryFee;
    @XmlElement(name = "Data")
    protected Data data;
    @XmlElement(name = "EntryFeeGroupId")
    protected BigInteger entryFeeGroupId;
    @XmlElement(name = "CompetitorStatus")
    protected CompetitorStatus competitorStatus;
    @XmlElement(name = "CreatedBy")
    protected CreatedBy createdBy;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;

    /**
     * Gets the value of the entryId property.
     * 
     * @return
     *     possible object is
     *     {@link EntryId }
     *     
     */
    public EntryId getEntryId() {
        return entryId;
    }

    /**
     * Sets the value of the entryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryId }
     *     
     */
    public void setEntryId(EntryId value) {
        this.entryId = value;
    }

    /**
     * Gets the value of the competitor property.
     * 
     * @return
     *     possible object is
     *     {@link Competitor }
     *     
     */
    public Competitor getCompetitor() {
        return competitor;
    }

    /**
     * Sets the value of the competitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Competitor }
     *     
     */
    public void setCompetitor(Competitor value) {
        this.competitor = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link TeamName }
     *     
     */
    public TeamName getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamName }
     *     
     */
    public void setTeamName(TeamName value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the teamContact property.
     * 
     * @return
     *     possible object is
     *     {@link TeamContact }
     *     
     */
    public TeamContact getTeamContact() {
        return teamContact;
    }

    /**
     * Sets the value of the teamContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamContact }
     *     
     */
    public void setTeamContact(TeamContact value) {
        this.teamContact = value;
    }

    /**
     * Gets the value of the teamCompetitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamCompetitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamCompetitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamCompetitor }
     * 
     * 
     */
    public List<TeamCompetitor> getTeamCompetitor() {
        if (teamCompetitor == null) {
            teamCompetitor = new ArrayList<TeamCompetitor>();
        }
        return this.teamCompetitor;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationId }
     * 
     * 
     */
    public List<OrganisationId> getOrganisationId() {
        if (organisationId == null) {
            organisationId = new ArrayList<OrganisationId>();
        }
        return this.organisationId;
    }

    /**
     * Gets the value of the responsibleOrganisationId property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibleOrganisationId }
     *     
     */
    public ResponsibleOrganisationId getResponsibleOrganisationId() {
        return responsibleOrganisationId;
    }

    /**
     * Sets the value of the responsibleOrganisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibleOrganisationId }
     *     
     */
    public void setResponsibleOrganisationId(ResponsibleOrganisationId value) {
        this.responsibleOrganisationId = value;
    }

    /**
     * Gets the value of the entryClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryClass }
     * 
     * 
     */
    public List<EntryClass> getEntryClass() {
        if (entryClass == null) {
            entryClass = new ArrayList<EntryClass>();
        }
        return this.entryClass;
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
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventRaceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventRaceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventRaceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventRaceId }
     * 
     * 
     */
    public List<EventRaceId> getEventRaceId() {
        if (eventRaceId == null) {
            eventRaceId = new ArrayList<EventRaceId>();
        }
        return this.eventRaceId;
    }

    /**
     * Gets the value of the eventRace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventRace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventRace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventRace }
     * 
     * 
     */
    public List<EventRace> getEventRace() {
        if (eventRace == null) {
            eventRace = new ArrayList<EventRace>();
        }
        return this.eventRace;
    }

    /**
     * Gets the value of the bibNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BibNumber }
     *     
     */
    public BibNumber getBibNumber() {
        return bibNumber;
    }

    /**
     * Sets the value of the bibNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibNumber }
     *     
     */
    public void setBibNumber(BibNumber value) {
        this.bibNumber = value;
    }

    /**
     * Gets the value of the allocationControl property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationControl }
     *     
     */
    public AllocationControl getAllocationControl() {
        return allocationControl;
    }

    /**
     * Sets the value of the allocationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationControl }
     *     
     */
    public void setAllocationControl(AllocationControl value) {
        this.allocationControl = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntryDate }
     *     
     */
    public EntryDate getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryDate }
     *     
     */
    public void setEntryDate(EntryDate value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the entryEntryFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryEntryFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryEntryFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryEntryFee }
     * 
     * 
     */
    public List<EntryEntryFee> getEntryEntryFee() {
        if (entryEntryFee == null) {
            entryEntryFee = new ArrayList<EntryEntryFee>();
        }
        return this.entryEntryFee;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
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
     * Gets the value of the competitorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitorStatus }
     *     
     */
    public CompetitorStatus getCompetitorStatus() {
        return competitorStatus;
    }

    /**
     * Sets the value of the competitorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitorStatus }
     *     
     */
    public void setCompetitorStatus(CompetitorStatus value) {
        this.competitorStatus = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link CreatedBy }
     *     
     */
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedBy }
     *     
     */
    public void setCreatedBy(CreatedBy value) {
        this.createdBy = value;
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
