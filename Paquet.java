/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxence
 */
public class Paquet {
    
    private Integer nombredecartes;
    List<String> paquet = new ArrayList();
    
    public Paquet(int nombredecartes) {
        
        paquet = new ArrayList<>();
        this.nombredecartes = nombredecartes;
    }
    
}
