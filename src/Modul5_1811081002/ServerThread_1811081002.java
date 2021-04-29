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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER DSC
 */
public class ServerThread_1811081002 extends Thread{
    private Socket clientSocket = null;

    public ServerThread_1811081002(Socket clientSocket) {
        super();
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try(
                PrintWriter out =new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream());
                ObjectInputStream ois = new ObjectInputStream(bis);) {
            
            Pesan_1811081002 pesan;
            while((pesan =(Pesan_1811081002) ois.readObject()) != null){
                System.out.println("Server Receiver: "+pesan.toString());
                out.println("Pesan diterima");
                if(pesan.getPesan().equalsIgnoreCase("exit")){
                    break;
                }
            }
        } catch (IOException e){
            Logger.getLogger(Server_1811081002.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Server_1811081002.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(clientSocket!=null){
                try {
                    clientSocket.close();
                
                } catch (Exception e) {
                    Logger.getLogger(Server_1811081002.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }
         
}
