/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081002;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LABSIKOMP03
 */
public class InetAddressIpHost1811081002 {
     public static void main(String[] args) throws UnknownHostException, IOException{
        System.out.println("Get Hostname From IP Address");
        String ip = "157.240.13.35";
        System.out.println("Hostname From IP : "+InetAddress.getByName(ip).getHostName());
        System.out.println("\n");
        
        System.out.println("Get IP Address from hostname");
        String hostname = "www.facebook.com";
        System.out.println("IP from Hostname : "+hostname+" "+InetAddress.getByName(hostname).getHostAddress());
        
        System.out.println("Cek Koneksi");
        String ip2 = "10.20.30.1";
        InetAddress cek1811081002 = InetAddress.getByName(ip2);
        if(cek1811081002.isReachable(2000)){
            System.out.println("Reply");
            System.out.println("Name "+InetAddress.getByName(ip2).getHostName());
        }
        else{
            System.out.println(("Timeout"));
        }
                
    }
}
