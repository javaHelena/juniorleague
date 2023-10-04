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
 *         &lt;element ref="{}ClassRaceInfoId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}EventRaceId"/&gt;
 *           &lt;element ref="{}EventRace"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}EventClassId"/&gt;
 *           &lt;element ref="{}EventClass"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{}CourseLength" minOccurs="0"/&gt;
 *         &lt;element ref="{}ClassRaceStatus"/&gt;
 *         &lt;element ref="{}PunchingUnitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
 *         &lt;element ref="{}HashTableEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="relayLeg" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="minRunners" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="maxRunners" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="timeResolution" default="seconds"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="minutes"/&gt;
 *             &lt;enumeration value="seconds"/&gt;
 *             &lt;enumeration value="tens"/&gt;
 *             &lt;enumeration value="hundreds"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="noOfEntries" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="noOfStarts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classRaceInfoId",
    "eventRaceId",
    "eventRace",
    "eventClassId",
    "eventClass",
    "name",
    "courseLength",
    "classRaceStatus",
    "punchingUnitType",
    "modifyDate",
    "modifiedBy",
    "hashTableEntry"
})
@XmlRootElement(name = "ClassRaceInfo")
public class ClassRaceInfo {

    @XmlElement(name = "ClassRaceInfoId", required = true)
    protected ClassRaceInfoId classRaceInfoId;
    @XmlElement(name = "EventRaceId")
    protected EventRaceId eventRaceId;
    @XmlElement(name = "EventRace")
    protected EventRace eventRace;
    @XmlElement(name = "EventClassId")
    protected EventClassId eventClassId;
    @XmlElement(name = "EventClass")
    protected EventClass eventClass;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "CourseLength")
    protected CourseLength courseLength;
    @XmlElement(name = "ClassRaceStatus", required = true)
    protected ClassRaceStatus classRaceStatus;
    @XmlElement(name = "PunchingUnitType")
    protected List<PunchingUnitType> punchingUnitType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;
    @XmlElement(name = "HashTableEntry")
    protected List<HashTableEntry> hashTableEntry;
    @XmlAttribute(name = "relayLeg")
    @XmlSchemaType(name = "anySimpleType")
    protected String relayLeg;
    @XmlAttribute(name = "minRunners")
    @XmlSchemaType(name = "anySimpleType")
    protected String minRunners;
    @XmlAttribute(name = "maxRunners")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxRunners;
    @XmlAttribute(name = "timeResolution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timeResolution;
    @XmlAttribute(name = "noOfEntries")
    @XmlSchemaType(name = "anySimpleType")
    protected String noOfEntries;
    @XmlAttribute(name = "noOfStarts")
    @XmlSchemaType(name = "anySimpleType")
    protected String noOfStarts;

    /**
     * Gets the value of the classRaceInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRaceInfoId }
     *     
     */
    public ClassRaceInfoId getClassRaceInfoId() {
        return classRaceInfoId;
    }

    /**
     * Sets the value of the classRaceInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRaceInfoId }
     *     
     */
    public void setClassRaceInfoId(ClassRaceInfoId value) {
        this.classRaceInfoId = value;
    }

    /**
     * Gets the value of the eventRaceId property.
     * 
     * @return
     *     possible object is
     *     {@link EventRaceId }
     *     
     */
    public EventRaceId getEventRaceId() {
        return eventRaceId;
    }

    /**
     * Sets the value of the eventRaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRaceId }
     *     
     */
    public void setEventRaceId(EventRaceId value) {
        this.eventRaceId = value;
    }

    /**
     * Gets the value of the eventRace property.
     * 
     * @return
     *     possible object is
     *     {@link EventRace }
     *     
     */
    public EventRace getEventRace() {
        return eventRace;
    }

    /**
     * Sets the value of the eventRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRace }
     *     
     */
    public void setEventRace(EventRace value) {
        this.eventRace = value;
    }

    /**
     * Gets the value of the eventClassId property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassId }
     *     
     */
    public EventClassId getEventClassId() {
        return eventClassId;
    }

    /**
     * Sets the value of the eventClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassId }
     *     
     */
    public void setEventClassId(EventClassId value) {
        this.eventClassId = value;
    }

    /**
     * Gets the value of the eventClass property.
     * 
     * @return
     *     possible object is
     *     {@link EventClass }
     *     
     */
    public EventClass getEventClass() {
        return eventClass;
    }

    /**
     * Sets the value of the eventClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClass }
     *     
     */
    public void setEventClass(EventClass value) {
        this.eventClass = value;
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
     * Gets the value of the courseLength property.
     * 
     * @return
     *     possible object is
     *     {@link CourseLength }
     *     
     */
    public CourseLength getCourseLength() {
        return courseLength;
    }

    /**
     * Sets the value of the courseLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseLength }
     *     
     */
    public void setCourseLength(CourseLength value) {
        this.courseLength = value;
    }

    /**
     * Gets the value of the classRaceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRaceStatus }
     *     
     */
    public ClassRaceStatus getClassRaceStatus() {
        return classRaceStatus;
    }

    /**
     * Sets the value of the classRaceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRaceStatus }
     *     
     */
    public void setClassRaceStatus(ClassRaceStatus value) {
        this.classRaceStatus = value;
    }

    /**
     * Gets the value of the punchingUnitType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the punchingUnitType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPunchingUnitType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PunchingUnitType }
     * 
     * 
     */
    public List<PunchingUnitType> getPunchingUnitType() {
        if (punchingUnitType == null) {
            punchingUnitType = new ArrayList<PunchingUnitType>();
        }
        return this.punchingUnitType;
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
     * Gets the value of the relayLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayLeg() {
        return relayLeg;
    }

    /**
     * Sets the value of the relayLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayLeg(String value) {
        this.relayLeg = value;
    }

    /**
     * Gets the value of the minRunners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinRunners() {
        return minRunners;
    }

    /**
     * Sets the value of the minRunners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRunners(String value) {
        this.minRunners = value;
    }

    /**
     * Gets the value of the maxRunners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRunners() {
        return maxRunners;
    }

    /**
     * Sets the value of the maxRunners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRunners(String value) {
        this.maxRunners = value;
    }

    /**
     * Gets the value of the timeResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeResolution() {
        if (timeResolution == null) {
            return "seconds";
        } else {
            return timeResolution;
        }
    }

    /**
     * Sets the value of the timeResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeResolution(String value) {
        this.timeResolution = value;
    }

    /**
     * Gets the value of the noOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfEntries() {
        return noOfEntries;
    }

    /**
     * Sets the value of the noOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfEntries(String value) {
        this.noOfEntries = value;
    }

    /**
     * Gets the value of the noOfStarts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfStarts() {
        return noOfStarts;
    }

    /**
     * Sets the value of the noOfStarts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfStarts(String value) {
        this.noOfStarts = value;
    }

}
