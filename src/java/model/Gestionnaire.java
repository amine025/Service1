/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1895101
 */
public class Gestionnaire {

    private static Client client;

    public static Client getClient(String birthDay) {
        int year = Integer.parseInt(birthDay);
        client = new Client(year);
        return client;
    }

    public static void setInfosClient() {
        client.setUsername(System.getenv("USERNAME"));
        client.setMachineName(System.getenv("COMPUTERNAME"));
    }  
}
