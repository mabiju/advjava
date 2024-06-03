package X_Event.A_Listener_Inerfaces;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class d_event_itemlistener {
  public static void main(String args[]) {
    Frame frame = new Frame("ItemEvent Example");
    
    final Checkbox checkbox = new Checkbox("Checkbox 1");
    frame.add(checkbox, BorderLayout.NORTH);
    frame.pack();
    frame.setBounds(100,100,200,200);
    frame.setVisible(true);
    checkbox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent ie) {
        if (checkbox.getState() == true) {
          JOptionPane.showMessageDialog(null, "checkbox is checked");
        } else {
          JOptionPane
              .showMessageDialog(null, "checkbox is unchecked");
        }
      }
    });
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}