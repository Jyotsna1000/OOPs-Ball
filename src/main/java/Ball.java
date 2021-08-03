import processing.core.PApplet;

public class Ball {
    public int diameter;
    public int speed;
    PApplet parent;

    public Ball(int diameter, PApplet parent) {
        this.parent = parent;
        this.diameter = diameter;
    }

    public void drawBall(int position, int speedCounter) {
        parent.ellipse(this.speed, position, diameter, diameter);
        setSpeed(speedCounter);
    }

    private void setSpeed(int speedCounter) {
        speed += speedCounter;
    }
}
