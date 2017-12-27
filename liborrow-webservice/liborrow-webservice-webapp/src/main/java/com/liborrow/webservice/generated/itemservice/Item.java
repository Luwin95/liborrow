
package com.liborrow.webservice.generated.itemservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour item complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alley" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", namespace = "http://itemService/", propOrder = {
    "id",
    "itemRef",
    "totalCount",
    "remainingCount",
    "alley",
    "place"
})
@XmlSeeAlso({
    Book.class,
    Magazine.class
})
public class Item {

    protected int id;
    @XmlElement(required = true)
    protected java.lang.String itemRef;
    protected int totalCount;
    protected int remainingCount;
    @XmlElement(required = true)
    protected java.lang.String alley;
    @XmlElement(required = true)
    protected java.lang.String place;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� itemRef.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getItemRef() {
        return itemRef;
    }

    /**
     * D�finit la valeur de la propri�t� itemRef.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setItemRef(java.lang.String value) {
        this.itemRef = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalCount.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * D�finit la valeur de la propri�t� totalCount.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Obtient la valeur de la propri�t� remainingCount.
     * 
     */
    public int getRemainingCount() {
        return remainingCount;
    }

    /**
     * D�finit la valeur de la propri�t� remainingCount.
     * 
     */
    public void setRemainingCount(int value) {
        this.remainingCount = value;
    }

    /**
     * Obtient la valeur de la propri�t� alley.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAlley() {
        return alley;
    }

    /**
     * D�finit la valeur de la propri�t� alley.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAlley(java.lang.String value) {
        this.alley = value;
    }

    /**
     * Obtient la valeur de la propri�t� place.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPlace() {
        return place;
    }

    /**
     * D�finit la valeur de la propri�t� place.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPlace(java.lang.String value) {
        this.place = value;
    }

}
