package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimsSelector extends JPanel {
    JSlider length;
    public SquareDimsSelector(){
        length = new JSlider(1,100);
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel(" Square length");
        controls.add(label);
        controls.add(length);
        add(controls);

    }
    public int getLength(){
        return length.getValue();
    }
}
