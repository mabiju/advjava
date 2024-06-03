package X_Event.A_Listener_Inerfaces;

import java.awt.*;
import java.awt.event.*;

public class e_event_keylistener implements KeyListener {
    Label lbl_1, lbl_2, lbl_3;
    TextField tf;
    Frame fr;
    String s;

    e_event_keylistener() {
        fr = new Frame("KeyEventListener Example");
        lbl_1 = new Label(" Key Events action", Label.CENTER);
        lbl_2 = new Label();
        lbl_3 = new Label();
        tf = new TextField(20);
        fr.setLayout(new FlowLayout());
        fr.add(lbl_1);
        fr.add(lbl_2);
        fr.add(tf);
        tf.addKeyListener(this);
        fr.setSize(400,400);
        fr.setVisible(true);
    }

    // events to be done on pressing key
    public void keyPressed(KeyEvent ev) {
        lbl_2.setText("Pressed Key");
    }

    // events to be done on releasing key
    public void keyReleased(KeyEvent ev) {
        lbl_2.setText(" Released key");
    }

    // events to be done on typing key
    public void keyTyped(KeyEvent ev) {
        lbl_2.setText("Key is typed");
        // set the visibility as true
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new e_event_keylistener();
    }
}
