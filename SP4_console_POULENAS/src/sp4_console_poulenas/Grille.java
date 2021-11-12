/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_poulenas;

/**
 *
 * @author Poulenas
 */
public class Grille {
    Cellule[][] cellulesJeu = new Cellule[6][7];
  

    public Grille(){

       for (int i=0;i<6;i++){
        for (int j=0;j<7;j++){
          cellulesJeu[i][j] = new Cellule();
            
        } 
    }
}
    public void ajouterJetonDansColonne (Jeton LeJeton, int nombre){
        
    }
    public boolean etreRempli(){
        
    }
    public void videGrille(){
        
    }
    public void afficherGrilleSurConsole (){
        
    }
    public void celluleOccupee (int nombre1, int nombre2){
        
    }
    public String lireCouleurJeton (int nombre1, int nombre2){
      return   
    }
    public boolean etreGagnantePourJoueur (Joueur LeJoueur){
        return 
    }
    public boolean colonneRemplie (int nombre){
        return 
    }
}
