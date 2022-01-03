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
    Bouton[][]GrillePartie = new Bouton[6][6];
    
    public Grille(){ //constructeur qui initialise notre grille
        for (int i=0;i<6;i++){ // on reprend celle de notre puissance 4 
            for (int j=0;j<6;j++){
                GrillePartie[i][j]=new Bouton();
                GrillePartie[i][j].boutonAllume=false; // avec en plus on initialise nos bouton en mode eteint
            }
            
        }
    }
    
    public void BoutonAleatoirementAllume(){
        Random random = new Random();
        int nbColonne;
        int nbLigne;
        nbColonne = random.nextInt(5);
        nbLigne=random.nextInt(5);
        GrillePartie[nbColonne][nbLigne].AllumerLeBouton();
        GrillePartie[nbColonne][nbLigne].couleurDuBouton("coronavirus");
        
        int piege;
        piege=random.nextInt(2);
        if (piege == 1) {
        int x = random.nextInt(6);
        int y = random.nextInt(6);
        while (GrillePartie[nbColonne][nbLigne] == GrillePartie[x][y]) { // on vérifie que notre masque ne soit pas sur notre covid
              x = random.nextInt(6); 
              y = random.nextInt(6);
            }
            GrillePartie[x][y].AllumerLeBouton();
            GrillePartie[x][y].couleurDuBouton("masque");
        
    }

    int booster;
    booster=random.nextInt(5);
    if(booster==3){
        int x = random.nextInt(6);
        int y = random.nextInt(6);
        while (GrillePartie[nbColonne][nbLigne] == GrillePartie[x][y]) { // on vérifie que notre masque ne soit pas sur notre covid
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
         if (GrillePartie[colonne][ligne].boutonAllume == true ) { 
        GrillePartie[colonne][ligne].EteindreLeBouton(); 
        }
    } 
    
    void AfficherGrille(){ // On reprend la meme methode que notre puissance 4 avec des petites modifs
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if(GrillePartie[i][j].boutonAllume == false){
                    System.out.print(" A "); // pour Allumé
                }
                else if (GrillePartie[i][j].boutonAllume == true) {
                    System.out.print(" E "); //pour eteint
        }
    }
             System.out.println(); 
        }
    }
   // public int 
}

    

