/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author utilisateur
 */
public class ClientsEntrepot implements Observable {

    private static ArrayList<Client> clients = new ArrayList<Client>();
    private static ClientsEntrepot instance;
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private boolean isTen = false;

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(String birthDay, WebServiceContext wsContex) {
        int year = Integer.parseInt(birthDay);

        Client client = setInfosClient(year, wsContex);
        clients.add(client);
        isTen = clients.size() == 1;
        if (isTen == true) {
            notifyObservers();
            clients.clear();
        }
    }

    public synchronized static ClientsEntrepot getInstance() {

        if (instance == null) {
            instance = new ClientsEntrepot();
        }
        return instance;
    }

    public Client setInfosClient(int year, WebServiceContext wsContex) {
        Client client = new Client(year);
        MessageContext mc = wsContex.getMessageContext();
        HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
        client.setUsername(req.getRemoteUser());
        client.setMachineName(req.getRemoteHost());
        client.setTimeStamp(Calendar.getInstance().getTime().toString());
        System.out.println(client.birthDay);
        System.out.println(client.username);
        System.out.println(client.machineName);
        System.out.println(client.timeStamp);
        return client;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public synchronized void notifyObservers() {
        
        for (Observer observer : observers) {
            observer.update(clients);
        }
    }
}
