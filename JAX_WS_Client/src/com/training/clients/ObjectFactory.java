
package com.training.clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training.clients package. 
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

    private final static QName _TravelAgent_QNAME = new QName("http://ifaces.training.com/", "travelAgent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training.clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TravelAgent }
     * 
     */
    public TravelAgent createTravelAgent() {
        return new TravelAgent();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "travelAgent")
    public JAXBElement<TravelAgent> createTravelAgent(TravelAgent value) {
        return new JAXBElement<TravelAgent>(_TravelAgent_QNAME, TravelAgent.class, null, value);
    }

}
