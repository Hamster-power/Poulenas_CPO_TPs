/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_poulenas;

/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * Exercie 3 manipulation
 * 18.10.2021
 */
public class TP2_manip_POULENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        //System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        //System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        //assiette2.nbCalories=800;
        //System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        //System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        // On voit qu'en rélité assiette2 et assiette3 sont la même chose puisque dès quenl'on 
        // change une cjose dans assiette2 elle se modifie aussi dans assiette3
        Tartiflette assietteTemp = new Tartiflette(300);
        assietteTemp.nbCalories = assiette2.nbCalories;
        assiette2.nbCalories=assiette1.nbCalories;
        assiette1.nbCalories=assietteTemp.nbCalories;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        //Moussaka assiette666 = assiette1 ; 
        //Moussaka assiette667 = new Tartiflette() ;
        // Aucune des 2 lignes n'est correcte car assiette1 est une Tartiflette et donc assiette 666
        // qui est une Moussaka ne peut pas être un Tatriflette. Même chose assiette667 est déclaré comme
        // Moussaka et ne peut donc pas être une nouvelle Tartiflette !
        Moussaka Tableau [];
        Tableau = new Moussaka [10];
        int Calories = 0;
        for (int i=0; i<10;){
            Tableau[i]=new Moussaka(Calories);
            Calories = Calories+100;
            System.out.println("Moussaka"+i+" contient "+Tableau[i].nbCalories+" Calories");
            i=i+1;
        }
        
    }
    
}
