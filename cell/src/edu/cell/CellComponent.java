package edu.cell;

import java.awt.Graphics;
import javax.swing.JComponent;

public class CellComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(20, 20, getWidth()*9/10, getHeight()*9/10);
        g.drawLine(getWidth()*9/10+20, getHeight()/3, 20, getHeight()/3);
        g.drawLine(getWidth()*9/10+20, getHeight()*2/3, 20, getHeight()*2/3);
        g.drawLine(getWidth()/3, 20, getWidth()/3, getHeight()*9/10+20);
        g.drawLine(getWidth()*2/3, 20, getWidth()*2/3, getHeight()*9/10+20);
    }
}
