/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

/**
 *
 * @author Jade
 */
public class Grille {
    Bouton[][]GrillePartie = new Bouton[6][6];
    
    public Grille(){ //constructeur qui initialise notre grille
        for (int i=0;i<6;i++){ // on reprend celle de notre puissance 4 
            for (int j=0;j<6;j++){
                GrillePartie[i][j]=new Bouton();
                GrillePartie[i][j].boutonAlume=false; // avec en plus on initialise nos bouton en mode eteint
            }
            
        }
    }
}
