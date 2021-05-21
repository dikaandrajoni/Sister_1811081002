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
public class Counter_1811081002 {
    private int countValue_1002;

    public Counter_1811081002() {
        countValue_1002 = 0;
        
    }

    public Counter_1811081002(int start) {
        this.countValue_1002 = start;
    }
    
    public synchronized void increaseCount(){
        int count = countValue_1002;
        
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        
        count = count +1;
        countValue_1002 = count;
                
    }
    
    public synchronized int getCount(){
        return countValue_1002;
    }
    
   
}
