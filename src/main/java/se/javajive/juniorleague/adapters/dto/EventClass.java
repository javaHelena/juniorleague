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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}EventClassId"/&gt;
 *         &lt;element ref="{}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{}ClassShortName"/&gt;
 *         &lt;element ref="{}EventClassStatus"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}EventId"/&gt;
 *           &lt;element ref="{}Event"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}ClassTypeId"/&gt;
 *           &lt;element ref="{}ClassType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}BaseClassId"/&gt;
 *           &lt;element ref="{}BaseClass"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}ExternalId" minOccurs="0"/&gt;
 *         &lt;element ref="{}ClassEntryFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}PunchingUnitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}ClassRaceInfo"/&gt;
 *           &lt;element ref="{}ClassRaceInfoId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}HashTableEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lowAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="highAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="sex" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="B"/&gt;
 *             &lt;enumeration value="F"/&gt;
 *             &lt;enumeration value="M"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numberInTeam" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt;
 *       &lt;attribute name="teamEntry" default="N"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="Y"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numberOfLegs" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt;
 *       &lt;attribute name="numberOfEntries" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="timePresentation" default="Y"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="Y"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="minAverageAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="maxAverageAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="allowEntryInAdvance" default="Y"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="Y"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventClassId",
    "name",
    "classShortName",
    "eventClassStatus",
    "eventId",
    "event",
    "classTypeId",
    "classType",
    "baseClassId",
    "baseClass",
    "externalId",
    "classEntryFee",
    "punchingUnitType",
    "modifyDate",
    "modifiedBy",
    "classRaceInfoOrClassRaceInfoId",
    "hashTableEntry"
})
@XmlRootElement(name = "EventClass")
public class EventClass {

