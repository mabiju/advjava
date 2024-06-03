package U_Menu;

import javax.swing.*;
import java.awt.event.*;

class e_jpopupmenu {
    e_jpopupmenu() {
        final JFrame popup_f = new JFrame("Popup Menu Demo");
        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem popup_copy = new JMenuItem("Copy");
        JMenuItem popup_cut = new JMenuItem("Cut");
        JMenuItem popup_paste = new JMenuItem("Paste");
        popupmenu.add(popup_copy);
        popupmenu.add(popup_cut);
        popupmenu.add(popup_paste);
        popup_f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent a) {
                popupmenu.show(popup_f, a.getX(), a.getY());
            }
        });
        popup_f.add(popupmenu);
        popup_f.setSize(300, 300);
        popup_f.setLayout(null);
        popup_f.setVisible(true);
    }

    public static void main(String args[]) {
        new e_jpopupmenu();
    }
}

// to see the effect click on output screen.
