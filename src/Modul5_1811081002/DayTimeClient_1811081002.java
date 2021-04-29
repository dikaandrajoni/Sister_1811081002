/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author USER DSC
 */
public class DayTimeClient_1811081002 {
    public static final int SERVICE_PORT=13;
    public static void main(String[] args) {
        try {
            String hostname="localhost";
            
            //Get socket to daytaime services
            Socket daytime = new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection established");
            
            // Set the socket option just in case server stalls
            daytime.setSoTimeout(2000);
            
            // Read from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
            System.out.println("Result: "+reader.readLine());
            
            //Close the connection
            daytime.close();
            
           
        } catch (IOException e) {
            System.err.println("Error "+e);
        }
    }
    
}
