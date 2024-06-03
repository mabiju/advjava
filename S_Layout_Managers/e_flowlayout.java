package S_Layout_Managers;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class e_flowlayout extends JFrame {
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");

    public e_flowlayout() {
        setTitle("Flow Layout");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.add(b1);
        c.add(b2);
        c.add(b3, 0);
        c.add(b4);
        c.add(b5, 0);

        FlowLayout f = new FlowLayout();
        // FlowLayout f = new FlowLayout(FlowLayout.RIGHT,20,30);
        // f.setHgap(20);
        // f.setVgap(30);
        c.setLayout(f);
    }

    public static void main(String[] args) {
        new e_flowlayout();
    }

}
