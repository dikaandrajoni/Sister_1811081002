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
public class RunnableThread_1811081002 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am instance of java.lang.Runnable interface"); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable object");
        
        // Create runnable object
        Runnable run = (Runnable) new RunnableThread_1811081002();
        
        // Create a thread, and pass the runnable object
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);
        
        // Create a second thread, and pass the runnable object
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        //Start both threads
        System.out.println("Starting both threads");
        t1.start();
        t2.start();
        
    }
    
}
