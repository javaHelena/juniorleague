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
 * 
 *           Start information for a team member, including e.g. result status, place, finish time, and split times.
 *         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Person" minOccurs="0"/&gt;
 *         &lt;element ref="{}Organisation" minOccurs="0"/&gt;
 *         &lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}BibNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}StartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}CCardId" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "person",
    "organisation",
    "leg",
    "legOrder",
    "bibNumber",
    "startTime",
    "cCardId"
})
@XmlRootElement(name = "TeamMemberStart")
public class TeamMemberStart {

    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElement(name = "Leg")
    protected BigInteger leg;
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    @XmlElement(name = "BibNumber")
    protected BibNumber bibNumber;
    @XmlElement(name = "StartTime")
    protected StartTime startTime;
    @XmlElement(name = "CCardId")
    protected List<CCardId> cCardId;

    /**
     * 
     *               The team member that the result belongs to. If a relay team is missing a team member, omit this element.
     *             
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * 
     *               The organisation that the team member is representing at the event.
     *             
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeg(BigInteger value) {
        this.leg = value;
    }

    /**
     * Gets the value of the legOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegOrder() {
        return legOrder;
    }

    /**
     * Sets the value of the legOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegOrder(BigInteger value) {
        this.legOrder = value;
    }

    /**
     * 
     *               The bib number that the team member that the result belongs to is wearing.
     *             
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
     * 
     *               The time when the team member that the result belongs to started, expressed in ISO 8601 format.
     *             
     * 
     * @return
     *     possible object is
     *     {@link StartTime }
     *     
     */
    public StartTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTime }
     *     
     */
    public void setStartTime(StartTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the cCardId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCardId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCardId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCardId }
     * 
     * 
     */
    public List<CCardId> getCCardId() {
        if (cCardId == null) {
            cCardId = new ArrayList<CCardId>();
        }
        return this.cCardId;
    }

}
