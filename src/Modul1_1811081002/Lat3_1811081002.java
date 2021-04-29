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
public class Lat3_1811081002 {
     public static void main(String[] args) throws UnknownHostException, IOException{
        String ip,ip2, host,host2;
         Scanner input = new Scanner(System.in);
          System.out.println("Get Hostname From IP Address");
            System.out.print("IP Address 1 : ");
            ip = input.nextLine();
 
            System.out.println("Hostname From IP "+ip +" : "+InetAddress.getByName(ip).getHostName());
            System.out.println("=================================================================");
        
            
    }
}
