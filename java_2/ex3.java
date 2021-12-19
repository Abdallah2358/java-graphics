package java_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ex3 extends Applet {
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        int appletHeight = 800;
        int appletwidth = 800;
        for(int i = 8; i>=0; i--)
        {	if((i%2)==0){  g2.setColor(Color.red);   }
        else
        {	g2.setColor(Color.blue);	}
            int rectheight = appletHeight * i / 8;
            int rectwidth = appletwidth * i / 8;
            int recttop = appletHeight / 2 - i * appletHeight / 16;
            int rectleft = appletwidth / 2 - i * appletwidth / 16;
            Ellipse2D oval=new Ellipse2D.Float(rectleft,recttop,rectwidth,rectheight);
            g2.fill(oval);
        }
    }
}
