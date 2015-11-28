package edu.javacourse.thread;

public class Starter {

    public static void main(String[] args) {
        MovingFrame mf = new MovingFrame();
        Car car = new Car();
        MovingThread mt = new MovingThread(car, mf);
        mt.start();
    }
}
