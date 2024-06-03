package U_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class a_jmenu_jmenubar_jmenuitem {
    JMenu m_menu, m_submenu;
    JMenuItem menu_i1, menu_i2, menu_i3, menu_i4, menu_i5;

    a_jmenu_jmenubar_jmenuitem() {
        JFrame menu_f = new JFrame("Menu and Menu Item Demo");

        JMenuBar m_menuBar = new JMenuBar();
        m_menu = new JMenu("Menu");
        m_submenu = new JMenu("Products");

        menu_i1 = new JMenuItem("Home");
        menu_i2 = new JMenuItem("About");
        menu_i3 = new JMenuItem("Services");
        menu_i4 = new JMenuItem("Trainings");
        menu_i5 = new JMenuItem("Research");

        menu_i1.setEnabled(false);  // disabling the menu item 

        m_menu.add(menu_i1);
        m_menu.add(menu_i2);
        m_menu.add(menu_i3);
        // m_menu.add(menu_i4);
        // m_menu.add(menu_i5);
        m_submenu.add(menu_i4);
        m_submenu.add(menu_i5);

        m_menu.add(m_submenu);

        m_menuBar.add(m_menu);

        menu_f.setJMenuBar(m_menuBar);
        menu_f.setSize(400, 400);
        menu_f.setLayout(null);
        menu_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu_f.setVisible(true);

    }

    public static void main(String[] args) {
        new a_jmenu_jmenubar_jmenuitem();
    }
}
