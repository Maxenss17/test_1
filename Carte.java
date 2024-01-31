/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poker;

/**
 *
 * @author Maxence
 */


public class Carte {
    
    private  MaEnum.Couleur couleur;
    private MaEnum.Valeur valeur;
    

    public Carte( MaEnum.Couleur couleur, MaEnum.Valeur valeur) {
 
        this.couleur = couleur;
        this.valeur = valeur;

    }
    
    public MaEnum.Couleur getCouleur() {
        return couleur;
    }
    
    public MaEnum.Valeur getValeur() {
        return valeur;
    }
}
    

