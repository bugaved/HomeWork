package edu.javacourse.thread;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class Car extends JFrame {

    private MovingFrame mf;
    private static final int STEP = 5;

    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 250, 200);
        setVisible(true);
        System.out.println("создали машину");
    }

    public void moveFrame(MovingFrame frame) {
        mf = frame;
        Rectangle r = getBounds();

        if (mf.isDirectionRIGHT()) {
            r.x += STEP;
            System.out.println("двигаемся");
        }
        if (mf.isDirectionLEFT()) {
            r.x -= STEP;
            System.out.println("двигаемся");
        }
        if (mf.isDirectionDOWN()) {
            r.y += STEP;
            System.out.println("двигаемся");
        }
        if (mf.isDirectionUP()) {
            r.y -= STEP;
            System.out.println("двигаемся");
        }
        setBounds(r);
    }
}
