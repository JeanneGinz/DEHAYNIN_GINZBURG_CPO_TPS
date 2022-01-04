/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

/**
 *
 * @author Jade
 */

    public class Bouton { //creation de nos attributs
    String Couleur ;
    boolean boutonAllume ;
    
    public Bouton(){
        Couleur = "blanc" ; // quand le bouton est eteint 
        boutonAllume = false; // on initialise notre boolean en faux 
    }
    public void EteindreLeBouton() { // methode 
        boutonAllume=false;
    }
    public void AllumerLeBouton() { //methode qui change le boolean en fonction de s'il est allume ou eteint 
        boutonAllume=true;
    }
    public void couleurDuBouton(String typeDuBouton) { // si delta, coronavirus ou masque 
        Couleur=typeDuBouton;
    }
}


