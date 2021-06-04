/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081002;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER DSC
 */
public class Terima_1811081002 extends Agent{
    protected void setup(){
        // Registrasi agent
        DFAgentDescription dfad = new DFAgentDescription();
        dfad.setName(getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType("terima");
        sd.setName(getLocalName());
        dfad.addServices(sd);
        
        try {
            DFService.register(this, dfad);
        } catch (FIPAException e) {
            Logger.getLogger(Terima_1811081002.class.getName()).log(Level.SEVERE, null, e);
        } 
        
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage pesan = myAgent.receive();
                if (pesan != null){
                    String msg = pesan.getContent();
                    System.out.println("terima : "+myAgent.getLocalName()+" : "+msg+"\n");
                    
                } else{
                    block(200);
                }
            }
        });
    }
    
}
