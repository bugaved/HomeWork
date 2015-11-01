package edu.javacourse.ui;

import javax.swing.JFrame;

public class SquareFrame extends JFrame {

    public SquareFrame() {

        SquareComponent oc = new SquareComponent();

        add(oc);

        setBounds(100, 100, 380, 380);
    }

}
