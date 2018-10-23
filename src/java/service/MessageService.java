/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Client;
import model.Gestionnaire;
import serviceClient.ClientPersistance;
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
        Client client = Gestionnaire.getClient(jsonInfos);
        int year = client.getDdn();
        String message = Verification.showMessageFromAge(year);
        Gestionnaire.setInfosClient();
        Gson gson = new Gson();
        String clientJson = gson.toJson(client);
        ClientPersistance.persistClient(clientJson);
        return message;
        //return clientJson;
    }
}
