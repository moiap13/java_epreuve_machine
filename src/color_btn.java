/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class color_btn extends JButton implements MouseListener {

    public color_btn(int ind)
    {
        btn_indice = ind;
        this.setPreferredSize(new Dimension(menu_color.BTN_WIDTH, menu_color.BAR_HEIGHT));
        this.addMouseListener(this);

        switch (ind)
        {
            case 0:
                this.setText("Jaune");
                break;
            case 1:
                this.setText("Rouge");
                break;
            case 2:
                this.setText("Bleu");
                break;
        }
    }

    private int btn_indice;

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        draw_zone.color_ind = btn_indice;
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
