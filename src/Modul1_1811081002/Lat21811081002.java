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
public class Lat21811081002 {
    public static void main(String[] args) throws UnknownHostException, IOException{
        String ip,ip2, host,host2;
        host = "sia.poltekatipdg.ac.id";
        host2 = "siakad.pnp.ac.id";
        System.out.println("IP Address From Hostname "+host+ " : "+InetAddress.getByName(host).getHostAddress());
        System.out.println("IP Address From Hostname "+host2+" : "+InetAddress.getByName(host2).getHostAddress());
        System.out.println("\n");
            
    }
}
