package edu.rhombus;

import javax.swing.JFrame;

public class RhombusFrame extends JFrame {

    public RhombusFrame() {

        RhombusComponent oc = new RhombusComponent();

        add(oc);

        setBounds(10, 10, 560, 560);
    }

}
