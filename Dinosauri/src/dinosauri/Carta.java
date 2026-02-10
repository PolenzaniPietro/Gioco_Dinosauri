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
        colore=Colori.valueOf(c);
        if(colore.equals("Rosso")){
            this.setValoreCarta(5);
        }
        else if(colore.equals("Verde")){
            this.setValoreCarta(3);
        }
        else if(colore.equals("Giallo")){
            this.setValoreCarta(1);
        }
    }

    public Colori getColore() {
        return colore;
    }

    public int getValoreCarta() {
        return valoreCarta;
    }

    public void setValoreCarta(int valoreCarta) {
        this.valoreCarta = valoreCarta;
    }
    
    
}
