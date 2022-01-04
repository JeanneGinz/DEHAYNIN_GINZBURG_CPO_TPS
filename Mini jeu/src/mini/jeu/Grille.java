/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;
import java.util.Random;
/**
 *
 * @author Jade
 */
public class Grille {
    Bouton[][]GrillePartie = new Bouton[6][6]; //creation de notre attribut de notre tableau 6x6
    
    public Grille(){ //constructeur qui initialise notre grille on reprend celle de notre puissance 4 
        for (int i=0;i<6;i++){ // il y a 6 colonne de 0 a 5
            for (int j=0;j<6;j++){ // il y a 6 ligne de 0 a 5
                GrillePartie[i][j]=new Bouton();
                GrillePartie[i][j].boutonAllume=false; // avec en plus on initialise nos bouton en mode eteint
            }
            
        }
    }
    
    public void BoutonAleatoirementAllume(){ // 
        Random random = new Random();// appel de la bibliotheque java aleatoire
        int nbColonne; // creation de 2 variable pour la suite
        int nbLigne;
        nbColonne = random.nextInt(6); // un nombre aleatoire entre 0 et 5
        nbLigne=random.nextInt(6);
        GrillePartie[nbColonne][nbLigne].AllumerLeBouton(); //on allume le bouton la ou il a été placé aleatoirement
        GrillePartie[nbColonne][nbLigne].couleurDuBouton("coronavirus");
        
        int piege; // creation de piege, la ou il ne faut pas appuyer
        piege=random.nextInt(3);
        if (piege == 1) {
        int x = random.nextInt(6); // meme methode que precedemment 
        int y = random.nextInt(6);
        while (GrillePartie[nbColonne][nbLigne] == GrillePartie[x][y]) { // on vérifie que notre masque ne soit pas sur notre covid
              x = random.nextInt(6); // on re choisit aleatoirement la pposition du piege 
              y = random.nextInt(6);
            }
            GrillePartie[x][y].AllumerLeBouton();
            GrillePartie[x][y].couleurDuBouton("masque");
        
    }

    int booster; // extactement pareil mais cette fois si avec un booster pour avoir des poins bonus
    booster=random.nextInt(5);
    if(booster==3){
        int x = random.nextInt(6);
        int y = random.nextInt(6);
        while (GrillePartie[nbColonne][nbLigne] == GrillePartie[x][y]) { // on vérifie que notre booster ne soit pas sur notre covid
              x = random.nextInt(6); 
              y = random.nextInt(6);
            }
            GrillePartie[x][y].AllumerLeBouton();
            GrillePartie[x][y].couleurDuBouton("delta");
        
    }
    }
    public boolean verificationBoutonClique(int colonne, int ligne) {
        return GrillePartie[colonne][ligne].boutonAllume;
    }

    public void CliquerPourEteindre(int colonne, int ligne) {
         if (GrillePartie[colonne][ligne].boutonAllume == true ) { // verification que le bouton choisi soit allumé
        GrillePartie[colonne][ligne].EteindreLeBouton(); // on eteint le bouton selectionné
        }
    } 
    
    void AfficherGrille(){ // On reprend la meme methode que notre puissance 4 avec des petites modifs
        for (int i=0; i<6; i++) { //la ligne 1 va etre celle du haut
            for (int j=0; j<6; j++) {
                if(GrillePartie[i][j].boutonAllume == false){ //on met un E la ou les boutons sont eteints
                    System.out.print(" E "); // pour eteint
                }
                else if (GrillePartie[i][j].boutonAllume == true) { // on met un A la ou les boutons sont allumés
                    System.out.print(" A "); //pour allumé
        }
    }
             System.out.println();  //on affiche la grille 
        }
    }
   
}

    

