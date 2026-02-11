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
    private ArrayList<Carta> mazzo;
    
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
    public Carta pescaPrimaCarta(){
        Carta c= null;
        if(!mazzo.isEmpty()){
            c = mazzo.get(0);
            mazzo.remove(0);
        }
        return c;
    }

    public Carta removeCarta(){
        Carta c= null;
        if(!mazzo.isEmpty()){
            c = mazzo.get(0);
            mazzo.remove(0);
        }
        return c;
    }
    
    
}
