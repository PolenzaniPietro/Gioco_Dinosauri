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
    protected Mazzo mazzoPersonale;
    private int punteggio;

    public Giocatore(Mazzo mazzoPersonale) {
        this.mazzoPersonale = mazzoPersonale;
    }

    public void removeCarta(Carta c){
        mazzoPersonale.removeCarta(c);
    }

    public int contaPunti(){
        punteggio = mazzoPersonale.calcolaPunti();
        return punteggio;
    }

    public Carta pescaPrimaCarta(){
        return mazzoPersonale.pescaPrimaCarta();
    }
}