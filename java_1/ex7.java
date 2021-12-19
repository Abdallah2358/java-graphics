package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex7 extends Applet {
    int m =0;
    public void paint (Graphics g){
        g.fillRect(100,180,80,20);//base
        g.setColor(Color.lightGray);
        int []x ={110,170,140};
        int []y ={180,180,110};
        g.fillPolygon(x,y,x.length);//triangle holding
        g.setColor(Color.orange);
        g.fillOval(110,110,60,60);
        g.setColor(Color.red);
        for (int i = 0; i < 4; i++) {
            g.fillArc(110,110,60,60,i*90+m,30);
        }
        //for animation
        m++;

        repaint();
        try {
            Thread.sleep(5);
        } catch (Exception ignored) {}
    }
}
