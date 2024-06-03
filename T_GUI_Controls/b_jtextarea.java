package T_GUI_Controls;

import javax.swing.*;

public class b_jtextarea {
    b_jtextarea() {
        JFrame frame = new JFrame("Text Area Demo");
        JTextArea txtArea = new JTextArea("Hello Sanothimi");
        txtArea.setBounds(50, 20, 300, 200);
        frame.add(txtArea);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new b_jtextarea();
    }
}
