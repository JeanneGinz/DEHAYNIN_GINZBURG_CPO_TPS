/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

import java.util.Scanner;
import java.util.Timer;
import java.io.*;
import java.lang.Thread;

/**
 *
 * @author Jade
 */
public class Partie {
    String Joueur1; // création de nos attributs
    Grille GrilleJeu;
    Timer chrono = new Timer();
    int tour=0;
    
    public Partie(){
        tour=0; // création du constructeur, qui correspond au nombre de tour
    }
    public void InitialiserPartie(){
         GrilleJeu = new Grille(); //on initiatise notre grilleJeu
    }
    
    public void DebuterPartie() throws InterruptedException{
        Scanner sca = new Scanner(System.in); // le joueur va rentrer son nom
        System.out.println("Entrez le nom du joueur ");
        Joueur1 = sca.next();
        
        InitialiserPartie();
        GrilleJeu.AfficherGrille(); // On affiche la grille de depart qui n'a aucun bouton allumé
        
        System.out.println("La partie va débuter");
        
        while(tour < 20) {  //on impose max 20 tour car pas de chrnometre sur la console
            GrilleJeu.BoutonAleatoirementAllume();  // appel de la fonction d'allumer les boutons
            GrilleJeu.AfficherGrille();  // on affiche notre grille avec les nouveaux boutons allumé
            Scanner sc = new Scanner(System.in);  //le joueur va rentrer les coordonnés de la ou il veut jouer
            System.out.println("saisissez la ligne entre 1 et 6"); // le ligne 1 se trouve en haut
            int a = sc.nextInt() -1;
            System.out.println("saisissez la colonne entre 1 et 6");
            int b = sc.nextInt() -1;
            
            if (a>6 || b>6 ) { // si le joueur rentre une coordonnée non exhistante 
            System.out.println("Erreur, la ligne ou la colonne n'existe pas");
            GrilleJeu.AfficherGrille();
            System.out.println("Saisissez la ligne entre 1 et 6");
             a = sc.nextInt() -1;
            System.out.println("Saisissez la colonne entre 1 et 6");
             b = sc.nextInt() -1;  
            GrilleJeu.CliquerPourEteindre(a,b);
            }
            tour++; // on augmente le nombre des tours 
        
  
                
        
    }
    
    
}
}

