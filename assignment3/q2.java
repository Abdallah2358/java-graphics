package assignment3;

import java.applet.Applet;
import java.awt.*;

public class q2 extends Applet {
    int x =10 , y=0 ,i =10 ,direction=1; ;
    public void paint(Graphics g) {
        int len = this.getWidth();
        for (int j = 0; j < len; j++) {
            y=(int)(100+100 *Math.sin((j*3.14/180.0)));
            g.drawLine(j,y,j,y);
        }
        y=(int)(100+100 *Math.sin((i*3.14/180.0)));
        g.setColor(Color.blue);
        g.fillOval(x-10,y-10,20,20);
        x+=direction;
        i++;
        if (x==len){
            direction=-1;
        }else if (x==0){
            direction=1;
        }
        if (i==4000000){
            i-=360*1000;
        }
        repaint(1);
        try {
            Thread.sleep(10);
        }catch (Exception ignored){

        }
    }
}
