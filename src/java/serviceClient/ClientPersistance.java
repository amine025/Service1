/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceClient;

/**
 *
 * @author 1895101
 */
public class ClientPersistance {

    private static void persist(java.lang.String json) {
        serviceClient.PersistanceService_Service service = new serviceClient.PersistanceService_Service();
        serviceClient.PersistanceService port = service.getPersistanceServicePort();
        port.persist(json);
    }
    
    public static void persistClient(String json){
        persist_1(json);
    }

    private static void persist_1(java.lang.String json) {
        serviceClient.PersistanceService_Service service = new serviceClient.PersistanceService_Service();
        serviceClient.PersistanceService port = service.getPersistanceServicePort();
        port.persist(json);
    }
}
