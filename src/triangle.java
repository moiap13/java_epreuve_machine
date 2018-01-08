/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */
import java.awt.*;
import java.awt.geom.Arc2D;

public class triangle implements interface_forme{

    public triangle(int posx, int posy)
    {
        xPos = posx;
        yPos = posy;
    }

    @Override
    public void dessiner(Graphics g) {
        g.setColor(draw_zone.figure_color);
        g.drawPolygon(new int[] {xPos, xPos+BORDER_SIZE, xPos+(xPos+BORDER_SIZE - xPos)/2}, new int[] {yPos, yPos, yPos+(xPos+BORDER_SIZE - xPos)/2}, 3);
    }

    private static final int BORDER_SIZE = 40;
    private int xPos;
    private int yPos;
}



