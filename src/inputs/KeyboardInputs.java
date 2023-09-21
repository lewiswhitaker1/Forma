package inputs;

import main.FormaPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener
{
    private FormaPanel formaPanel;

    public KeyboardInputs(FormaPanel formaPanel)
    {
        this.formaPanel = formaPanel;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_W:
                formaPanel.setYDelta(-5);
                break;
            case KeyEvent.VK_A:
                formaPanel.setXDelta(-5);
                break;
            case KeyEvent.VK_S:
                formaPanel.setYDelta(5);
                break;
            case KeyEvent.VK_D:
                formaPanel.setXDelta(5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
