import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;//java 2d

public class temp extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;//java 2

        repaint();
        try {Thread.sleep(55); } catch (Exception e) {}
    }
}
