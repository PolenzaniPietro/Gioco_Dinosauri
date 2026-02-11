/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

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
}
