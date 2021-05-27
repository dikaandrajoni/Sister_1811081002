/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_1811081002;

import jade.core.Agent;

public class BehaviourAgent2_1811081002 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new Sifat_1811081002(this));
    }
    
}
