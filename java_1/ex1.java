package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex1 extends Applet {
public  void  paint(Graphics g){
    int xCenter =500 ,yCenter=500 ,raduis=100, x_draw_C = xCenter+raduis,y_draw_C=yCenter;
    for (int i = 1; i <= 360; i++) {
        int x_new=(int) (xCenter+raduis*Math.cos(Math.toRadians(i)));
        int y_new=(int) (yCenter-raduis*Math.sin(i*3.14/180));
        g.drawLine(x_draw_C,y_draw_C,x_new,y_new);
        x_draw_C=x_new;y_draw_C=y_new;
        }
    }
}
