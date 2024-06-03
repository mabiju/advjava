package U_Menu;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class f_keyboard_mnemonics_accelerators extends JFrame {
  f_keyboard_mnemonics_accelerators() {
    // Sample 01: Set Size and Position
    setBounds(100, 100, 450, 250);
    Container ControlHost = getContentPane();
    ControlHost.setLayout(new BorderLayout());

    // Sample 02: Create Menu Bar and add to JFrame
    JMenuBar menubar = new JMenuBar();
    setJMenuBar(menubar);

    // Sample 03: Create Menu and Add it to Menu bar
    JMenu mnuFruits = new JMenu("Fruits");
    menubar.add(mnuFruits);

    // Sample 04: Create Menu Items
    JMenuItem miApple = new JMenuItem("Apple");
    JMenuItem miCherry = new JMenuItem("Cherry");
    JMenuItem miGrapes = new JMenuItem("Grapes");

    // Sample 05: Create Sub Menu For Banana
    JMenu subMenuBanana = new JMenu("Banana");
    JMenuItem submiBanana1 = new JMenuItem("Type I");
    JMenuItem submiBanana2 = new JMenuItem("Type II");
    JMenuItem submiBanana3 = new JMenuItem("Type III");
    subMenuBanana.add(submiBanana1);
    subMenuBanana.add(submiBanana2);
    subMenuBanana.add(submiBanana3);

    // Sample 06: Add Menu Items to Menu
    mnuFruits.add(miApple);
    mnuFruits.add(subMenuBanana);
    mnuFruits.add(miCherry);
    mnuFruits.add(miGrapes);

    // Sample 07: Show Message when Grapes and Banana II Clicked
    miGrapes.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f_keyboard_mnemonics_accelerators.this, "Grapes Clicked");
      }
    });
    submiBanana2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f_keyboard_mnemonics_accelerators.this, "Banana II Clicked");
      }
    });

    // Sample 07: Set Mnemonics for Three Menu Items & One Menu
    mnuFruits.setMnemonic(KeyEvent.VK_F);
    miApple.setMnemonic(KeyEvent.VK_A);
    miCherry.setMnemonic(KeyEvent.VK_C);
    miGrapes.setMnemonic(KeyEvent.VK_G);
    subMenuBanana.setMnemonic(KeyEvent.VK_B);

    // Sample 08: Set Accelerator for Grapes and Type II banana
    @SuppressWarnings("deprecation")
    KeyStroke acclGrapes = KeyStroke.getKeyStroke(
        KeyEvent.VK_G, Event.CTRL_MASK);
    @SuppressWarnings("deprecation")
    KeyStroke acclBananaII = KeyStroke.getKeyStroke(
        KeyEvent.VK_B, Event.SHIFT_MASK);
    miGrapes.setAccelerator(acclGrapes);
    submiBanana2.setAccelerator(acclBananaII);
    setVisible(true);
  }

  public static void main(String[] args) {
    new f_keyboard_mnemonics_accelerators();
  }
}