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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}ResultId" minOccurs="0"/&gt;
 *         &lt;element ref="{}StartNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}BibNumber" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}CCardId"/&gt;
 *           &lt;element ref="{}CCard"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}StartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}FinishTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}Time" minOccurs="0"/&gt;
 *         &lt;element ref="{}TimeDiff" minOccurs="0"/&gt;
 *         &lt;element ref="{}ResultPosition" minOccurs="0"/&gt;
 *         &lt;element ref="{}CompetitorStatus"/&gt;
 *         &lt;element ref="{}TeamSequence" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}CourseLength"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}SplitTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifiedBy" minOccurs="0"/&gt;
 *         &lt;element ref="{}ChampionshipResults" minOccurs="0"/&gt;
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
    "resultId",
    "startNumber",
    "bibNumber",
    "cCardIdOrCCard",
    "startTime",
    "finishTime",
    "time",
    "timeDiff",
    "resultPosition",
    "competitorStatus",
    "teamSequence",
    "courseLength",
    "splitTime",
    "point",
    "modifyDate",
    "modifiedBy",
    "championshipResults"
})
@XmlRootElement(name = "Result")
public class Result {

    @XmlElement(name = "ResultId")
    protected ResultId resultId;
    @XmlElement(name = "StartNumber")
    protected StartNumber startNumber;
    @XmlElement(name = "BibNumber")
    protected BibNumber bibNumber;
    @XmlElements({
        @XmlElement(name = "CCardId", type = CCardId.class),
        @XmlElement(name = "CCard", type = CCard.class)
    })
    protected List<Object> cCardIdOrCCard;
    @XmlElement(name = "StartTime")
    protected StartTime startTime;
    @XmlElement(name = "FinishTime")
    protected FinishTime finishTime;
    @XmlElement(name = "Time")
    protected Time time;
    @XmlElement(name = "TimeDiff")
    protected TimeDiff timeDiff;
    @XmlElement(name = "ResultPosition")
    protected ResultPosition resultPosition;
    @XmlElement(name = "CompetitorStatus", required = true)
    protected CompetitorStatus competitorStatus;
    @XmlElement(name = "TeamSequence")
    protected TeamSequence teamSequence;
    @XmlElement(name = "CourseLength")
    protected CourseLength courseLength;
    @XmlElement(name = "SplitTime")
    protected List<SplitTime> splitTime;
    @XmlElement(name = "Point")
    protected List<Point> point;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlElement(name = "ModifiedBy")
    protected ModifiedBy modifiedBy;
    @XmlElement(name = "ChampionshipResults")
    protected ChampionshipResults championshipResults;

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link ResultId }
     *     
     */
    public ResultId getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultId }
     *     
     */
    public void setResultId(ResultId value) {
        this.resultId = value;
    }

    /**
     * Gets the value of the startNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StartNumber }
     *     
     */
    public StartNumber getStartNumber() {
        return startNumber;
    }

    /**
     * Sets the value of the startNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartNumber }
     *     
     */
    public void setStartNumber(StartNumber value) {
        this.startNumber = value;
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
     * Gets the value of the cCardIdOrCCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCardIdOrCCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCardIdOrCCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCardId }
     * {@link CCard }
     * 
     * 
     */
    public List<Object> getCCardIdOrCCard() {
        if (cCardIdOrCCard == null) {
            cCardIdOrCCard = new ArrayList<Object>();
        }
        return this.cCardIdOrCCard;
    }

    /**
     * Gets the value of the startTime property.
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
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link FinishTime }
     *     
     */
    public FinishTime getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishTime }
     *     
     */
    public void setFinishTime(FinishTime value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeDiff property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDiff }
     *     
     */
    public TimeDiff getTimeDiff() {
        return timeDiff;
    }

    /**
     * Sets the value of the timeDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDiff }
     *     
     */
    public void setTimeDiff(TimeDiff value) {
        this.timeDiff = value;
    }

    /**
     * Gets the value of the resultPosition property.
     * 
     * @return
     *     possible object is
     *     {@link ResultPosition }
     *     
     */
    public ResultPosition getResultPosition() {
        return resultPosition;
    }

    /**
     * Sets the value of the resultPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultPosition }
     *     
     */
    public void setResultPosition(ResultPosition value) {
        this.resultPosition = value;
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
     * Gets the value of the teamSequence property.
     * 
     * @return
     *     possible object is
     *     {@link TeamSequence }
     *     
     */
    public TeamSequence getTeamSequence() {
        return teamSequence;
    }

    /**
     * Sets the value of the teamSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamSequence }
     *     
     */
    public void setTeamSequence(TeamSequence value) {
        this.teamSequence = value;
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
     * Gets the value of the splitTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTime }
     * 
     * 
     */
    public List<SplitTime> getSplitTime() {
        if (splitTime == null) {
            splitTime = new ArrayList<SplitTime>();
        }
        return this.splitTime;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<Point>();
        }
        return this.point;
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
     * Gets the value of the championshipResults property.
     * 
     * @return
     *     possible object is
     *     {@link ChampionshipResults }
     *     
     */
    public ChampionshipResults getChampionshipResults() {
        return championshipResults;
    }

    /**
     * Sets the value of the championshipResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChampionshipResults }
     *     
     */
    public void setChampionshipResults(ChampionshipResults value) {
        this.championshipResults = value;
    }

}
