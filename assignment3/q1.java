package assignment3;

import java.applet.Applet;
import java.awt.*;

public class q1  extends Applet {
    int x =0 , y=0,i=90,direction=1;
    public void paint(Graphics g) {
        x=(int)(100+100 *Math.cos((i*3.14/180.0)));
        y=(int)(100+100 *Math.sin((i*3.14/180.0)));

        g.setColor(Color.black );
        g.drawLine(100,100,x,y);

        g.setColor(Color.blue );
        g.fillOval(x-15,y-15,30,30);
        g.drawString(Integer.toString(i),100,100);
        i+=direction;
        if (i==135){
            direction=-1;
        }else if (i==45){
            direction=1;
        }
        repaint(1);
        try {
            Thread.sleep(100);
        }catch (Exception ignored){

        }
    }
}
