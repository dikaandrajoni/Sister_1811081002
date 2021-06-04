/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081002;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author USER DSC
 */
public class Kirim_1811081002 extends Agent{
    protected void setup(){
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage msg = new ACLMessage(ACLMessage.SUBSCRIBE);
                msg.setConversationId("kirim");
                msg.setContent("dari "+myAgent.getLocalName()+" apa kabar? \n");
                msg.addReceiver(new AID("broker", AID.ISLOCALNAME));
                myAgent.send(msg);
                block(2000);
                     
            }
        });
    }
}
