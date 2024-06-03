package T_GUI_Controls;

import java.awt.*;
import javax.swing.*;

public class d_jradiobutton extends JFrame {
    d_jradiobutton() {
        JRadioButton jrb = new JRadioButton("Male"); // creating JRadioButton.
        add(jrb); // adding JRadioButton to frame.

        jrb = new JRadioButton("Female");
        add(jrb);

        jrb = new JRadioButton("Others");
        add(jrb);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new d_jradiobutton();
    }
}
