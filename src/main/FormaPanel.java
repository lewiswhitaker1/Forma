package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class FormaPanel extends JPanel
{
    private MouseInputs mouseInputs;
    private int xDelta = 0, yDelta = 0;
    public FormaPanel()
    {
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void setXDelta(int value)
    {
        this.xDelta +=value;
        repaint();
    }

    public void setYDelta(int value)
    {
        this.yDelta +=value;
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(100 + xDelta, 100 + yDelta, 200, 50);
    }
}
