package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimsSelector extends JPanel {
    JSlider width;
    JSlider height;
    public RectDimsSelector(){

        height = new JSlider(1,100);
        width =new JSlider(1,100);

        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel(" Rectangle width and height");
        controls.add(label);
        controls.add(width);
        controls.add(height);
        add(controls);

    }

    public int getWidth(){
        return width.getValue();
    }

    public int getHeight(){
        return height.getValue();
    }
}
