package X_Event.A_Listener_Inerfaces;

import java.awt.*;
import java.awt.event.*;

public class b_event_adjustmentlistener {
  public static void main(String[] args) {
    Frame frame = new Frame("AdjustmentListenerExample");
    Label label = new Label("Welcome To JavaTips.net");
    Scrollbar hbar = new Scrollbar(Scrollbar.HORIZONTAL, 30, 20, 0, 300);
    Scrollbar vbar = new Scrollbar(Scrollbar.VERTICAL, 30, 40, 0, 300);
    frame.setLayout(new BorderLayout());
    frame.add(hbar, BorderLayout.SOUTH);
    frame.add(vbar, BorderLayout.EAST);
    frame.add(label, BorderLayout.CENTER);
    AdjustmentListener adjustmentListener = new MyAdjustmentListener();
    hbar.addAdjustmentListener(adjustmentListener);
    vbar.addAdjustmentListener(adjustmentListener);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

class MyAdjustmentListener implements AdjustmentListener {
  public void adjustmentValueChanged(AdjustmentEvent ae) {
    System.out.println(ae.getValue());
  }
}