import java.awt.*;
import java.awt.geom.Arc2D;

public class carre implements interface_forme{

    public carre(int posx, int posy)
    {
        xPos = posx;
        yPos = posy;
    }

    @Override
    public void dessiner(Graphics g) {
        Rectangle r = new Rectangle(xPos,yPos,BORDER_SIZE,BORDER_SIZE);
        g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
    }

    private static final int BORDER_SIZE = 40;
    private int xPos;
    private int yPos;
}
