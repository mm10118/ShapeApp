package Shapes;

import java.awt.*;

public class Rect extends Shape {

    private int h;// private Point pos;
    private int w;

    public Rect(Point initPos,Color col, int h, int w){
        super(initPos, col); // The constructor
        // Initialize fields
        this.h = h;
        this.w = w;


    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y,w,h);
    }
}
