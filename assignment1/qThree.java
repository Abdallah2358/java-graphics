package assignment1;

import java.applet.Applet;
import java.awt.*;

public class qThree extends Applet {
    public void paint(Graphics g) {
        //red
        g.setColor(Color.red);
        //upper oval
        g.fillOval(500, 100, 100, 100);
        //lower oval
        g.fillOval(450, 160, 200, 150);
        g.setColor(Color.black);
        int[] x = {550, 600, 615, 630, 570, 550};
        int[] y = {100, 90, 85, 80, 85, 100};
        g.drawPolygon(x, y, 6);


    }
}

