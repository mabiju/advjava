package T_GUI_Controls;

import java.awt.*;
import javax.swing.*;

public class c_jcheckbox extends JFrame {
    c_jcheckbox() {
        JCheckBox jcb = new JCheckBox("ICTE"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.

        jcb = new JCheckBox("Science");
        add(jcb);

        jcb = new JCheckBox("Engineering");
        add(jcb);

        jcb = new JCheckBox("Humanities");
        add(jcb);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new c_jcheckbox();
    }
}
