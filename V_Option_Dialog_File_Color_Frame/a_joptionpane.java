package V_Option_Dialog_File_Color_Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class a_joptionpane {
    JFrame optionPane_f;

    a_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showMessageDialog(optionPane_f, "Hello, Welcome to Sanothimi College");
    }

    public static void main(String[] args) {
        new a_joptionpane();
    }
}
