package X_Event.A_Listener_Inerfaces;

import java.awt.*;
import java.awt.event.*;

class f_event_mouselistener {
  public static void main(String args[]) {
    Frame frame = new Frame("MouseEventExample");
    Button btn = new Button("Click Me");
    btn.setBounds(100, 100, 100, 50);
    Panel p = new Panel();
    p.add(btn);
    frame.add(btn, BorderLayout.NORTH);
    frame.pack();
    frame.setSize(400, 400);
    frame.setVisible(true);
    btn.addMouseListener(new MouseAdapter() {
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
