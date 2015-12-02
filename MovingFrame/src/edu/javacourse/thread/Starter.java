package edu.javacourse.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Starter {

    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MovingFrame mf = new MovingFrame();
        Car car = new Car();

        Future<?> submit = es.submit(new MovingThread(car, mf));
        try {
            Object s = submit.get();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
