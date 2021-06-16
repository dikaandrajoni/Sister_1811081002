/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081002;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DSC
 */
public interface DataInterface_1811081002 extends Remote{
    public void FirstMethod() throws RemoteException;    
    public void SecondMethod() throws RemoteException;    
    public void salam() throws RemoteException;  
    public void Kalkulator() throws RemoteException;
}
