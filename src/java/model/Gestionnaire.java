/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.util.Map;

/**
 *
 * @author 1895101
 */
public class Gestionnaire {

    public static Client getClient(String jsonInfos) {
        Gson gson = new Gson();
        Client client = gson.fromJson(jsonInfos, Client.class);
        return client;
    }

    public static void getEnvirenment() {
        Map<String, String> env = System.getenv();
        System.out.println("################################################################################");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
            //USERNAME
            //COMPUTERNAME
        }
    }
}
