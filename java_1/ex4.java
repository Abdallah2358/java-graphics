package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex4 extends Applet {
    public void paint(Graphics g){
        //hair
        g.fillArc(108,80,110,120,0,180);
        //face
        g.setColor(Color.orange);
        g.fillOval(100,100,130,150);
        //eye white
        g.setColor(Color.white);
        g.fillOval(120,140,40,20);        //left
        g.fillOval(170,140,40,20);        //right
        //eye black
        g.setColor(Color.black);
        g.fillOval(130,140,20,20); //left
        g.fillOval(180,140,20,20); //right
        //eyebrows
        g.drawArc(110,130,50,20,0,180);//left
        g.drawArc(170,130,50,20,0,180);//right
        // nose
        int [ ]x={165,180,150};
        int [ ]y={160,190,190};
        g.fillPolygon(x,y,x.length); //triangle
        g.fillArc(165-15,190-10,30,20,0,-180);//arc
        //mouth
        g.setColor(Color.gray);
        g.fillArc(130,198,70,30,180,180);
    }
}
