/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811081002;

import java.io.IOException;

/**
 *
 * @author USER DSC
 */
public class Waitress_1811081002 extends Thread{
  
    
    public static void main(String[] args) throws InterruptedException, IOException {
        int jml=0;
        
        Thread notificationThread_1002 = new Waitress_1811081002();
        notificationThread_1002.start();
        
        Counter_1811081002 c = new Counter_1811081002();
        
        
        
        Runnable runner = new Chef_1811081002(c, 5);
        Thread t1 = new Thread(runner);
        t1.start(); 
        System.out.print("");
        t1.join();
        System.out.println();
        System.out.println("Total Pesanan "+c.getCount());
        System.out.println("===============================");
        System.out.println("Pelayan Mengantarkan Makanan (Klik Enter Jika Pesanan Sudah Selesai)");
        
        
        synchronized(notificationThread_1002){
            notificationThread_1002.wait();
        }
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Pesanan Selesai");
        
    }

    @Override
    public void run() {
        System.out.println(" Chef Sedang Membuat Makanan sesuai pesanan ");
        System.out.println("===============================");
        try {
            System.in.read();
            
        } catch (java.io.IOException e) {
        }
        
        synchronized(this){
            this.notifyAll();
        }
    }
}
    
