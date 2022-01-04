/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author jeann
 */
public class BoutonGraphique extends JButton {
    Bouton boutonassociee; 
    ImageIcon img_vide = new ImageIcon("./images/img_vide.png"); // methode video interface graphiquhe 2D
            //new javax.swing.ImageIcon(getClass().getResource("/images/img_vide.png")); // image par défaut 
    ImageIcon img_corona = new ImageIcon("./images/img_corona.png"); 
    ImageIcon img_delta = new ImageIcon("./images/img_delta.png"); 
    ImageIcon img_masque = new ImageIcon("./images/img_masque.png"); 
    
    
    public BoutonGraphique (Bouton unBout){
        boutonassociee = unBout;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (boutonassociee.Couleur == "coronavirus"){ // va afficher dans la grille le symbole associé
            setIcon (img_corona); // ici on attribue l'image du corona 
        }
        if (boutonassociee.Couleur == "delta"){ // va afficher dans la grille le symbole associé
            setIcon (img_delta); // ici on attribue l'image du delta
        }
        if (boutonassociee.Couleur == "masque"){ // va afficher dans la grille le symbole associé
            setIcon (img_masque); // ici on attribue l'image du masque 
        }
        setIcon (img_vide); // on attribue l'image boutonvide
    }
}
