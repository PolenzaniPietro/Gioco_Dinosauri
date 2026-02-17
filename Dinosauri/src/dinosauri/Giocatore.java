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
public class Giocatore {
    private Mazzo mazzoPersonale;
    private Mazzo mazzoPunti;
    private int punteggio;

    public Giocatore(Mazzo mazzoPersonale) {
        this.mazzoPersonale = mazzoPersonale;
    }
    
    
    public void removeCarta(){
        mazzoPersonale.removeCarta();
    }
    public int contaPunti(){
         punteggio=mazzoPunti.calcolaPunti();   
         return punteggio;
    }
    public void pescaPrimaCarta(){
        this.mazzoPersonale.pescaPrimaCarta();
    }
    
    
}
