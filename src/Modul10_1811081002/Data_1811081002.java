/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DSC
 */
public class Data_1811081002 extends UnicastRemoteObject implements DataInterface_1811081002{
    String str = null;

    public Data_1811081002() throws RemoteException{
    }
    
    @Override
    public void FirstMethod() throws RemoteException {
        System.out.println("Running First Method");
    }

    @Override
    public void SecondMethod() throws RemoteException {
        System.out.println("Running Second Method");
    }

    @Override
    public void salam() throws RemoteException {
        try {
            DatagramSocket socket_1002 = new DatagramSocket(1009);
            DatagramPacket packet_1002 = new DatagramPacket(new byte[256], 256);
            socket_1002.receive(packet_1002);
            
            String message = new String(packet_1002.getData(), 0, packet_1002.getLength());
            System.out.println("Assalamu'alaikum ["+message+"]");
        } catch (SocketException ex) {
        } catch (IOException ex) {
        }
    }

    @Override
    public void Kalkulator() throws RemoteException {        
        try {
            DatagramSocket socket_1002 = new DatagramSocket(1009);
            DatagramPacket packet_1002 = new DatagramPacket(new byte[256], 256);
            socket_1002.receive(packet_1002);
            
            str = new String(packet_1002.getData(), 0, packet_1002.getLength());
            System.out.println("Hasil [ "+str+" ]");
            if(str != null){
                str = str.replace(" ", ",");
                String[] split = str.split(",");
                double hasil = 0;
                String out;
                switch (split[1]) {
                    case "+":
                        hasil = Double.valueOf(split[0]) + Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    case "-":
                        hasil = Double.valueOf(split[0]) - Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    case "/":
                        if(split[2].equals("0")){
                            out = "Tidak dilakukan";
                        } else{
                            hasil = Double.valueOf(split[0]) / Double.valueOf(split[2]);
                            out = String.valueOf(hasil);
                        }   break;
                    case "x":
                        hasil = Double.valueOf(split[0]) * Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    default:
                        out = "Format tidak sesuai";
                        break;
                }
                System.out.println(out);
            } else{
                System.out.println("Data Tidak Terkirim");
            }
        } catch (SocketException ex) {
        } catch (IOException ex) {
        }
    }
}
