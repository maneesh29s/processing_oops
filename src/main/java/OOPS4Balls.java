import processing.core.PApplet;

public class OOPS4Balls extends PApplet {
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    private final int diameter = 50;
    Circle c1,c2,c3,c4;

    public static void main(String[] args) {
        PApplet.main("OOPS4Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        setBackground();
        c1 = new Circle(0,HEIGHT/5,diameter,1);
        c2 = new Circle(0,2*HEIGHT/5,diameter,2);
        c3 = new Circle(0,3*HEIGHT/5,diameter,3);
        c4 = new Circle(0,4*HEIGHT/5,diameter,4);
    }

    @Override
    public void draw() {
//        setBackground();
//        c1.run();
//        c2.run();
//        c3.run();
//        c4.run();
        drawCircle(c1);
        drawCircle(c2);
        drawCircle(c3);
        drawCircle(c4);

    }

    private void drawCircle(Circle c) {
        ellipse(c.getxPos(),c.getyPos(),c.getDiameter(),c.getDiameter());
        c.setxPos(c.getxPos() + c.getSpeed());
    }

    private void setBackground() {
        int whiteBack = 255;
        background(whiteBack);
    }

}
