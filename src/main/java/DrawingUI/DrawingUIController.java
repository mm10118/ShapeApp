package DrawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Shapes.Drawing;
import Shapes.Shape;

public class DrawingUIController {

    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    Point p=new Point(200,200);
    Color c=new Color(0x992266);
    Point p2=new Point(100,100);
    Point p3=new Point(50,50);
    ShapeSelector sSel;
    ColorSelector cSel;
    CircleDimsSelector cdSel;
    RectDimsSelector rdSel;
    SquareDimsSelector sdSel;
    int countCirc;
    int countSquare;
    int countRect;
    JLabel label;
    JLabel label2;
    JLabel label3;
    Drawing draw = new Drawing();

    public DrawingUIController(){
        sSel = new ShapeSelector();
        cSel = new ColorSelector();
        cdSel = new CircleDimsSelector();
        rdSel = new RectDimsSelector();
        sdSel = new SquareDimsSelector();
        controlsPanel.setLayout(new GridLayout(5,1));
        mainPanel.setLayout(new GridLayout(2,1));
        countCirc = 0;
        countSquare = 0;
        countRect = 0;

        mainPanel.add(controlsPanel);
        mainPanel.add(draw);
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(cdSel);
        controlsPanel.add(rdSel);
        controlsPanel.add(sdSel);

        label = new JLabel("circles:"+ countCirc);
        label2 = new JLabel("rectangles:"+ countRect);
        label3 = new JLabel("Squares"+ countSquare);
        controlsPanel.add(label);
        controlsPanel.add(label2);
        controlsPanel.add(label3);

        draw.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                if(sSel.getCurrentShape() == 3){
                    draw.addCircle(e.getPoint(),cSel.getCurrentColor(),cdSel.getRadius());
                    draw.repaint();
                    countCirc++;
                }
                if(sSel.getCurrentShape() == 1){
                    draw.addSquare(e.getPoint(),cSel.getCurrentColor(), sdSel.getLength());
                    draw.repaint();
                    countSquare++;
                }
                if(sSel.getCurrentShape() == 2){
                    draw.addRect(e.getPoint(),cSel.getCurrentColor(),rdSel.getWidth(),rdSel.getHeight());
                    draw.repaint();
                    countRect++;
                }
                label.setText("circles:"+ countCirc);
                label2.setText("rectangles:"+ countRect);
                label3.setText("squares:"+ countSquare);

            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
