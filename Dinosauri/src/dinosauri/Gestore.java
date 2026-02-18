/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.util.ArrayList;

/**
 *
 * @author polenzani.pietro
 */
public class Gestore {

    private Mazzo mazzoCentrale;
    private Giocatore g1;
    private Giocatore g2;
    
    public void calcolaPunteggioGiocatore(Giocatore g){       
        g.contaPunti();
    }
    
    public void pescaPrimaCarta(Giocatore g){
        g.pescaPrimaCarta();
    }
    
    public void riceviMazzo(){
        Mazzo m1;
        Mazzo m2;
        ArrayList<String> carteM1 = new ArrayList();
        ArrayList<String> carteM2 = new ArrayList();
        int i=0;
        for(Carta c : mazzoCentrale.mazzo){
            String carta=c.toString();
            if(i%2==0){
                carteM1.add(carta);
            }
            else{
                carteM2.add(carta);
            }
            i++;
        }
        g1=new Giocatore(m1=new Mazzo(carteM1));
        g2=new Giocatore(m2=new Mazzo(carteM2));
    }
    
            
}
