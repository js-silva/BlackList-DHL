//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.25 a las 11:50:07 AM CST 
//


package com.dhl.ws.blacklist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para STBlackListBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="STBlackListBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fcCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noPcs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcsIdShipId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="srvaCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STBlackListBean", propOrder = {
    "dateTime",
    "fcCd",
    "noPcs",
    "pcsIdShipId",
    "rCd",
    "srvaCd",
    "tyCd"
})
public class STBlackListBean {

    @XmlElement(required = true)
    protected String dateTime;
    @XmlElement(required = true)
    protected String fcCd;
    @XmlElement(required = true)
    protected String noPcs;
    @XmlElement(required = true)
    protected String pcsIdShipId;
    @XmlElement(required = true, defaultValue = "ST200")
    protected String rCd;
    @XmlElement(required = true)
    protected String srvaCd;
    @XmlElement(name = "TyCd", required = true, defaultValue = "ST")
    protected String tyCd;

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad fcCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcCd() {
        return fcCd;
    }

    /**
     * Define el valor de la propiedad fcCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcCd(String value) {
        this.fcCd = value;
    }

    /**
     * Obtiene el valor de la propiedad noPcs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPcs() {
        return noPcs;
    }

    /**
     * Define el valor de la propiedad noPcs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPcs(String value) {
        this.noPcs = value;
    }

    /**
     * Obtiene el valor de la propiedad pcsIdShipId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcsIdShipId() {
        return pcsIdShipId;
    }

    /**
     * Define el valor de la propiedad pcsIdShipId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcsIdShipId(String value) {
        this.pcsIdShipId = value;
    }

    /**
     * Obtiene el valor de la propiedad rCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCd() {
        return rCd;
    }

    /**
     * Define el valor de la propiedad rCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCd(String value) {
        this.rCd = value;
    }

    /**
     * Obtiene el valor de la propiedad srvaCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvaCd() {
        return srvaCd;
    }

    /**
     * Define el valor de la propiedad srvaCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvaCd(String value) {
        this.srvaCd = value;
    }

    /**
     * Obtiene el valor de la propiedad tyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyCd() {
        return tyCd;
    }

    /**
     * Define el valor de la propiedad tyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyCd(String value) {
        this.tyCd = value;
    }

}
