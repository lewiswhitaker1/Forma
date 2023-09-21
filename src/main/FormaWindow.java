package main;

import javax.swing.*;

public class FormaWindow extends JFrame
{
    private JFrame jFrame;
    public FormaWindow(FormaPanel formaPanel)
    {
        jFrame = new JFrame();
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(formaPanel);
        jFrame.setTitle("main.Forma (dev)");
        jFrame.setVisible(true);
    }
}
