/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081002;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Scanner;
/**
 *
 * @author LABSIKOMP03
 */
public class MenuInputOutputStream_1811081002 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       menu();
        
    }
    public static void menu(){
        
        String path_1811081002 = "File_1811081002/File_1811081002.dat";
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("Menu Pilihan");
        System.out.println("1. InputStream");
        System.out.println("2. OuputStream");
        System.out.println("3. Keluar");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        input.nextLine();
      
        
        switch(pilihan){
                case 1:
                    try {
                        InputStream fileInput_1811081002 = new FileInputStream("File_1811081002/File_1811081002.dat");
                        int dataRead_1811081002 = fileInput_1811081002.read();
        
                        while (dataRead_1811081002!=-1){
                            System.out.print((char)dataRead_1811081002);
                            dataRead_1811081002 = fileInput_1811081002.read();
                        }
                    } catch (Exception e) {
                        
                    }
                    menu();
                    break;
                case 2:
                    try {
                        OutputStream output_1811081002 = new FileOutputStream(path_1811081002);
                        System.out.println("Opened "+path_1811081002+" for writing");
                        String data_1811081002 = "Menulis teks menggunakan OutputStream \n >>> Oleh dika_1811081002 <<<";
        
                        for(int i=0; i<data_1811081002.length(); i++){
                            output_1811081002.write((byte) data_1811081002.charAt(i));
                        }
                        System.out.println("\nDone Writing...\n");
                        
                    } catch (Exception e) {
                        
                    }
                    menu();
                    break;
                case 3:
                    System.out.println("Selesai");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Menu tidak tersedia!!!");
                    menu();
                    break;
                    
                    
            }
    }
        
        
}
