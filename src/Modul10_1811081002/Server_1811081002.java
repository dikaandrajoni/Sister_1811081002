/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081002;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author DSC
 */
public class Server_1811081002 {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        Registry registry_1002 = LocateRegistry.createRegistry(1009);
        
        Data_1811081002 data_1002 = new Data_1811081002();
        registry_1002.rebind("data", data_1002);
        
        System.out.println("Server is running");
    }
}
