//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.25 a las 11:50:07 AM CST 
//


package com.dhl.ws.blacklist;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dhl.ws.blacklist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dhl.ws.blacklist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link STBlackListResponse }
     * 
     */
    public STBlackListResponse createSTBlackListResponse() {
        return new STBlackListResponse();
    }

    /**
     * Create an instance of {@link STBlackListBeanResponse }
     * 
     */
    public STBlackListBeanResponse createSTBlackListBeanResponse() {
        return new STBlackListBeanResponse();
    }

    /**
     * Create an instance of {@link STBlackListRequest }
     * 
     */
    public STBlackListRequest createSTBlackListRequest() {
        return new STBlackListRequest();
    }

    /**
     * Create an instance of {@link STStatusReport }
     * 
     */
    public STStatusReport createSTStatusReport() {
        return new STStatusReport();
    }

    /**
     * Create an instance of {@link STBlackListBean }
     * 
     */
    public STBlackListBean createSTBlackListBean() {
        return new STBlackListBean();
    }

}
