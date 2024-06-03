package S_Layout_Managers;

import java.awt.*;

public class f_gridbaglayout extends Frame {

    f_gridbaglayout() {
        Label lblName = new Label("Name");
        TextField txtName = new TextField(10);
        Label lblcomments = new Label("Comments");
        TextArea TAreaComments = new TextArea(6, 15);
        Button btnSubmit = new Button("Submit");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        add(lblName, gc, 0, 0, 1, 1, 0, 0);
        add(txtName, gc, 1, 0, 1, 1, 0, 20);
        add(lblcomments, gc, 0, 1, 1, 1, 0, 0);
        add(TAreaComments, gc, 1, 1, 1, 1, 0, 60);
        add(btnSubmit, gc, 0, 2, 2, 1, 0, 20);

    }

    void add(Component comp, GridBagConstraints gc, int x, int y, int w, int h, int wx, int wy) {
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.weightx = wx;
        gc.weighty = wy;
        add(comp, gc);

    }

    public static void main(String[] args) {
        f_gridbaglayout frame = new f_gridbaglayout();
        frame.setTitle("Gridbag Layout");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
