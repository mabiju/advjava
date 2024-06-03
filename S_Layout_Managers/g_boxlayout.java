package S_Layout_Managers;

import java.awt.*;
import javax.swing.*;

public class g_boxlayout extends Frame {
    Button buttons[];

    g_boxlayout() {
        buttons = new Button[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            // adding the buttons so that it can be displayed
            add(buttons[i]);
        }
        // the buttons will be placed horizontally
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setSize(400, 400);
        setVisible(true);
    }
    // main method

    public static void main(String args[]) {
        new g_boxlayout();
    }
}