    @XmlElement(name = "EventClassId", required = true)
    protected EventClassId eventClassId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "ClassShortName", required = true)
    protected ClassShortName classShortName;
    @XmlElement(name = "EventClassStatus", required = true)
    protected EventClassStatus eventClassStatus;
    @XmlElement(name = "EventId")
    protected EventId eventId;
    @XmlElement(name = "Event")
    protected Event event;
    @XmlElement(name = "ClassTypeId")
    protected ClassTypeId classTypeId;
    @XmlElement(name = "ClassType")
    protected ClassType classType;
    @XmlElement(name = "BaseClassId")
    protected BaseClassId baseClassId;
    @XmlElement(name = "BaseClass")
    protected BaseClass baseClass;
    @XmlElement(name = "ExternalId")
    protected ExternalId externalId;
    @XmlElement(name = "ClassEntryFee")
    protected List<ClassEntryFee> classEntryFee;
    @XmlElement(name = "PunchingUnitType")
    protected List<PunchingUnitType> punchingUnitType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;
    @XmlElements({
        @XmlElement(name = "ClassRaceInfo", type = ClassRaceInfo.class),
        @XmlElement(name = "ClassRaceInfoId", type = ClassRaceInfoId.class)
    })
    protected List<Object> classRaceInfoOrClassRaceInfoId;
    @XmlElement(name = "HashTableEntry")
    protected List<HashTableEntry> hashTableEntry;
    @XmlAttribute(name = "lowAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String lowAge;
    @XmlAttribute(name = "highAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String highAge;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;
    @XmlAttribute(name = "sex", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlAttribute(name = "numberInTeam")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberInTeam;
    @XmlAttribute(name = "teamEntry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String teamEntry;
    @XmlAttribute(name = "numberOfLegs")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfLegs;
    @XmlAttribute(name = "numberOfEntries")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfEntries;
    @XmlAttribute(name = "timePresentation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timePresentation;
    @XmlAttribute(name = "minAverageAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String minAverageAge;
    @XmlAttribute(name = "maxAverageAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxAverageAge;
    @XmlAttribute(name = "allowEntryInAdvance")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowEntryInAdvance;

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
     * Gets the value of the eventClassStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassStatus }
     *     
     */
    public EventClassStatus getEventClassStatus() {
        return eventClassStatus;
    }

    /**
     * Sets the value of the eventClassStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassStatus }
     *     
     */
    public void setEventClassStatus(EventClassStatus value) {
        this.eventClassStatus = value;
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
     * Gets the value of the classTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTypeId }
     *     
     */
    public ClassTypeId getClassTypeId() {
        return classTypeId;
    }

    /**
     * Sets the value of the classTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTypeId }
     *     
     */
    public void setClassTypeId(ClassTypeId value) {
        this.classTypeId = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    public void setClassType(ClassType value) {
        this.classType = value;
    }

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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalId }
     *     
     */
    public ExternalId getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalId }
     *     
     */
    public void setExternalId(ExternalId value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the classEntryFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classEntryFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassEntryFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassEntryFee }
     * 
     * 
     */
    public List<ClassEntryFee> getClassEntryFee() {
        if (classEntryFee == null) {
            classEntryFee = new ArrayList<ClassEntryFee>();
        }
        return this.classEntryFee;
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
     * Gets the value of the classRaceInfoOrClassRaceInfoId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classRaceInfoOrClassRaceInfoId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassRaceInfoOrClassRaceInfoId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassRaceInfo }
     * {@link ClassRaceInfoId }
     * 
     * 
     */
    public List<Object> getClassRaceInfoOrClassRaceInfoId() {
        if (classRaceInfoOrClassRaceInfoId == null) {
            classRaceInfoOrClassRaceInfoId = new ArrayList<Object>();
        }
        return this.classRaceInfoOrClassRaceInfoId;
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
     * Gets the value of the lowAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowAge() {
        return lowAge;
    }

    /**
     * Sets the value of the lowAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowAge(String value) {
        this.lowAge = value;
    }

    /**
     * Gets the value of the highAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighAge() {
        return highAge;
    }

    /**
     * Sets the value of the highAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighAge(String value) {
        this.highAge = value;
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

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the numberInTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInTeam() {
        if (numberInTeam == null) {
            return "1";
        } else {
            return numberInTeam;
        }
    }

    /**
     * Sets the value of the numberInTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInTeam(String value) {
        this.numberInTeam = value;
    }

    /**
     * Gets the value of the teamEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamEntry() {
        if (teamEntry == null) {
            return "N";
        } else {
            return teamEntry;
        }
    }

    /**
     * Sets the value of the teamEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamEntry(String value) {
        this.teamEntry = value;
    }

    /**
     * Gets the value of the numberOfLegs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfLegs() {
        if (numberOfLegs == null) {
            return "1";
        } else {
            return numberOfLegs;
        }
    }

    /**
     * Sets the value of the numberOfLegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfLegs(String value) {
        this.numberOfLegs = value;
    }

    /**
     * Gets the value of the numberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Sets the value of the numberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfEntries(String value) {
        this.numberOfEntries = value;
    }

    /**
     * Gets the value of the timePresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimePresentation() {
        if (timePresentation == null) {
            return "Y";
        } else {
            return timePresentation;
        }
    }

    /**
     * Sets the value of the timePresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimePresentation(String value) {
        this.timePresentation = value;
    }

    /**
     * Gets the value of the minAverageAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAverageAge() {
        return minAverageAge;
    }

    /**
     * Sets the value of the minAverageAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAverageAge(String value) {
        this.minAverageAge = value;
    }

    /**
     * Gets the value of the maxAverageAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAverageAge() {
        return maxAverageAge;
    }

    /**
     * Sets the value of the maxAverageAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAverageAge(String value) {
        this.maxAverageAge = value;
    }

    /**
     * Gets the value of the allowEntryInAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowEntryInAdvance() {
        if (allowEntryInAdvance == null) {
            return "Y";
        } else {
            return allowEntryInAdvance;
        }
    }

    /**
     * Sets the value of the allowEntryInAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowEntryInAdvance(String value) {
        this.allowEntryInAdvance = value;
    }

}
