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
 *         &lt;choice&gt;
 *           &lt;element ref="{}EventClassId"/&gt;
 *           &lt;element ref="{}EventClass"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}PersonResult"/&gt;
 *           &lt;element ref="{}TeamResult"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
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
    "eventClassId",
    "eventClass",
    "personResultOrTeamResult"
})
@XmlRootElement(name = "ClassResult")
public class ClassResult {

    @XmlElement(name = "EventClassId")
    protected EventClassId eventClassId;
    @XmlElement(name = "EventClass")
    protected EventClass eventClass;
    @XmlElements({
        @XmlElement(name = "PersonResult", type = PersonResult.class),
        @XmlElement(name = "TeamResult", type = TeamResult.class)
    })
    protected List<Object> personResultOrTeamResult;
    @XmlAttribute(name = "numberOfEntries")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfEntries;
    @XmlAttribute(name = "numberOfStarts")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfStarts;

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
     * Gets the value of the personResultOrTeamResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personResultOrTeamResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonResultOrTeamResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonResult }
     * {@link TeamResult }
     * 
     * 
     */
    public List<Object> getPersonResultOrTeamResult() {
        if (personResultOrTeamResult == null) {
            personResultOrTeamResult = new ArrayList<Object>();
        }
        return this.personResultOrTeamResult;
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
