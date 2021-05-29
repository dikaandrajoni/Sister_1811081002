/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_1811081002;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class Sifat_1811081002 extends Behaviour {

    public Sifat_1811081002(Agent a) {
        super (a);
    }

    @Override
    public void action() {
        System.out.println("local name "+myAgent.getLocalName());
    }

    @Override
    public boolean done() {
        return true;
    }
    
}
