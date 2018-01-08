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
        System.out.println("X : " + xPos);
        System.out.println("X+40 : " + (xPos+BORDER_SIZE));
        System.out.println("Truc de merde : " + (xPos+BORDER_SIZE - xPos)/2);
        g.drawPolygon(new int[] {xPos, xPos+BORDER_SIZE, xPos+(xPos+BORDER_SIZE - xPos)/2}, new int[] {yPos, yPos, yPos+(xPos+BORDER_SIZE - xPos)/2}, 3);
    }

    private static final int BORDER_SIZE = 40;
    private int xPos;
    private int yPos;
}



