/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

/**
 *
 * @author Jade
 */

    public class Bouton {
    String Couleur ;
    boolean boutonAllume ;
    
    public Bouton(){
        Couleur = "blanc" ;
        boutonAllume = false;
    }
    public void EteindreLeBouton() {
        boutonAllume=false;
    }
    public void AllumerLeBouton() {
        boutonAllume=true;
    }
    public void couleurDuBouton(String typeDuBouton) {
        Couleur=typeDuBouton;
    }
}


