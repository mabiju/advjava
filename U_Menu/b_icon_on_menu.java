package U_Menu;

import java.awt.*;
import javax.swing.*;

public class b_icon_on_menu extends JFrame {
	public b_icon_on_menu() {
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

		// Sample 04: Create Image Icons
		ImageIcon icoPineapple = new ImageIcon("D:/SCAJAVAM1/U_Menu/zx_pineapple.png");
		ImageIcon icoBanana = new ImageIcon("D:/SCAJAVAM1/U_Menu/zw_banana.png");
		ImageIcon icoStrawberry = new ImageIcon("D:/SCAJAVAM1/U_Menu/zy_strawberry.png");
		ImageIcon icoWatermelon = new ImageIcon("D:/SCAJAVAM1/U_Menu/zz_watermelon.png");

		// Sample 05: Create Menu Items
		JMenuItem miPineapple = new JMenuItem("Pineapple", icoPineapple);
		JMenuItem miBanana = new JMenuItem("Banana", icoBanana);
		JMenuItem miStrawberry = new JMenuItem("Strawberry", icoStrawberry);
		JMenuItem miWatermelon = new JMenuItem("Watermelon", icoWatermelon);

		// Sample 06: Add Menu Items to Menu
		mnuFruits.add(miPineapple);
		mnuFruits.add(miBanana);
		mnuFruits.add(miStrawberry);
		mnuFruits.add(miWatermelon);
		setVisible(true);
	}

	public static void main(String[] args) {
		new b_icon_on_menu();
	}
}