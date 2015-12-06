package ru.games.pingpongpang;

public class Ball {

    public static final int COUNT = 20;
    private static int x = 1;
    private static boolean isWait = false;

    public synchronized void ping(int n) {
        for (int k = 0; k < 4; k++) {
            if (x != 1) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                }
            }
        }
        if (x == 1) {
            System.out.println("ping " + n);
            x = 2;
        }
        notifyAll();

    }

    public synchronized void pong(int n) {
        for (int k = 0; k < 4; k++) {
            if (x != 2) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                }
            }
        }
        if (x == 2) {
            System.out.println("pong " + n);
            x = 3;
        }
        notifyAll();
    }

    public synchronized void pang(int n) {
        for (int k = 0; k < 4; k++) {
            if (x != 3) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                }
            }
        }
        if (x == 3) {
            System.out.println("pang " + n);
            x = 4;
        }
        notifyAll();
    }

    public synchronized void badabang(int n) {
        for (int k = 0; k < 4; k++) {
            if (x != 4) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                }
            }
        }
        if (x == 4) {
            System.out.println("BADABANG " + n);
            x = 1;
        } else {
            n--;
        }
        notifyAll();
    }
}
