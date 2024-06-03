package T_GUI_Controls;

import javax.swing.*;

public class f_jslider extends JFrame {
    f_jslider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        f_jslider frame = new f_jslider();
        frame.pack();
        frame.setVisible(true);
    }
}
