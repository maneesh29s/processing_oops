import processing.core.PApplet;

public class Circle extends OOPS4Balls{
    private int xPos;
    private int yPos;
    private int diameter;
    private int speed;

    public Circle() {
        xPos = yPos = diameter = speed = 0;
    }

    public Circle(int xPos, int yPos, int diameter) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.diameter = diameter;
    }

    public Circle(int xPos, int yPos, int diameter, int speed) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void run() {
        super.ellipse(xPos,yPos,diameter,diameter);
        xPos += speed;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
