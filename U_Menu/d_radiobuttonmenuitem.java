package U_Menu;

import java.awt.*;
import javax.swing.*;

public class d_radiobuttonmenuitem extends JFrame {
    private JMenuBar mb;
    private JMenu m;
    private JRadioButtonMenuItem m1, m2, m3, m4;
    private ButtonGroup bg;

    d_radiobuttonmenuitem() {
        setTitle("JRadioButtonMenuItem Test");
        setLayout(new FlowLayout());
        bg = new ButtonGroup();
        mb = new JMenuBar();
        m = new JMenu("Menu");
        m1 = new JRadioButtonMenuItem();
        m2 = new JRadioButtonMenuItem(new javax.swing.text.DefaultEditorKit.BeepAction());
        m3 = new JRadioButtonMenuItem("Item 3");
        m4 = new JRadioButtonMenuItem("Item 4", true);
        m1.setText("Item 1");
        m1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        m1.setSelected(true);
        m2.setAccelerator(KeyStroke.getKeyStroke("ctrl 2"));
        m3.setEnabled(false);
        bg.add(m1);
        bg.add(m2);
        bg.add(m3);
        bg.add(m4);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        mb.add(m);
        setJMenuBar(mb);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new d_radiobuttonmenuitem();
    }
}
