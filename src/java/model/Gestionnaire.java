/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;

/**
 *
 * @author 1895101
 */
public class Gestionnaire {

    private static Client client;

    public static Client getClient(String jsonInfos) {
        Gson gson = new Gson();
        client = gson.fromJson(jsonInfos, Client.class);
        return client;
    }

    public static void setInfosClient() {
        client.setUsername(System.getenv("USERNAME"));
        client.setMachineName(System.getenv("COMPUTERNAME"));
    }  
}
