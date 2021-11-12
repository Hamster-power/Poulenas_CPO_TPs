/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_poulenas;

/**
 *
 * @author Poulenas
 */
public class Cellule {
    Jeton jetonCourant;
    public void Cellule (){
        
    }
    public void affecterJeton(Jeton LeJeton){
        
    }
 
    public String lireCouleurDuJeton (){
        if (jetonCourant==null){
            return ("vide");
        }else {
        return jetonCourant.couleur;
        }
    }
   
}
    
