import javax.swing.*;
import java.awt.*;

public class FormaPanel extends JPanel
{
    public FormaPanel()
    {

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}
