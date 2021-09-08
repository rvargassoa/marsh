//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.08 a las 04:41:43 PM CDT 
//


package com.marsh.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaqueteConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaqueteConsulta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submarca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipovehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaqueteConsulta", propOrder = {
    "cp",
    "descripcion",
    "marca",
    "ramo",
    "submarca",
    "tipovehiculo"
})
public class PaqueteConsulta {

    @XmlElement(required = true)
    protected String cp;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String ramo;
    @XmlElement(required = true)
    protected String submarca;
    @XmlElement(required = true)
    protected String tipovehiculo;

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamo(String value) {
        this.ramo = value;
    }

    /**
     * Obtiene el valor de la propiedad submarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmarca() {
        return submarca;
    }

    /**
     * Define el valor de la propiedad submarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmarca(String value) {
        this.submarca = value;
    }

    /**
     * Obtiene el valor de la propiedad tipovehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipovehiculo() {
        return tipovehiculo;
    }

    /**
     * Define el valor de la propiedad tipovehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipovehiculo(String value) {
        this.tipovehiculo = value;
    }

}
