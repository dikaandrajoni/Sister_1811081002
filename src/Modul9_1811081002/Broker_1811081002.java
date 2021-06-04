/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081002;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author USER DSC
 */
public class Broker_1811081002 extends Agent {
    Vector aTerimaBaru = new Vector();

    @Override
    protected void setup() {
        addBehaviour(new behav(this, aTerimaBaru));
        addBehaviour(new cari_df(this,  1000, aTerimaBaru));
        
        
    }
    class behav extends CyclicBehaviour{
        MessageTemplate mt_Kirim;
        boolean StaKirim = false, StaTerima = false;
        Vector vTerima;
        int iTerima = 0;

        public behav(Broker_1811081002 aThis, Vector aTerimaBaru) {
            vTerima = aTerimaBaru;
            mt_Kirim = MessageTemplate.MatchConversationId("kirim");
        }
        
        
        @Override
        public void action() {
            // Terima pesan dari terima
            ACLMessage msgKrmPesan = myAgent.receive(mt_Kirim);
            // Terima pesan dari kirim
            if(msgKrmPesan != null){
                if(vTerima.size() > 0){
                    ACLMessage Krmbalas = new ACLMessage(ACLMessage.PROPOSE);
                    Krmbalas.setContent(msgKrmPesan.getContent());
                    Krmbalas.addReceiver((AID) vTerima.elementAt(iTerima++));
                    myAgent.send(Krmbalas);
                    if(iTerima >= vTerima.size()){
                        iTerima = 0;
                    }
                    StaKirim = true;
                    
                    System.out.print("size ok \n");
                    
                }
                System.out.print("msg ok\n");
            } else{
                StaKirim = false;
            }
            
            if (!(StaKirim || StaTerima)){
                block(50);
            }
        }
        
    }
    
    class cari_df extends TickerBehaviour {
        String[] aTerimaBaru;
        DFAgentDescription tm = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        Vector vTerima;
        
        public cari_df(Agent aThis, int i, Vector aTerimaBaru){
            super(aThis, i);
            sd.setType("terima");
            tm.addServices(sd);
            vTerima = aTerimaBaru;
        }

        @Override
        protected void onTick() {
            
            try {
                DFAgentDescription[] dfPenerima = DFService.search(myAgent, tm);
                vTerima.clear();
                for(int i=0; i<dfPenerima.length; i++){
                    vTerima.addElement(dfPenerima[i].getName());
                }
            } catch (FIPAException e) {
                Logger.getLogger(Broker_1811081002.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        
    }
    
    
    
}
