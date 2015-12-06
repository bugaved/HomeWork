package ru.games.pingpongpang;

public class PlayerOne implements Runnable {
private Ball ball;
    public PlayerOne(Ball ball) {
    this.ball = ball;
    }

    @Override
    public void run() {
        for(int i = 0; i<Ball.COUNT; i++){
        ball.ping(i);
        }
    }
}
