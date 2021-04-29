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
public class ExtendThread_1811081002 extends Thread {
    int threadNumber_1002;

    public ExtendThread_1811081002(int threadNumber_1002) {
        this.threadNumber_1002 = threadNumber_1002;
    }

    @Override
    public void run() {
        System.out.println("I'm thread number: "+threadNumber_1002);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(threadNumber_1002 + " Is finished");
        }
        
        System.out.println(threadNumber_1002 + " Is finished");
        
    }
    
    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1 = new ExtendThread_1811081002(1);
        
        System.out.println("Creating thread 2");
        Thread t2 = new ExtendThread_1811081002(2);
        
        // Mulai both Threads
        t1.start();
        t2.start();
    }
    
    
}
