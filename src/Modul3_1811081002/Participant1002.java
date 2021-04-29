/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081002;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Participant1002 implements Serializable{
    public String firstName;
    public String LastName;
    public int age;

    public Participant1002(String firstName, String LastName, int age) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.age = age;
    }

    public Participant1002() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
