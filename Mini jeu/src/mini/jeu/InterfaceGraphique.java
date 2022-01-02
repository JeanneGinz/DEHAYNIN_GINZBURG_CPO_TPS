/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.jeu;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jeann
 */
public class InterfaceGraphique {
    
    public static void main (String[] args) {
        JFrame frame1 = new JFrame("image coronavirus");
        frame1.setPreferredSize(new Dimension(800,600));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JLabel jlabel1 =new JLabel("corona");
        jlabel1.setBorder(BorderFactory.createTitledBorder("coronavirus"));
       // frame1.add(jlabel1);
        
        frame1.pack();
        frame1.setVisible(true);
        
    }
}
