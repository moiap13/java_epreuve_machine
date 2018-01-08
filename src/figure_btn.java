import javax.swing.*;
import java.awt.*;

public class figure_btn extends JButton {

    public figure_btn(int ind)
    {
        btn_indice = ind;
        this.setPreferredSize(new Dimension(menu_fig.BTN_WIDTH, menu_fig.BAR_HEIGHT));

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
}
