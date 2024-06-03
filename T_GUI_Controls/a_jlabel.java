package T_GUI_Controls;

import javax.swing.*;

public class a_jlabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Sanothimi");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel label1 = new JLabel("Welcome to Sanothimi Campus");
        label1.setBounds(50, 50, 200, 50);

        JLabel label2 = new JLabel("Hello Students");
        label2.setBounds(50, 100, 200, 50);

        frame.add(label1);
        frame.add(label2);
    }
}
