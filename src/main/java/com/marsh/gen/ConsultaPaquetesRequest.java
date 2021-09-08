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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paqueteConsulta" type="{http://marsh.com/gen}PaqueteConsulta"/&gt;
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
    "paqueteConsulta"
})
@XmlRootElement(name = "consultaPaquetesRequest")
public class ConsultaPaquetesRequest {

    @XmlElement(required = true)
    protected PaqueteConsulta paqueteConsulta;

    /**
     * Obtiene el valor de la propiedad paqueteConsulta.
     * 
     * @return
     *     possible object is
     *     {@link PaqueteConsulta }
     *     
     */
    public PaqueteConsulta getPaqueteConsulta() {
        return paqueteConsulta;
    }

    /**
     * Define el valor de la propiedad paqueteConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link PaqueteConsulta }
     *     
     */
    public void setPaqueteConsulta(PaqueteConsulta value) {
        this.paqueteConsulta = value;
    }

}
