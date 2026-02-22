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
        mazzo = new ArrayList<>();
        for(String a : e){
            Carta c = new Carta(a);
            mazzo.add(c);
        }
    }

    public int calcolaPunti(){
        int punti=0;
        for(Carta carta : mazzo){
            punti += carta.getValoreCarta();
        }
        return punti;
    }

    public void removeCarta(Carta c){
        mazzo.remove(c);
    }

    public ArrayList<Carta> removeAllCards(){
        ArrayList<Carta> copy = new ArrayList<>(mazzo);
        mazzo.clear();
        return copy;
    }

    public Carta removePrimaCarta(){
        if (!mazzo.isEmpty()) return mazzo.remove(0);
        return null;
    }

    public Carta pescaPrimaCarta(){
        return this.removePrimaCarta();
    }

    public void addCarta(Carta c){
        mazzo.add(c);
    }

    public ArrayList<Carta> addMazzo(ArrayList<Carta> carte){
        mazzo.addAll(carte);
        return mazzo;
    }
}