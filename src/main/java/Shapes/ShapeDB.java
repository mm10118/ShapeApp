package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    protected Point pos;
    protected Color col;

    protected Square square;
    protected Circle circle;
    protected Rect rect;
    protected ArrayList<Shape> shape;

    public ShapeDB(){

        shape = new ArrayList<>();
    }
    public void addSquare (Point pos, Color col,int length ){
        square = new Square( pos, col, length);
        shape.add(square);
    }
    public void addCircle (Point pos, Color col, int radius){
        circle = new Circle(pos, col, radius);
        shape.add(circle);
    }
    public void addRect(Point pos, Color col, int w, int h){
        rect = new Rect(pos, col, w, h);
        shape.add(rect);
    }
    public void drawShapes(Graphics g){
        for(Shape s: shape){
            s.draw(g);
        }
    }
}
