// How to set action command to JButton in Java
package X_Event.C_Action_Command;

import java.awt.event.*;
import javax.swing.*;

public class a_action_button {
   public static void main(final String args[]) {
      JButton btn = new JButton("Click This");
      ActionListener actionListener = new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            String str = event.getActionCommand();
            System.out.println("Clicked = " + str);
         }
      };

      // use of action command
      btn.setActionCommand("My Button");
      btn.addActionListener(actionListener);
      JOptionPane.showMessageDialog(null, btn);
   }
}