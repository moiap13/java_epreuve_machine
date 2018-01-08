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

public class figure_btn extends JButton implements MouseListener {

    public figure_btn(int ind)
    {
        btn_indice = ind;
        this.setPreferredSize(new Dimension(menu_fig.BTN_WIDTH, menu_fig.BAR_HEIGHT));
        this.addMouseListener(this);

        switch (ind)
        {
            case 0:
                this.setText("CARRE");
                break;
            case 1:
                this.setText("CERCLE");
                break;
            case 2:
                this.setText("RECTANGLE");
                break;
        }
    }

    private int btn_indice;

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        draw_zone.btn_ind = btn_indice;
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
