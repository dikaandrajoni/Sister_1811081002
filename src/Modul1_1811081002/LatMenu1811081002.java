/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081002;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP03
 */
public class LatMenu1811081002 {
    public static void main(String[] args) throws UnknownHostException, IOException{
        String ip,ip2, host,host2;
        int cek;
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Cek Hostname From IP Address");
        System.out.println("2. Cek IP Address From Hostname");
        System.out.print("Input Pilihan : ");
        cek = input.nextInt();
        input.nextLine();
        
        if(cek==1){
            System.out.println("Get Hostname From IP Address");
            System.out.print("IP Address 1 : ");
            ip = input.nextLine();
 
            System.out.println("Hostname From IP "+ip +" : "+InetAddress.getByName(ip).getHostName());
            System.out.println("=================================================================");
        
            System.out.println("\n");
        }
        else if(cek==2){
             
            System.out.println("Get IP Address From Hostname");
            System.out.print("Hostname 1 : ");
            host = input.nextLine();
            System.out.println("IP Address From Hostname "+host+ " : "+InetAddress.getByName(host).getHostAddress());
            System.out.println("\n");
                
        }
        else{
             System.out.println("Menu tidak tersedia!");
        }
        
       
    }
}
