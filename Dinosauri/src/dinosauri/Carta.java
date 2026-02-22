/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author polenzani.pietro
 */
public class Carta {
    private Colori colore;
    private int valoreCarta;

    public Carta(String c){
        colore = Colori.valueOf(c);
        setValore();
    }

    public Carta(Colori c) {
        this.colore = c;
        setValore();
    }

    private void setValore() {
        if (colore == Colori.Rosso) valoreCarta = 5;
        else if (colore == Colori.Verde) valoreCarta = 3;
        else if (colore == Colori.Giallo) valoreCarta = 1;
    }

    public Colori getColore() { return colore; }
    public void setColore(Colori c) { 
        this.colore = c; 
        setValore();
    }

    public int getValoreCarta() { return valoreCarta; }

    @Override
    public String toString(){ 
        return colore.toString(); 
    }
}