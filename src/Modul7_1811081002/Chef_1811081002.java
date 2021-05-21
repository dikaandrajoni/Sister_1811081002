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
public class Chef_1811081002 implements Runnable{
   Counter_1811081002 myCounter_1002;
    int countAmount;

    public Chef_1811081002(Counter_1811081002 Counter_1002, int amount) {
        this.myCounter_1002 = Counter_1002;
        this.countAmount = amount;
    }
    

    @Override
    public void run() {
        for (int i = 1; i <= countAmount; i++) {
            myCounter_1002.increaseCount();
            System.out.println("Pesanan "+myCounter_1002.getCount()+" telah selesai ");
            
        }
 
    }
   
    
    
}
