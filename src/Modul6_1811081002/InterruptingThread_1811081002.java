/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811081002;

import java.io.IOException;

/**
 *
 * @author USER DSC
 */
public class InterruptingThread_1811081002 extends Thread {

    @Override
    public void run() {
        System.out.println("I feel sleepy. Wake me in eight hours");
        try {
            // Sleep for eight hours
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
            
        } catch (InterruptedException e) {
            System.err.println("Just five more minutes....");
        }
        
    }
    public static void main(String[] args) throws IOException {
        // Create a sleepy thread
        Thread sleepy = new InterruptingThread_1811081002();
        //Start thread sleeping
        sleepy.start();
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        //InterruptingThread the thread
        sleepy.interrupt();
    }
    
    
    
}
