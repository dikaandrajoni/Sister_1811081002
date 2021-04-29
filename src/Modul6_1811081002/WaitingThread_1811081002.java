/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811081002;

/**
 *
 * @author USER DSC
 */
public class WaitingThread_1811081002 extends Thread {

    @Override
    public void run() {
        System.out.println("This thread feels a little ill....");
        // Sleep for five seconds
        try {
            Thread.sleep(5000);
            
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // Create and start dying thread
        Thread dying = new WaitingThread_1811081002();
        dying.start();
        System.out.println("Waiting for thread death");
        // Wait till death
        dying.join();
        System.out.println("Thread has died");
    }
}
