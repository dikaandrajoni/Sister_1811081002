/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081002;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SerializationArray1002 {
      public void serialize1002(ArrayList<Participant1002>tampung1002, String path1002){
        try (ObjectOutputStream out1035 = new ObjectOutputStream(new FileOutputStream(path1002))){
            out1035.writeObject(tampung1002);
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
    }
    
    public static void main(String[] args) {
        SerializationArray1002 cindy1002 = new SerializationArray1002();
        ArrayList<Participant1002>tampung1002;
        tampung1002 = new ArrayList<Participant1002>();
        String path1002 = "File_1811081002/SerializationArray1002.txt";
        
        tampung1002.add(new Participant1002("cindy2", "klaudia", 13));
        tampung1002.add(new Participant1002("teguh2", "wicaksono",17));
        tampung1002.add(new Participant1002("ridho2", "trilaksono",20));
        tampung1002.add(new Participant1002("roni", "trilaksono",20));
        
        cindy1002.serialize1002(tampung1002, path1002);
    }
}
