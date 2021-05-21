/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811081002;

/**
 *
 * @author USER DSC
 */
public class WaitNotify_1811081002 extends Thread {
    
    public static void main(String[] args) throws InterruptedException {
        Thread notificationThread_1002 = new WaitNotify_1811081002();
        notificationThread_1002.start();
        
        synchronized(notificationThread_1002){
            notificationThread_1002.wait();
        }
        
        System.out.println("The wait is over");
        
    }

    @Override
    public void run() {
        System.out.println("Hit enter to stop waiting thread");
        try {
            System.in.read();
            
        } catch (java.io.IOException e) {
        }
        
        
        synchronized(this){
            this.notifyAll();
        }
    }
    
    
    
}
