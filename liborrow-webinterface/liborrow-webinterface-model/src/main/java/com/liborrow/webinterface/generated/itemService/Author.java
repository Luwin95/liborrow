
package com.liborrow.webinterface.generated.itemService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour author complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="author">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="citizenships" type="{http://services.webservice.liborrow.com/}citizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "author", propOrder = {
    "biography",
    "birth",
    "citizenships",
    "death",
    "firstname",
    "id",
    "name"
})
public class Author {

    protected String biography;
    protected int birth;
    @XmlElement(nillable = true)
    protected List<Citizenship> citizenships;
    protected int death;
    protected String firstname;
    protected Long id;
    protected String name;

    /**
     * Obtient la valeur de la propri�t� biography.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiography() {
        return biography;
    }

    /**
     * D�finit la valeur de la propri�t� biography.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiography(String value) {
        this.biography = value;
    }

    /**
     * Obtient la valeur de la propri�t� birth.
     * 
     */
    public int getBirth() {
        return birth;
    }

    /**
     * D�finit la valeur de la propri�t� birth.
     * 
     */
    public void setBirth(int value) {
        this.birth = value;
    }

    /**
     * Gets the value of the citizenships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citizenship }
     * 
     * 
     */
    public List<Citizenship> getCitizenships() {
        if (citizenships == null) {
            citizenships = new ArrayList<Citizenship>();
        }
        return this.citizenships;
    }

    /**
     * Obtient la valeur de la propri�t� death.
     * 
     */
    public int getDeath() {
        return death;
    }

    /**
     * D�finit la valeur de la propri�t� death.
     * 
     */
    public void setDeath(int value) {
        this.death = value;
    }

    /**
     * Obtient la valeur de la propri�t� firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * D�finit la valeur de la propri�t� firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
