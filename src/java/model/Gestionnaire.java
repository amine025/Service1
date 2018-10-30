/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.util.ArrayList;
import serviceClient.ClientPersistance;
import verification.Verification;

/**
 *
 * @author 1895101
 */
public class Gestionnaire implements Observer {

    private static String clientJson;
    

    public Gestionnaire() {
        
    }

    public static String getJsonClient(ArrayList<Client> clients) {
        Gson gson = new Gson();
        return gson.toJson(clients);
    }

    public static void persistClient(ArrayList<Client> clients) {
        String clientsJson = getJsonClient(clients);
        System.out.println("####################################################");
        System.out.println(clientsJson);
        ClientPersistance.persistClient(clientsJson);
    }

    public static String sendAdvice(String birthDay) {
        int year = Integer.parseInt(birthDay);
        return Verification.showMessageFromAge(year);
    }

    @Override
    public void update(ArrayList<Client> clients) {
        persistClient(clients);
    }
}
