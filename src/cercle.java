/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */
import java.awt.*;
import java.awt.geom.Arc2D;

public class cercle implements interface_forme{

    public cercle(int posx, int posy)
    {
        xPos = posx;
        yPos = posy;
    }

    @Override
    public void dessiner(Graphics g) {
        g.setColor(draw_zone.figure_color);
        g.drawOval(xPos, yPos, RAYON, RAYON);
    }

    private static final int RAYON = 40;
    private int xPos;
    private int yPos;
}