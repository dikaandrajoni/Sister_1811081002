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
public class CountingThread_1811081002 implements Runnable{
    
    Counter_1811081002 myCounter_1002;
    int countAmount;

    public CountingThread_1811081002(Counter_1811081002 Counter_1002, int amount) {
        this.myCounter_1002 = Counter_1002;
        this.countAmount = amount;
    }
    

    @Override
    public void run() {
        for (int i = 1; i <= countAmount; i++) {
            myCounter_1002.increaseCount();
            System.out.println(""+myCounter_1002.getCount());
            
        }
 
    }
    
    public static void main(String[] args) throws InterruptedException {
        Counter_1811081002 c = new Counter_1811081002();
        
        Runnable runner = new CountingThread_1811081002(c, 10);
        System.out.println("Starting counting threads");
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        Thread t3 = new Thread(runner);
        t1.start(); t2.start(); t3.start();
        
        t1.join(); t2.join(); t3.join();
        System.out.println("'Counter value is "+c.getCount());
    }
    
    
}
