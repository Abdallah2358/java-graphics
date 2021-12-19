package java_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ex4 extends Applet {
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        int x=50 , y=50 , w=100;
        Rectangle2D rect=new Rectangle2D.Float(x,y,w,w);
        for(int i=8;i>=0;i--)
        {
            if((i%2)==0){g2.setColor(Color.blue);}
            else { g2.setColor(Color.black); }
            g2.scale(1.2,1.2);
            g2.draw(rect);
        }
    }
}
