package V_Option_Dialog_File_Color_Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class b_joptionpane {
    JFrame optionPane_f;

    b_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showInputDialog(optionPane_f, "Enter your Name");
    }

    public static void main(String[] args) {
        new b_joptionpane();
    }
}
