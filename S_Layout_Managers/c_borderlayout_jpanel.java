package S_Layout_Managers;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class c_borderlayout_jpanel extends JFrame {
    c_borderlayout_jpanel() {
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Header"), BorderLayout.NORTH);
        pa.add(new JButton("Footer"), BorderLayout.SOUTH);
        pa.add(new JButton("Right"), BorderLayout.EAST);
        pa.add(new JButton("Left"), BorderLayout.WEST);
        pa.add(new JButton("Center"), BorderLayout.CENTER);

        add(pa);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new c_borderlayout_jpanel();
    }
}
