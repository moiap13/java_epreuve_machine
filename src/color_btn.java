import javax.swing.*;
import java.awt.*;

public class color_btn extends JButton {

    public color_btn(int ind)
    {
        btn_indice = ind;
        this.setPreferredSize(new Dimension(menu_color.BTN_WIDTH, menu_color.BAR_HEIGHT));

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
}
