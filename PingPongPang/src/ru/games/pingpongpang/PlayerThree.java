
package ru.games.pingpongpang;


public class PlayerThree implements Runnable {
       private Ball ball;
    public PlayerThree(Ball ball) {
    this.ball = ball;
    }

    @Override
    public void run() {
        for(int i = 0; i<Ball.COUNT; i++){
        ball.pang(i);
        }
    } 
}
