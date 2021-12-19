package assingment_6;

import java.awt.*;
import java.awt.geom.Arc2D;

public class hilcopter_blue {
    private int  x , y ;
    private final Color color =Color.blue ;
    private int rotate_fan ;
    My2d g2d;
    public  hilcopter_blue (int x , int y  ,My2d g2d, int rotate_fan   ){
        this.g2d=g2d;
        this.x = x;
        this.y = y;
        this.rotate_fan=rotate_fan;
    }
    public void draw_hili(){
        //get old color
        Color old = g2d.g2d.getColor();
        //set body color
        g2d.g2d.setColor(color);
        //body
        //hilcopter  small fan
        g2d.fill_2d_rect(x,y,20,50);
        //fan chain
        g2d.fill_2d_rect(x+20,y+50-20,100,20);
        //hilcopter  big fan
        g2d.fill_2d_rect(x+20+100+50,y-40,20,40);
       //big body
        g2d.fill_2d_rect(x+20+100,y,100,70);
        //front arc
        g2d.fill_2d_arc(x+20+100+100-35,y,70,70,90,-180, Arc2D.PIE);
        //windows
        g2d.g2d.setColor(Color.WHITE);
        for (int i = 0; i < 3; i++) {
            g2d.fill_2d_rect(x+20+100+20+i*40,y+50-20,20,20);
        }

        //fans
        g2d.g2d.setColor(Color.BLACK);

        for (int i = 0; i < 4; i++) {
            //fan big
            g2d.fill_2d_arc(x+20+100+10 ,y-40 ,100,40,90*i+rotate_fan,20,Arc2D.PIE);
            //fan small
            g2d.fill_2d_arc(x-20,y-20,40,40,90*i+rotate_fan,20,Arc2D.PIE);
        }
        // return to old color
        g2d.g2d.setColor(old);
    }


}
