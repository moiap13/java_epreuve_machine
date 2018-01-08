
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
	/*
		plant1 = new JLabel("plant_1");
		plant1.setPreferredSize(new Dimension(this.BAR_WIDTH/6,BAR_HEIGHT));
		plant2 = new JLabel("plant_2");
		plant2.setPreferredSize(new Dimension(this.BAR_WIDTH/6,BAR_HEIGHT));
		plant3 = new JLabel("plant_3");
		plant3.setPreferredSize(new Dimension(this.BAR_WIDTH/6,BAR_HEIGHT));
		this.add(plant1);
		this.add(plant2);BorderLayout
		this.add(plant3);
	*/
    }
}

