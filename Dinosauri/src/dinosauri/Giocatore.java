/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author polenzani.pietro
 */
public class Giocatore {
    private Mazzo mazzoPersonale;
    private Mazzo mazzoPunti;
    private int punteggio;
    
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
