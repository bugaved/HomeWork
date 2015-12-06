
package ru.games.pingpongpang;

public class PlayerTwo implements Runnable {
    private Ball ball;
    public PlayerTwo(Ball ball) {
    this.ball = ball;
    }

    @Override
    public void run() {
        for(int i = 0; i<Ball.COUNT; i++){
        ball.pong(i);
        }
    }
}
