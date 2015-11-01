package edu.triangle;

import javax.swing.JFrame;

public class TriangleFrame extends JFrame {

    public TriangleFrame() {

        TriangleComponent oc = new TriangleComponent();

        add(oc);

        setBounds(10, 10, 500, 500);
    }

}
