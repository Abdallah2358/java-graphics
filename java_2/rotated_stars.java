package java_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.GeneralPath;


public class rotated_stars extends Applet {
    public void paint(Graphics g)
    {
        int[] xpoints={55,67,109,73,83,55,27,37,1,43};
        int[] ypoints={0,36,36,54,96,72,96,54,36,36};
        //Step 1
        Graphics2D g2d=(Graphics2D)g;
        //Step 2: using GeneralPath
        GeneralPath Star=new GeneralPath();
        Star.moveTo(xpoints[0],ypoints[0]);
        //loop to draw all stars
        for(int i=1;i<xpoints.length;i++)
            Star.lineTo(xpoints[i],ypoints[i]);
        g2d.translate(200,200);
        for(int j=1 ;j<=20;j++)
        {
            g2d.rotate(Math.PI/20.0);
            g2d.setColor(new Color((int)(Math.random()*265),(int)(Math.random()*265),(int)(Math.random()*265)));
            g2d.fill(Star);
        }
    }
}
