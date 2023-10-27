import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="KeyEvents" width=300 height=300>
</applet> */

public class KeyEvents extends Applet implements KeyListener {
    Font f = new Font("Courier New", Font.BOLD, 50);
    String msg = "Typed key: ";
    int x = 30, y = 50;

    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up!");
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down!");
    }

    public void paint(Graphics g) {
        g.setFont(f);
        g.drawString(msg, x, y);
    }
}
