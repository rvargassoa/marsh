//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.07 a las 12:11:03 AM CDT 
//


package com.marsh.gen;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="paqueteDetallado" type="{http://marsh.com/gen}PaqueteDetallado" maxOccurs="unbounded"/&gt;
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
    "paqueteDetallado"
})
@XmlRootElement(name = "consultaPaquetesResponse")
public class ConsultaPaquetesResponse {

    @XmlElement(required = true)
    protected List<PaqueteDetallado> paqueteDetallado;

    /**
     * Gets the value of the paqueteDetallado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paqueteDetallado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaqueteDetallado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaqueteDetallado }
     * 
     * 
     */
    public List<PaqueteDetallado> getPaqueteDetallado() {
        if (paqueteDetallado == null) {
            paqueteDetallado = new ArrayList<PaqueteDetallado>();
        }
        return this.paqueteDetallado;
    }

}
