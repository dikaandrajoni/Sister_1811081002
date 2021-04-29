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
public class StoppingThread_1811081002 extends Thread{

    @Override
    public void run() {
        int count = 1;
        System.out.println("Ï can count. Watch me go!");
        for(;;){
            // Print count and increment it
            System.out.print(count++ + " ");
            // Sleep for half a second
            try {
                Thread.sleep(500);
                
            } catch (Exception e) {
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Create and start counting thread
        Thread counter = new StoppingThread_1811081002();
        counter.start();
        // Prompt user and wait for input
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        // Interrupt the thread
        counter.stop();
    }
}
