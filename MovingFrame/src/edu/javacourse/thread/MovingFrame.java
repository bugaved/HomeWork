package edu.javacourse.thread;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MovingFrame extends JFrame implements ActionListener {

    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String UP = "UP";
    private static final String DOWN = "DOWN";

    private boolean directionRIGHT = false;
    private boolean directionUP = false;
    private boolean directionDOWN = false;
    private boolean directionLEFT = false;

    public boolean isDirectionRIGHT() {
        return directionRIGHT;
    }

    public void setDirectionRIGHT(boolean directionRIGHT) {
        this.directionRIGHT = directionRIGHT;
    }

    public boolean isDirectionUP() {
        return directionUP;
    }

    public void setDirectionUP(boolean directionUP) {
        this.directionUP = directionUP;
    }

    public boolean isDirectionDOWN() {
        return directionDOWN;
    }

    public void setDirectionDOWN(boolean directionDOWN) {
        this.directionDOWN = directionDOWN;
    }

    public boolean isDirectionLEFT() {
        return directionLEFT;
    }

    public void setDirectionLEFT(boolean directionLEFT) {
        this.directionLEFT = directionLEFT;
    }

    public MovingFrame() {
        JButton left = new JButton(LEFT);
        left.setActionCommand(LEFT);
        left.addActionListener(this);
        add(left, BorderLayout.WEST);

        JButton right = new JButton(RIGHT);
        right.setActionCommand(RIGHT);
        right.addActionListener(this);
        add(right, BorderLayout.EAST);

        JButton up = new JButton(UP);
        up.setActionCommand(UP);
        up.addActionListener(this);
        add(up, BorderLayout.NORTH);

        JButton down = new JButton(DOWN);
        down.setActionCommand(DOWN);
        down.addActionListener(this);
        add(down, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 300, 250, 200);
        setVisible(true);
        System.out.println("создали окно пульта");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        directionRIGHT = RIGHT.equals(e.getActionCommand());
        directionUP = UP.equals(e.getActionCommand());
        directionDOWN = DOWN.equals(e.getActionCommand());
        directionLEFT = LEFT.equals(e.getActionCommand());
        System.out.println("присвоили направления");
    }

}
