/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_poulenas;

/**
 *
 * @author Poulenas
 */
public class Partie {
    Joueur[]ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    public Partie ( Joueur joueur1, Joueur joueur2 ){
        
    }
    public void attribuerCouleursAuxJoueurs (){
        ListeJoueurs[0].couleur="rouge";
        ListeJoueurs[1].couleur="jaune";
    }
    public void initialiserPartie(){
       grilleJeu = new Grille();
       for (int i=0; i<21; i++){
           ListeJoueurs[0].ajouterJetons(new Jeton ("rouge"));
           ListeJoueurs[1].ajouterJetons(new Jeton ("jaune"));
       }
    }
    public void debuterPartie(){
        grilleJeu.afficherGrilleSurConsole();
        joueurCourant=ListeJoueurs[0];
        while (grilleJeu.etreRempli()!=true || grilleJeu.etreGagnantePourJoueur(joueurCourant)!=true){
            
        }
        
    }
    
}
