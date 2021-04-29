/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081002;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author USER DSC
 */
public class DayTimeServer_1811081002 {
    
    public static final int SERVICE_PORT=13;
    public static void main(String[] args) {
        try {
            // Bind to the service port
            // To grant client access to the TCP daytime service
            ServerSocket server = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime Service Started");
            
            //Loop indefinitely accepting clients
            for(;;){
                //Get the next TCP client
                Socket nextClient = server.accept();
                
                //Display connection details
                System.out.println("Received request from "
                + nextClient.getInetAddress() + " : "
                +nextClient.getPort());
                
                // Just write the message
                OutputStream out = nextClient.getOutputStream();
                PrintStream pout = new PrintStream(out);
                
                //Write the current  date out the user
                pout.print(new java.util.Date());
                
                //Flush unsent bytes
                out.flush();
                
                // Close stream
                out.close();
                
                //Close the connection
                nextClient.close();
                       
                            }
        } catch (BindException e) {
            System.err.println("Service already running on port "+SERVICE_PORT);
            
        } catch (IOException ioe){
            System.err.println("I/O Error - "+ioe);
        }
            
    }
    
}
