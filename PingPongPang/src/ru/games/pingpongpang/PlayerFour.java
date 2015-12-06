
package ru.games.pingpongpang;

public class PlayerFour implements Runnable {
        private Ball ball;
    public PlayerFour(Ball ball) {
    this.ball = ball;
    }

    @Override
    public void run() {
        for(int i = 0; i<Ball.COUNT; i++){
        ball.badabang(i);
        }
    }
}
