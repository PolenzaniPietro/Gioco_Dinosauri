/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.*;
import java.util.*;

/**
 *
 * @author polenzani.pietro
 */
public class FileManager {
    
    private String file="mazzo.txt";
    public Mazzo leggiFile(){
        ArrayList <String> carte = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine(); 
            while ((line = reader.readLine()) != null) {  
                carte.add(line);
                
            }           
        }
        catch(IOException e){           
        }
        Mazzo m = new Mazzo(carte);
        return m;

    }
}
