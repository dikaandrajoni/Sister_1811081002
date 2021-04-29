/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081002;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER DSC
 */
public class Client_1811081002 {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int portNumber = 123;
        try (
            Socket echoSocket = new Socket(hostName, portNumber);
            BufferedOutputStream bos = new BufferedOutputStream(echoSocket.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));){
           
            String msg;
            while ((msg = stdIn.readLine()) != null) {
                oos.writeObject(new Pesan_1811081002("Eko", msg));
                oos.flush();
                System.out.println("Client receiver: "+in.readLine());
                
            }      
            
        } catch (IOException e){
            Logger.getLogger(Client_1811081002.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
