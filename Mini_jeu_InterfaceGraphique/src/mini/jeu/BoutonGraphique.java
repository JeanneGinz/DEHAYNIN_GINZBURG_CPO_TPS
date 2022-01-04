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
    
    
    public BoutonGraphique (Bouton unBout){
        boutonassociee = unBout;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        setIcon (img_vide); // on attribue l'image boutonvide
    }
}
