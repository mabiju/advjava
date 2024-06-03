package S_Layout_Managers;

import javax.swing.*;
import java.awt.*;

public class b_borderlayout_jframe {
    JFrame frame;

    b_borderlayout_jframe() {
        frame = new JFrame();
        JButton b1 = new JButton("Ram");
        JButton b2 = new JButton("Sita");
        JButton b3 = new JButton("Laxman");
        JButton b4 = new JButton("Hari");
        JButton b5 = new JButton("Nita");

        frame.setLayout(new BorderLayout(20, 10)); // for horizontal and vertical gap

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.WEST);
        frame.add(b4, BorderLayout.CENTER);
        frame.add(b5, BorderLayout.EAST);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new b_borderlayout_jframe();
    }
}
