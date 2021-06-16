/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081002;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author DSC
 */
public class Client_1811081002 {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        DataInterface_1811081002 data_1002 = (DataInterface_1811081002) Naming.lookup("rmi://localhost:1009/data");
        System.out.println("Client is Connect to Server");
        
        data_1002.FirstMethod();
        data_1002.SecondMethod();
        
        System.out.println("Finish");
    }
}
