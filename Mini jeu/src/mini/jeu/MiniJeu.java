/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.jeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author jeann 
 */
public class MiniJeu { // Speed clic 

    /**
     * @param args the command line arguments
     */
    
    
    public static void main (String[] args){
        
        JFrame cadreBienvenue = JFrame("Speed click "); //ou Rejoins notre équipe afin d'éiliminer le Coronavirus 
        cadreBienvenue.setPreferredSize(new Dimension (800,600));
        cadreBienvenue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane panneau = new JLayeredPane();
        cadreBienvenue.add(panneau);
        
        //ImageIcon pageBienvenue = new ImageIcon ("./images/pageBienvenue.png ");
        
        JPanel arriereplan= new JPanel();
        arriereplan.setBorder(BorderFactory.createTitledBorder("arriere plan"));
        arriereplan.setBackground(Color.red);
        cadreBienvenue.add(arriereplan);
        
        arriereplan.pack();
        arriereplan.setVisible(true);
    

   
    
    
    /* public static ImageIcon DimensionImage(String cheminImage, int largeur , int hauteur ){
       ImageIcon srcIcon = new ImageIcon(cheminImage); // on cherche  l'image enregistré 
        Image srcImage= srcIcon.getImage(); // extraction des données d'image 2D
        Image resizedImage= srcImage.getScaledInstance(largeur, hauteur, Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon=new ImageIcon(resizedImage); // régénère l'image aux dimensionx voulu
        
        return resizedIcon;
    }
    public static void main(String[] args) {
           JFrame frame1 = new JFrame("image coronavirus");
        frame1.setPreferredSize(new Dimension(800,600));
        
        
       ImageIcon coronavirus = new ImageIcon("./images/coronavirus.png");
       ImageIcon NVcoronavirus = DimensionImage("./images/coronavirus.png", 100, 50);
        JLabel jlabel1 =new JLabel(NVcoronavirus);
        jlabel1.setBorder(BorderFactory.createTitledBorder("coronavirus"));
        frame1.add(jlabel1);
        
        frame1.pack();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // pour faire bouton cliquable 
           JFrame frame2 = new JFrame("image coronavirus");
        frame2.setPreferredSize(new Dimension(800,600));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(new FlowLayout());
        
        JButton button1=new JButton ("Clique");
        button1.setPreferredSize(new Dimension(200,100));
        frame2.add(button1);
      // ImageIcon coronavirus = new ImageIcon("./images/coronavirus.png");
       //ImageIcon NVcoronavirus = DimensionImage("./images/coronavirus.png", 100, 50);
        JLabel jlabel2 =new JLabel(NVcoronavirus);
        jlabel1.setBorder(BorderFactory.createTitledBorder("coronavirus"));
        frame1.add(jlabel2);
        
        frame2.pack();
        frame2.setVisible(true);
        
        
        
    }
    }*/

   } 
    
  
}