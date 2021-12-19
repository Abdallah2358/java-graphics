package assignment3;

import java.applet.Applet;
import java.awt.*;

public class q3 extends Applet {
    public void init(){
        this.resize(1000,1000);
    }
    public void paint(Graphics g){
        g.fillOval(50,0,50,50);
        g.fillOval(150,0,50,50);
        //75
        g.setColor(Color.gray);
        g.fillOval(75,25,100,100);

        g.setColor(Color.white);
        g.fillOval(100,50,20,10);
        g.fillOval(125,50,20,10);

        g.setColor(Color.black);
        g.fillOval(115,65,20,10);
        g.fillOval(105,50,10,10);
        g.fillOval(130,50,10,10);
        g.drawArc(105,70,40,20,0,-180);
    }
}
