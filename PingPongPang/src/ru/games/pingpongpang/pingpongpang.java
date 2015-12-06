package ru.games.pingpongpang;

public class pingpongpang {

    public static void main(String[] args) throws Exception {
        Ball ball = new Ball();
        PlayerOne p1 = new PlayerOne(ball);
        PlayerTwo p2 = new PlayerTwo(ball);
        PlayerThree p3 = new PlayerThree(ball);
        PlayerFour p4 = new PlayerFour(ball);
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        Thread.sleep(1000);
    }

}
