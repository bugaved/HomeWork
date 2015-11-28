package edu.javacourse.thread;

public class MovingThread extends Thread {

    private Car car;
    private MovingFrame frame;

    public MovingThread(Car car, MovingFrame frame) {
        this.frame = frame;
        this.car = car;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                car.moveFrame(frame);
            } catch (InterruptedException ex) {
            }
        }
    }
}
