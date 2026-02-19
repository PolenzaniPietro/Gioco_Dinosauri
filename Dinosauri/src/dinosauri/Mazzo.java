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
public class Mazzo {
    protected ArrayList<Carta> mazzo;
    
    public Mazzo(ArrayList<String> e){
        for(String a : e){
            Carta c = new Carta(a);
            mazzo.add(c);
        }
    }
    
    public int calcolaPunti(){
        int punti=0;
        for(Carta carta : mazzo){
            punti+=carta.getValoreCarta();
        }
        return punti;
    }
    public void removeCarta(Carta c){     
        if(!mazzo.isEmpty()){            
              mazzo.remove(c);
        }
    }
    public void removeAllCards(){
        for(Carta c : mazzo){
            mazzo.remove(c);
        }
    }
        
    public Carta removePrimaCarta(){
        return mazzo.remove(0);
    }
    public Carta pescaPrimaCarta(){
        return this.removePrimaCarta();
         
    }
    public void addCarta(Carta c){
        this.mazzo.add(c);
    }

    
}
