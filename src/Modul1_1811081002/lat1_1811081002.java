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
public class lat1_1811081002 {
    public static void main(String[] args) throws UnknownHostException, IOException{
        String ip,ip2, host,host2;
        int cek;
       
        ip = "172.253.118.106";
        ip2 = "36.89.222.203";
        System.out.println("Hostname From IP "+ip +" : "+InetAddress.getByName(ip).getHostName());
        System.out.println("Hostname From IP "+ip2+" : "+InetAddress.getByName(ip2).getHostName());
        System.out.println("=================================================================");
            
 
       
    }
}
