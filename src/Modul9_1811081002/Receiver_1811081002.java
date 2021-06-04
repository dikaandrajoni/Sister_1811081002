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
import jade.lang.acl.MessageTemplate;

/**
 *
 * @author USER DSC
 */
public class Receiver_1811081002 extends Agent {
    protected void setup(){
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                // Seleksi pesan permormative
                MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
                // Seleksi pesan berdasarkan nama agent pengirim dan performative
                MessageTemplate mt2 = MessageTemplate.and(MessageTemplate.MatchSender(
                        new AID("pengirim", AID.ISLOCALNAME)), MessageTemplate.MatchPerformative(ACLMessage.INFORM));
                
                ACLMessage msg = myAgent.receive(mt);
                String content;
                if(msg != null){
                    content = msg.getContent();
                    System.out.println("Pesan yang diterima: "+content);
                            
                } else{
                    block();
                }
                
            }
        });
        
    }
    
}
