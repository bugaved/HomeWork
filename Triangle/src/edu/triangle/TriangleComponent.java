package edu.triangle;

import java.awt.Graphics;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x1 = getWidth() / 2 - 100;
        int y1 = getHeight()-20;
        int x2 = getWidth() / 2;
        int y2 = getHeight() / 100;
        int x3 = getWidth() / 2 + 100;
        int y3 = getHeight()-20 ;
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }
}
