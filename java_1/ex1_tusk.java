package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex1_tusk extends Applet {
    public  void  paint(Graphics g){
        int xCenter =500 ,yCenter=500,x_new,y_new ,raduis=100;
        int x_draw_C = (int) (xCenter+raduis*Math.cos(18*3.14/180)),
                y_draw_C=(int) (yCenter-raduis*Math.sin(18*3.14/180));
        //why 18*3.14 ?
        //because 360 /5 =72 ;
        /*and if you draw a  perpendicular line like in photo you get that the remaining angale is 18
        * then knowing your starting angle you just add 360/5=72
        * in each step of the loop for the start you just go to next step so you go from x1 to x3 or if your i=1 then the ange should be at
        * i+1=2 and so on  */
        for (int i = 1 ; i <=5; i++) {
            //star draw
            x_new = (int) (xCenter+raduis*Math.cos((18+(i+1)*72)*3.14/180));
            y_new = (int) (yCenter-raduis*Math.sin((18+(i+1) *72)*3.14/180));
            g.drawLine(x_draw_C,y_draw_C,x_new,y_new);
            //pentagon draw
            x_new = (int) (xCenter+raduis*Math.cos((18+i*72)*3.14/180));
            y_new = (int) (yCenter-raduis*Math.sin((18+i*72)*3.14/180));
            g.drawLine(x_draw_C,y_draw_C,x_new,y_new);
            x_draw_C=x_new;y_draw_C=y_new;

        }
    }
}
