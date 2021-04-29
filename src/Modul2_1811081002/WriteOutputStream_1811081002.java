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


/**
 *
 * @author LABSIKOMP03
 */
public class WriteOutputStream_1811081002 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path_1811081002 = "File_1811081002/WriteOutputStream_1811081002.txt";
        OutputStream output_1811081002 = new FileOutputStream(path_1811081002);
        System.out.println("Opened "+path_1811081002+" for writing");
        String data_1811081002 = "Menulis teks menggunakan OutputStream \n >>> Oleh dika_1811081002 <<<";
        
        for(int i=0; i<data_1811081002.length(); i++){
            output_1811081002.write((byte) data_1811081002.charAt(i));
        }
        System.out.print("\nDone Writing\n");
        output_1811081002.close();
        
        
    }
}
