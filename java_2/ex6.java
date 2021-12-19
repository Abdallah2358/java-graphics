package java_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class ex6 extends Applet {
    public void paint(Graphics g)
    {
        int[] xpoints={55,67,109,73,83,55,27,37,1,43};
        int[] ypoints={0,36,36,54,96,72,96,54,36,36};

        //step 1
        Graphics2D g2d=(Graphics2D) g ;
        //Step 2 using GeneralPath
        GeneralPath star=new GeneralPath();
        star.moveTo(xpoints[0],ypoints[0]);
        //loop to draw the star
        for (int k=1 ;k<xpoints.length;k++)
        {
            star.lineTo(xpoints[k],ypoints[k]);
        }
        g2d.translate(200,200);
        g2d.fill(star);
    }
}
