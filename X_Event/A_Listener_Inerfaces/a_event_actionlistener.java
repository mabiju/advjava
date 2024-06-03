package X_Event.A_Listener_Inerfaces;

import java.awt.*;
import java.awt.event.*;

public class a_event_actionlistener extends Frame implements ActionListener {

    TextField tf;

    a_event_actionlistener() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        Button btn = new Button("Click Here");
        btn.setBounds(100, 100, 100, 40);

        btn.addActionListener(this); // passing current instance

        add(btn);
        add(tf);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello Sanothimi");
    }

    public static void main(String[] args) {
        new a_event_actionlistener();
    }

}
