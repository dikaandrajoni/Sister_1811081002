/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081002;

import static Modul2_1811081002.MenuInputOutputStream_1811081002.menu;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP03
 */
public class WriteFile_1811081002 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream fileInput_1811081002 = new FileInputStream("File_1811081002/FileLat3_1811081002.dat");
        Scanner input = new Scanner(System.in);
        int pilihan;
        String mode;
        boolean menu= true;
        
        
        while(menu){
            System.out.println("Menu Pilihan");
            System.out.println("1. Tulis");
            System.out.println("2. Tampilkan Isi File");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch(pilihan){
                case 1:
                    String path_1811081002 = "File_1811081002/FileLat3_1811081002.dat";
                    System.out.println("Mode Tulis");
                    System.out.println("a. OutputStream");
                    System.out.println("b. BufferWriter");
                    System.out.print("Mode : ");
                    mode = input.nextLine();
                        
                        if(mode.equals("a")){
                            try {
                                OutputStream output_1811081002 = new FileOutputStream(path_1811081002);
                                System.out.println("Opened "+path_1811081002+" for writing");
                                String data_1811081002;
                                System.out.print("Tulis Isi File : ");
                                data_1811081002 = input.nextLine();
                            
                                for(int i=0; i<data_1811081002.length(); i++){
                                    output_1811081002.write((byte) data_1811081002.charAt(i));
                                }
                                System.out.print("\nDone Writing\n");
                            } catch (Exception e) {
                            }
                            
                        }else if(mode.equals("b")){
                            File file_1811081002 = new File(path_1811081002);
                                String isi_1811081002;
                                System.out.print("Tulis Isi File : ");
                                isi_1811081002 = input.nextLine();
                                FileWriter fw_1811081002 = new FileWriter(isi_1811081002);
                                BufferedWriter bw_1811081002 = new BufferedWriter(fw_1811081002);
                                bw_1811081002.write(isi_1811081002);
                    
                        }
                        
                    break;
                case 2:
                    try {
                        int dataRead_1811081002 = fileInput_1811081002.read();
                        while (dataRead_1811081002!=-1){
                            System.out.print((char)dataRead_1811081002);
                            dataRead_1811081002 = fileInput_1811081002.read();
                        }
                        System.out.println("\nSelesai...");
                        
                    } catch (Exception e) {
                        
                    }
                    break;
                case 3:
                    System.out.println("Selesai");
                    menu=false;
                    break;
                
                default:
                    System.out.println("Menu tidak tersedia!!!");
                    
                    break;
                    
                    
            }
        }
       
        
        
    }
    
    public static void menu() throws FileNotFoundException{
        
        
    }
    
    
}
