/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081002;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class DeserializeArray1002 {
    public static void main(String[] args) {
        DeserializeArray1002 deserialize1002 = new DeserializeArray1002();
        System.out.println("Deserialize Object");
        ArrayList<Participant1002> newList = deserialize1002.deserialize1002("File_1811081002/SerializationArray1002.txt");
        for (Participant1002 p : newList) {
            System.out.println("Nama Depan : "+p.getFirstName()
            +"\n Nama Belakang :"+p.getLastName()
            +"\n Umur :"+p.getAge());
        }
    }
    
    public ArrayList<Participant1002> deserialize1002 (String fileName){
        ArrayList<Participant1002> pcList = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            pcList=(ArrayList<Participant1002>)in.readObject();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        return pcList;
    }
}
