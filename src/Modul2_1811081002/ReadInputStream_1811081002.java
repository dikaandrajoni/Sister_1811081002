/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081002;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author LABSIKOMP03
 */
public class ReadInputStream_1811081002 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        InputStream fileInput_1811081002 = new FileInputStream("File_1811081002/ReadInputStream_1811081002.txt");
        int data_1811081002 = fileInput_1811081002.read();
        
        while (data_1811081002!=-1){
            System.out.print((char)data_1811081002);            
            data_1811081002 = fileInput_1811081002.read();

        }
         System.out.print("\n");
        fileInput_1811081002.close();
    }
    
    
}
