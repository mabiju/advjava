package X_Event.B_Adapter_Classes;

import java.awt.*;
import java.awt.event.*;

class d_mouse_adapter {
    public static void main(String args[]) {
        Frame frame = new Frame("Mouse Adapter Example");
        Button button1 = new Button("A");
        Panel p = new Panel();
        p.add(button1);
        frame.add(button1, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                System.out.println("mousePressed " + me.getX());
            }

            public void mouseReleased(MouseEvent me) {
                System.out.println("mouseReleased " + me.getX());
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}