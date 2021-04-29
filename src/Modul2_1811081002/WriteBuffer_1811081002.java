/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081002;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author LABSIKOMP03
 */
public class WriteBuffer_1811081002 {
    public static void main(String[] args) throws IOException {
        String path_1811081002="File_1811081002/WriteBufferWrite_1811081002.txt";
        File file_1811081002 = new File(path_1811081002);
        String isi_1811081002 = "Menulis dengan BufferWritter";
        FileWriter fw_1811081002 = new FileWriter(isi_1811081002);
        BufferedWriter bw_1811081002 = new BufferedWriter(fw_1811081002);
        bw_1811081002.write(isi_1811081002);
        bw_1811081002.close();
    }
}
