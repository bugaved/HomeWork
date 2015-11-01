package edu.rhombus;

import java.awt.Graphics;
import javax.swing.JComponent;

public class RhombusComponent extends JComponent {

    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     int x1 = getWidth() / 2-100;
     int y1 = getHeight() / 2;
     int x2 = getWidth()/2;
     int y2 = getHeight()/100;
     int x3 = getWidth()/2+100;
     int y3 = getHeight()/2;
     int x4 = getWidth()/2;
     int y4 = getHeight()*99/100;

    g.drawLine (x1, y1, x2, y2);

    g.drawLine (x1, y1, x4, y4);

    g.drawLine (x3, y3, x2, y2);

    g.drawLine (x3, y3, x4, y4);
}
}
