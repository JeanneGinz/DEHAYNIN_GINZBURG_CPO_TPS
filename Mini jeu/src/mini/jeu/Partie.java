/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Jade
 */
public class Partie {
    String Joueur1;
    Grille GrillePartie;
    Timer chrono = new Timer();
    int tour=0;
    
    public Partie(){
        tour=0;
    }
    public void InitialiserPartie(){
        Grille GrilleBouton = new Grille();
    }
    
    public void DebuterPartie(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Entrez le nom du joueur ");
    }
    
    
}
