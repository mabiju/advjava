package X_Event.B_Adapter_Classes;

import java.awt.*;
import java.awt.event.*;

public class e_window_adapter {
    Frame f;
    e_window_adapter() {
        f = new Frame("Window Adapter");
        // adding the WindowListener to the frame
        // overriding the windowClosing() method
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new e_window_adapter();
    }
}
