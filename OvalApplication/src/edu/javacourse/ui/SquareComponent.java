package edu.javacourse.ui;

import java.awt.Graphics;
import javax.swing.JComponent;

public class SquareComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (getWidth() < getHeight()) {
            g.drawRect(20, 20, getWidth() - 40, getWidth() - 40);
        } else {
            g.drawRect(20, 20, getHeight() - 40, getHeight()- 40);
        }
    }
}
