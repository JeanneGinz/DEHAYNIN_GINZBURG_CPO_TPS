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
    Grille GrilleJeu;
    Timer chrono = new Timer();
    int tour=0;
    
    public Partie(){
        tour=0;
    }
    public void InitialiserPartie(){
        Grille GrilleJeu = new Grille();
    }
    
    public void DebuterPartie(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Entrez le nom du joueur ");
        
        InitialiserPartie();
       
        GrilleJeu.AfficherGrille();
        System.out.println("La partie va débuter");
        long t= System.currentTimeMillis();
        long end = t+30000;
        while(System.currentTimeMillis() < end) {
            GrilleJeu.BoutonAleatoirementAllume(); 
            GrilleJeu.AfficherGrille();
            Scanner sc = new Scanner(System.in); 
            System.out.println("saisissez la ligne entre 1 et 6");
            int a = sc.nextInt() -1;
            System.out.println("saisissez la colonne entre 1 et 6");
            int b = sc.nextInt() -1;
            GrilleJeu.CliquerPourEteindre(a,b);
        
  
               // Thread.sleep( xxx );
        
    }
    
    
}
}
