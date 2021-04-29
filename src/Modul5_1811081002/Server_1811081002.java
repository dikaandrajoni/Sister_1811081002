/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081002;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author USER DSC
 */
public class Server_1811081002 {
    public static void main(String[] args) {
        int portNumber = 123;
        try (
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream());
            ObjectInputStream ois = new ObjectInputStream(bis);) {
            
            Pesan_1811081002 pesan;
            while((pesan = (Pesan_1811081002) ois.readObject()) != null){
                System.out.println(new java.util.Date()+" Packet receiver from "+clientSocket.getInetAddress()+ " : "
                +clientSocket.getPort());
                out.println("Pesan Diterima");
            }
            
        } catch (IOException e) {
            Logger.getLogger(Server_1811081002.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Server_1811081002.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
