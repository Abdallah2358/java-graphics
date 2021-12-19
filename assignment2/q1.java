package assignment2;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class q1 extends Applet {
   

    public void paint(Graphics g) {
        for (int i = 0; i < 360; i+=360/10) {
            //seting the color to something random
            g.setColor(new Color(
                    new Random().nextInt(256),
                    new Random().nextInt(256),
                    new Random().nextInt(256)
            ));
            //draw an arc
            g.fillArc(50,50,150,150,i,360/10);

        }
        // after filling the archs we fill the inside
        g.setColor(Color.white);
        g.fillOval(75+12,75+12,75,75);
    }
}
