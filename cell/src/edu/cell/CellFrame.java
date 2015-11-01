package edu.cell;

import javax.swing.JFrame;

public class CellFrame extends JFrame {

    public CellFrame() {

        CellComponent oc = new CellComponent();

        add(oc);

        setBounds(10, 10, 560, 560);
    }

}
