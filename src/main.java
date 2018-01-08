/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */



/*

    Fonctionnement du proramme :

    il y a deux menus, ce sont des JPanel, un qui contient le trois boutons des figures et le second qui contien les couleurs.
    chaques bouton a un id de 0 a 2 et cet id definit que type de figure c'est.


 */
import javax.swing.JFrame;
import java.awt.*;

public class main {
    public static void main (String args[]) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new menu_fig(), BorderLayout.NORTH);
        f.add(new draw_zone(), BorderLayout.CENTER);
        f.add(new menu_color(), BorderLayout.SOUTH);
        f.setTitle("Epreuve machine");
        f.setSize(800, 600);
        //f.setContentPane(monGraphe);
        f.setLocationRelativeTo(null); //Fenetre au centre de l'écran
        f.setAlwaysOnTop(false);
        f.setResizable(false);
        f.setVisible(true);
        f.pack();
        count_objects c = new count_objects();
    }
}
