/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author DSC
 */

public class Client_Kalkulator_1811081002 {
    //Running 2x baru bisa jalan
    public static void main(String[] args) throws RemoteException, SocketException, NotBoundException, MalformedURLException, IOException {
        DataInterface_1811081002 data_1002 = (DataInterface_1811081002) Naming.lookup("rmi://localhost:1009/data");
        System.out.println("Client is Connect to Server");
        
        Scanner in = new Scanner(System.in);
        System.out.println("+ - / x");
        System.out.print("Input (angka1 + angka2) : ");
        String message = in.nextLine();
        DatagramSocket socket_1002 = new DatagramSocket();
        DatagramPacket packet_1002 = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 1009);
        socket_1002.send(packet_1002);
        socket_1002.close();
        
        data_1002.Kalkulator();
        
        System.out.println("Finish");
    }
}
