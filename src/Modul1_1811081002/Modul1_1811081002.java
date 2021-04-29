/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081002;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LABSIKOMP03
 */
public class Modul1_1811081002 {
    public static void main(String[] args) throws UnknownHostException{
        System.out.println("Localhost");
        InetAddress localhost1811081002 = InetAddress.getLocalHost();
        System.out.println("Name        : "+localhost1811081002.getHostName());
        System.out.println("IP Address  : "+localhost1811081002.getHostAddress());
        System.out.println(localhost1811081002);
    }
}
