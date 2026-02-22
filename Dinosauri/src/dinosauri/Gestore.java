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

    public Gestore() {
        FileManager fm = new FileManager();
        mazzoCentrale = fm.leggiFile();
        mazzoScarti = new Mazzo(new ArrayList<>());
        riceviMazzo();
    }

    public void riceviMazzo() {
        if (g1 != null && g2 != null) return; // evita di ricreare i giocatori

        ArrayList<Carta> carteG1 = new ArrayList<>();
        ArrayList<Carta> carteG2 = new ArrayList<>();
        int i = 0;
        for (Carta c : mazzoCentrale.mazzo) {
            if (i % 2 == 0) carteG1.add(c);
            else carteG2.add(c);
            i++;
        }

        g1 = new Giocatore(new Mazzo(new ArrayList<>()));
        g1.mazzoPersonale.addMazzo(carteG1);

        g2 = new Giocatore(new Mazzo(new ArrayList<>()));
        g2.mazzoPersonale.addMazzo(carteG2);
    }

    public int calcolaPunteggioGiocatore(Giocatore g){
        if (g == null) return 0;
        return g.contaPunti();
    }

    public Carta pescaPrimaCarta(Giocatore g){
        if (g == null) return null;
        return g.pescaPrimaCarta();
    }

    public Giocatore partitaRapida(){
        int puntiG1 = g1.contaPunti();
        int puntiG2 = g2.contaPunti();

        if (puntiG1 > puntiG2) return g1;
        else if (puntiG2 > puntiG1) return g2;
        return null;
    }
}