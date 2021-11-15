/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_poulenas;

/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA 
 * Super puissance 4 
 * 25.10.2021
 */
public class SP4_console_POULENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeton J = new Jeton ("rouge");
        String S = J.lireCouleur();
        System.out.println(S);
        Cellule C = new Cellule();
        S=C.lireCouleurDuJeton();
        System.out.println(S);
        C.affecterJeton(J);
        S=C.lireCouleurDuJeton();
        System.out.println(S);
        Grille G = new Grille();
        G.afficherGrilleSurConsole();
        G.ajouterJetonDansColonne(J,3);
        G.afficherGrilleSurConsole();
        
        
        
    }
    
}
