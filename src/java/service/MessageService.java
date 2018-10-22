/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import verification.Verification;

/**
 *
 * @author 1895101
 */
@WebService(serviceName = "MessageService")
public class MessageService {
    public MessageService(){
        System.out.println("je suis Service1");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "myMessage")
    public String myMessage(@WebParam(name = "jsonInfos") String jsonInfos) {
        jsonInfos = "{\"nom\":\"Amine\",\"prenom\":\"Ghodbane\",\"ddn\":{\"annee\":\"1999\",\"mois\":\"06\",\"jour\":\"06\"}}";
        Verification.showMessageFromAge(jsonInfos);
        return Verification.showMessageFromAge(jsonInfos);
    }

}
