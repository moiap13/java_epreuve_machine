/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class draw_zone extends JPanel implements MouseListener {
    public static int btn_ind;
    public static int color_ind;
    public static Color figure_color;
    public static ArrayList<interface_forme> array_formes;

    public draw_zone()
    {
        this.setPreferredSize(new Dimension(800,400));
        this.setBackground(new Color(0,0,0,70));
        this.addMouseListener(this);
        this.array_formes = new ArrayList<interface_forme>();
    }

    public void test(interface_forme id)
    {
        this.getGraphics().setColor(figure_color);
        id.dessiner(this.getGraphics());
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Point p = new Point();
        p = mouseEvent.getPoint();

        System.out.println(btn_ind);
        interface_forme f;

       // System.out.println("NOMBRE Delement " + this.);

        switch (btn_ind){
            case 0:
                f = new carre((int)p.getX(), (int)p.getY());
                break;
            case 1:
                f = new cercle((int)p.getX(), (int)p.getY());
                break;
            case 2:
                f = new triangle((int)p.getX(), (int)p.getY());
                break;
            default:
                f = null;
                break;
        }

        System.out.println("Color ind : " + color_ind);

        switch (color_ind){
            case 0:
                figure_color = new Color(255,255,0);
                break;
            case 1:
                figure_color = new Color(255,0,0);
                break;
            case 2:
                figure_color = new Color(0,0,255);
                break;
            default:
                figure_color = Color.BLACK;
                break;
        }

        this.array_formes.add(f);
        this.test(f);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
