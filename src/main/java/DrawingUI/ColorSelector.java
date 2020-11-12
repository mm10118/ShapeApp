package DrawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelector extends JPanel {
    JButton btn1;
    Color CurrentColor;
    public ColorSelector(){
        btn1 = new JButton("Select Color");
        CurrentColor = Color.BLACK;

        add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", CurrentColor);
                CurrentColor = newColour;
                btn1.setBackground(CurrentColor);
            }
        });
    }
    public Color getCurrentColor(){
        return CurrentColor;
    }
}
