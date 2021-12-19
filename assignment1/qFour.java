package assignment1;

import java.applet.Applet;
import java.awt.*;

public class qFour extends Applet {
    public void paint(Graphics g) {
        //main circle
        g.drawOval(0, 0, 400, 400);
        //eyeleft
        g.drawOval(100, 100, 40, 20);
        g.fillOval(115, 100, 10, 20);
        //eyeright
        g.drawOval(280, 100, 40, 20);
        g.fillOval(295, 100, 10, 20);
        //blue
        g.setColor(Color.blue);
        //triangle nose
        int[] x = {175, 225, 200, 175};
        int[] y = {225, 225, 175, 225};
        g.fillPolygon(x, y, 4);

        //red
        g.setColor(Color.red);
        //rectangle mouse
        g.fillRect(175, 325, 50, 25);
    }
}


