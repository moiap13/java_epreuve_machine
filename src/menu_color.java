/*
    Author  : Pisanello Antonio
    Version : 1.0
    Date    : 8 Janvier 2018
 */

import java.awt.*;
import javax.swing.*;

public class menu_color extends JPanel {
    private static final int BAR_WIDTH = 800;
    public static final int BAR_HEIGHT = 80;
    public static final int NB_ELEMENTS = 3;
    public static final int BTN_WIDTH = 250;


    public menu_color() {
        this.setPreferredSize(new Dimension(BAR_WIDTH, BAR_HEIGHT));

        this.add(new color_btn(0));
        this.add(new color_btn(1));
        this.add(new color_btn(2));
    }
}

