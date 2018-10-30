/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceRef;
import model.ClientsEntrepot;
import model.Gestionnaire;
import serviceClient.PersistanceService_Service;

/**
 *
 * @author 1895101
 */
@WebService(serviceName = "MessageService")
public class MessageService {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Service2/PersistanceService.wsdl")
    private PersistanceService_Service service;

    @Resource
    WebServiceContext wsContext;

    /**
     * Web service operation
     *
     * @param birthDay
     * @return
     */
    @WebMethod(operationName = "myMessage")
    public String myMessage(@WebParam(name = "birthDay") String birthDay) {
        
        ClientsEntrepot clinetEntrepot = ClientsEntrepot.getInstance();
        clinetEntrepot.addClient(birthDay,wsContext);
        return Gestionnaire.sendAdvice(birthDay);
    }

    private void persist(java.lang.String json) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviceClient.PersistanceService port = service.getPersistanceServicePort();
        port.persist(json);
    }

}
