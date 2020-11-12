package Shapes;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // A private field called f of class Frsame. This is also in the AWT.
    private Frame f;
    private Circle circle;
    Point p=new Point(200,200);
    Color c=new Color(0x992266);
    private Rect rect;
    Point p2 = new Point (100,100);
    Color c2=new Color(0x637490);
    ArrayList<Shape> shape;
    ShapeDB shapedb;
    private Square square;




    // The constructor
    public Drawing() {

        setupShapes();
        //setupFrame(circle, rect);
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame



    }

    public void setupShapes(){
        shapedb = new ShapeDB();
        shape = shapedb.shape;
    }

    public void addCircle (Point pos, Color col, int radius){
        shapedb.addCircle(pos, col, radius);
    }
    public void addSquare (Point pos, Color col, int length){
        shapedb.addSquare(pos, col, length);
    }
    public void addRect (Point pos, Color col, int w, int h){
        shapedb.addRect(pos, col, w, h);
    }

    private void setupFrame(Circle circle, Rect rect) {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        this.circle = circle;
        this.rect = rect;
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        shapedb.drawShapes(g);

    }
}

