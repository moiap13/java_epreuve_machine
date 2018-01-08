import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class draw_zone extends JPanel implements MouseListener {
    public static int btn_ind;

    public draw_zone()
    {
        this.setPreferredSize(new Dimension(800,400));
        this.setBackground(new Color(0,0,0,70));
        this.addMouseListener(this);
    }

    public void test(interface_forme id)
    {
        id.dessiner(this.getGraphics());
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Point p = new Point();
        p = mouseEvent.getPoint();

        System.out.println(btn_ind);
        interface_forme f;

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
