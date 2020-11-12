package DrawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    ButtonGroup buttongroup = new ButtonGroup();
    JRadioButton bCirc;
    JRadioButton bRect;
    JRadioButton bSquare;
    public ShapeSelector(){
        bCirc = new JRadioButton("circle");
        bRect = new JRadioButton("rectangle");
        bSquare = new JRadioButton("square");

        buttongroup.add(bCirc);
        buttongroup.add(bRect);
        buttongroup.add(bSquare);

        add(bCirc);
        add(bRect);
        add(bSquare);

        bSquare.setSelected(true);
    }

    public int getCurrentShape(){
        if(bSquare.isSelected()){
            return 1;
        }
        if(bRect.isSelected()){
            return 2;
        }
        if(bCirc.isSelected()){
            return 3;
        }
        else{
            return 0;
        }
    }

}
