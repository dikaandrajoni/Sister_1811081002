/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_1811081007;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author RyderPhantom
 */
public class OneShootBehaviour_1811081007 extends Agent{

    @Override
    protected void setup() {
        //Mengeluarkan hasil function action hanya 1 kali
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                System.out.println("local name "+myAgent.getLocalName());
            }
        });
    }
}
