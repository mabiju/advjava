package X_Event.C_Action_Command;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class b_action_button {
    public static void main(String args[]) {
        Frame frame = new Frame("Action Command Example");
        ActionListener buttonListener = new ButtonListener();
        Button button1 = new Button("A");
        frame.add(button1, BorderLayout.NORTH);
        button1.addActionListener(buttonListener);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        String choice = event.getActionCommand();
        JOptionPane.showMessageDialog(null, "You have clicked: " + choice);
    }
}
