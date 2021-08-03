import processing.core.PApplet;

import java.util.ArrayList;

public class TryProcessing extends PApplet {
    private ArrayList<Ball> balls = new ArrayList<>();

    @Override
    public void settings() {
        super.settings();
        size(BallConstant.WINDOW_WIDTH, BallConstant.WINDOW_HEIGHT);
        generateBalls();
    }

    private void generateBalls() {
        for (int i = 0; i < 4; i++) {
            balls.add(new Ball(BallConstant.BALL_DIAMETER, this));
        }
    }

    @Override
    public void draw() {
        balls.get(0).drawBall(BallConstant.WINDOW_HEIGHT / BallConstant.WINDOW_DIVIDER, BallConstant.INCREMENT_BALL_ONE);
        balls.get(1).drawBall(BallConstant.WINDOW_HEIGHT * BallConstant.INCREMENT_BALL_TWO / BallConstant.WINDOW_DIVIDER, BallConstant.INCREMENT_BALL_TWO);
        balls.get(2).drawBall(BallConstant.WINDOW_HEIGHT * BallConstant.INCREMENT_BALL_THREE / BallConstant.WINDOW_DIVIDER, BallConstant.INCREMENT_BALL_THREE);
        balls.get(3).drawBall(BallConstant.WINDOW_HEIGHT * BallConstant.INCREMENT_BALL_FOUR / BallConstant.WINDOW_DIVIDER, BallConstant.INCREMENT_BALL_FOUR);
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

}

