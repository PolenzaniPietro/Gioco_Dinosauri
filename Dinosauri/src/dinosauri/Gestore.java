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
    private Mazzo mazzoScarti;
    protected Giocatore g1;
    protected Giocatore g2;
    
    public int calcolaPunteggioGiocatore(Giocatore g){       
       return g.contaPunti();
    }
    
    public Carta pescaPrimaCarta(Giocatore g){
        return g.pescaPrimaCarta();
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
    public Giocatore partitaRapida(Giocatore g1, Giocatore g2){
        if (g1.contaPunti() > g2.contaPunti()){
            return g1;
        }
        else if (g1.contaPunti() < g2.contaPunti()){
            return g2;
        }
        return null;
    }
    public Mazzo addMazzo(Mazzo m){
        Mazzo ma=null;
        for(Carta c : m.mazzo){
            ma.addCarta(c);
        }
        return ma;
    }
    public void partita(){
        
        if(g1.pescaPrimaCarta().getColore().equals(g2.pescaPrimaCarta().getColore())){
            mazzoScarti.addCarta(g1.pescaPrimaCarta());
            mazzoScarti.addCarta(g2.pescaPrimaCarta());
        }
        if(g1.pescaPrimaCarta().getColore().equals("Rosso") && g2.pescaPrimaCarta().getColore().equals("Giallo")){
            g1.mazzoPersonale.addCarta(g1.pescaPrimaCarta());
            g1.mazzoPersonale.addMazzo(mazzoScarti.removeAllCards());
                    
        }
    }
            
}
