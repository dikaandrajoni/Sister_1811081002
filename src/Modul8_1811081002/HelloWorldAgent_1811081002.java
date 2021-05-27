/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_1811081007;

import jade.core.Agent;
import java.util.Iterator;

/**
 *
 * @author RyderPhantom
 */
public class HelloWorldAgent_1811081007 extends Agent{

    @Override
    protected void setup() {
        System.out.println("Hello World. I'm an agent!");
        
        System.out.println("My local-name is "+getAID().getLocalName());
        System.out.println("My GUID is " +getAID().getName());
        System.out.println("My Addresses are : ");
        Iterator it_1007 = getAID().getAllAddresses();
        while (it_1007.hasNext()) {            
            System.out.println("- "+it_1007.next());
        }
    }  
}
