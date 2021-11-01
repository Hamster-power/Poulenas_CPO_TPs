/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_poulenas;

/**
 *
 * @author Poulenas
 */
public class Joueur {
    String nom;
    String couleur;
    Jeton[] listeJetons;
    int nombresJetonsRestants;
    
    public void joueur (String nomJoueur){
    nom = nomJoueur;
    }
    public void affetcerCouleur(String couleurChoisie){
       couleur = couleurChoisie; 
    }
    public void ajouterJetons (Jeton leJeton){
        
    }
}
