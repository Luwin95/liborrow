
package com.liborrow.webinterface.generated.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BorrowService", targetNamespace = "model.generated.webinterface.liborrow.com", wsdlLocation = "http://localhost:8080/liborrow-webservice-webapp/BorrowService?wsdl")
public class BorrowService
    extends Service
{

    private final static URL BORROWSERVICE_WSDL_LOCATION;
    private final static WebServiceException BORROWSERVICE_EXCEPTION;
    private final static QName BORROWSERVICE_QNAME = new QName("model.generated.webinterface.liborrow.com", "BorrowService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/liborrow-webservice-webapp/BorrowService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BORROWSERVICE_WSDL_LOCATION = url;
        BORROWSERVICE_EXCEPTION = e;
    }

    public BorrowService() {
        super(__getWsdlLocation(), BORROWSERVICE_QNAME);
    }

    public BorrowService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BORROWSERVICE_QNAME, features);
    }

    public BorrowService(URL wsdlLocation) {
        super(wsdlLocation, BORROWSERVICE_QNAME);
    }

    public BorrowService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BORROWSERVICE_QNAME, features);
    }

    public BorrowService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BorrowService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BorrowClient
     */
    @WebEndpoint(name = "BorrowPort")
    public BorrowClient getBorrowPort() {
        return super.getPort(new QName("model.generated.webinterface.liborrow.com", "BorrowPort"), BorrowClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BorrowClient
     */
    @WebEndpoint(name = "BorrowPort")
    public BorrowClient getBorrowPort(WebServiceFeature... features) {
        return super.getPort(new QName("model.generated.webinterface.liborrow.com", "BorrowPort"), BorrowClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BORROWSERVICE_EXCEPTION!= null) {
            throw BORROWSERVICE_EXCEPTION;
        }
        return BORROWSERVICE_WSDL_LOCATION;
    }

}
