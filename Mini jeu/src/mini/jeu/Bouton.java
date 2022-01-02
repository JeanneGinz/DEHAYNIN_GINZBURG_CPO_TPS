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
    boolean boutonAlume ;
    
    public Bouton(){
        Couleur = "blanc" ;
        boutonAlume = false;
    }
    public void EteindreLeBouton() {
        boutonAlume=false;
    }
    public void AllumerLeBouton() {
        boutonAlume=true;
    }
    public void couleurDuBouton(String typeDuBouton) {
        Couleur=typeDuBouton;
    }
}


