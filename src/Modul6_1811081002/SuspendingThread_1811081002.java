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
public class SuspendingThread_1811081002 extends Thread {

    @Override
    public void run() {
        int count = 1;
        for (;;){
            System.out.print(count++ + " ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
                
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter = new SuspendingThread_1811081002();
        counter.start();
        System.out.println("Press any enter to SUSPEND the thread counting");
        System.in.read();
        counter.suspend();
        System.out.println("Press any enter to RESUME the thread counting");
        System.in.read();
        counter.resume();
        System.out.println("Press any enter to STOP the thread counting");
        System.in.read();
        counter.stop();
        
    }
}
