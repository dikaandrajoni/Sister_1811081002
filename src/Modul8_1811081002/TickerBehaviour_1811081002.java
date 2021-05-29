/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_1811081002;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class TickerBehaviour_1811081002 extends Agent{
    @Override
    protected void setup() {
        //Mengeluarkan hasil function onTick secara berkala
        addBehaviour(new TickerBehaviour(this, 5000) {
            @Override
            protected void onTick() {  
                System.out.println("local name "+myAgent.getLocalName());
            }
        });
    }
}
