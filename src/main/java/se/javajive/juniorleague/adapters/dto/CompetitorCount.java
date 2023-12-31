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
 *         &lt;element ref="{}ClassCompetitorCount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}OrganisationCompetitorCount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="eventId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="eventRaceId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="numberOfEntries" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="numberOfStarts" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classCompetitorCount",
    "organisationCompetitorCount"
})
@XmlRootElement(name = "CompetitorCount")
public class CompetitorCount {

    @XmlElement(name = "ClassCompetitorCount")
    protected List<ClassCompetitorCount> classCompetitorCount;
    @XmlElement(name = "OrganisationCompetitorCount")
    protected List<OrganisationCompetitorCount> organisationCompetitorCount;
    @XmlAttribute(name = "eventId")
    @XmlSchemaType(name = "anySimpleType")
    protected String eventId;
    @XmlAttribute(name = "eventRaceId")
    @XmlSchemaType(name = "anySimpleType")
    protected String eventRaceId;
    @XmlAttribute(name = "numberOfEntries")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfEntries;
    @XmlAttribute(name = "numberOfStarts")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfStarts;

    /**
     * Gets the value of the classCompetitorCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCompetitorCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCompetitorCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCompetitorCount }
     * 
     * 
     */
    public List<ClassCompetitorCount> getClassCompetitorCount() {
        if (classCompetitorCount == null) {
            classCompetitorCount = new ArrayList<ClassCompetitorCount>();
        }
        return this.classCompetitorCount;
    }

    /**
     * Gets the value of the organisationCompetitorCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationCompetitorCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationCompetitorCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationCompetitorCount }
     * 
     * 
     */
    public List<OrganisationCompetitorCount> getOrganisationCompetitorCount() {
        if (organisationCompetitorCount == null) {
            organisationCompetitorCount = new ArrayList<OrganisationCompetitorCount>();
        }
        return this.organisationCompetitorCount;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventRaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventRaceId() {
        return eventRaceId;
    }

    /**
     * Sets the value of the eventRaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventRaceId(String value) {
        this.eventRaceId = value;
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
     * Gets the value of the numberOfStarts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfStarts() {
        return numberOfStarts;
    }

    /**
     * Sets the value of the numberOfStarts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfStarts(String value) {
        this.numberOfStarts = value;
    }

}
