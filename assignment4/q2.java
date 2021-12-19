package assignment4;

import java.applet.Applet;
import java.awt.*;

public class q2  extends Applet {
//     x=(int)(100+100 *Math.cos((i*3.14/180.0)));
//        y=(int)(100+100 *Math.sin((i*3.14/180.0)));
    int sec =0 , min =0 , hours =0;
    public void paint(Graphics g) {
        My2d g2d = new My2d((Graphics2D) g);
        //outer
        //800 ,400
        g.setColor(Color.MAGENTA);
        g2d.fill_2d_ellipse(600,200,400,400);

      //left_upper
       double [] x = {(800+200 *Math.cos((-145*3.14/180.0))),(800+200 *Math.cos((-130*3.14/180.0))),(800+250 *Math.cos((-130*3.14/180.0))),(800+250 *Math.cos((-145*3.14/180.0)))};
       double [] y = {(400+200 *Math.sin((-145*3.14/180.0))),(400+200 *Math.sin((-130*3.14/180.0))),(400+250 *Math.sin((-130*3.14/180.0))),400+250 *Math.sin((-145*3.14/180.0))};
        g2d.fill_2d_polygon(x,y);
        //left lower
        x = new double[]{(800 + 200 * Math.cos((145 * 3.14 / 180.0))), (800 + 200 * Math.cos((130 * 3.14 / 180.0))), (800 + 250 * Math.cos((130 * 3.14 / 180.0))), (800 + 250 * Math.cos((145 * 3.14 / 180.0)))};
   y = new double[]{(400 + 200 * Math.sin((145 * 3.14 / 180.0))), (400 + 200 * Math.sin((130 * 3.14 / 180.0))), (400 + 250 * Math.sin((130 * 3.14 / 180.0))), 400 + 250 * Math.sin((145 * 3.14 / 180.0))};
        g2d.fill_2d_polygon(x,y);
        //right_upper
        x = new double[]{(800 + 200 * Math.cos((-35 * 3.14 / 180.0))), (800 + 200 * Math.cos((-50 * 3.14 / 180.0))), (800 + 250 * Math.cos((-50 * 3.14 / 180.0))), (800 + 250 * Math.cos((-35 * 3.14 / 180.0)))};
        y = new double[]{(400 + 200 * Math.sin((-35 * 3.14 / 180.0))), (400 + 200 * Math.sin((-50 * 3.14 / 180.0))), (400 + 250 * Math.sin((-50 * 3.14 / 180.0))), 400 + 250 * Math.sin((-35 * 3.14 / 180.0))};
        g2d.fill_2d_polygon(x,y);
        //righr  lower
        x = new double[]{(800 + 200 * Math.cos((35 * 3.14 / 180.0))), (800 + 200 * Math.cos((50 * 3.14 / 180.0))), (800 + 250 * Math.cos((50 * 3.14 / 180.0))), (800 + 250 * Math.cos((35 * 3.14 / 180.0)))};
        y = new double[]{(400 + 200 * Math.sin((35 * 3.14 / 180.0))), (400 + 200 * Math.sin((50 * 3.14 / 180.0))), (400 + 250 * Math.sin((50 * 3.14 / 180.0))), 400 + 250 * Math.sin((35 * 3.14 / 180.0))};
        g2d.fill_2d_polygon(x,y);
        //hail hitler :D

        //inner part
        g.setColor(Color.white);
        g2d.fill_2d_ellipse(620,220,360,360);
        g.setColor(Color.black);
        for (int i = 0; i < 360; i+=5) {
            double lower_point = 400 + 170 * Math.sin((i * 3.14 / 180.0));
            double upper_point = 800 + 170 * Math.cos((i * 3.14 / 180.0));
            if (i%30==0) {
                g2d.draw_2d_line(upper_point, lower_point,(800 + 140 * Math.cos((i * 3.14 / 180.0))),(400 + 140 * Math.sin((i* 3.14 / 180.0))));
            }else
            g2d.draw_2d_line(upper_point, lower_point,(800 + 150 * Math.cos((i * 3.14 / 180.0))),(400 + 150 * Math.sin((i* 3.14 / 180.0))));
        }
        //inner inner part
        //800 ,400


        g.setColor(Color.cyan);
        // move hours
        //rotate this peice
        g2d.rotate_2d(800,400, hours);
        g2d.fill_2d_rect(790,300,20,100);
        //rotate the rest back
        g2d.rotate_2d(800,400, -hours);

        // move minutes
        g2d.rotate_2d(800,400, min);
        g2d.fill_2d_rect(800,400-5,140,10);
        g2d.rotate_2d(800,400, -min);

        //move seconds
        g2d.rotate_2d(800,400, sec);

        g.setColor(Color.BLACK);
        g2d.fill_2d_rect(797.5,400-2.5,5,145);
        g2d.rotate_2d(800,400, -sec);

        //inner fillings
        g.setColor(Color.cyan);
        g2d.fill_2d_ellipse(800-20,400-20,40,40);
        g.setColor(Color.white);
        g2d.fill_2d_ellipse(800-10,400-10,20,20);
        //time control :D
        sec+=6;
        if (sec == 354)
            sec=0;
        if (sec==174)
            min+=6;
        if (min==264)
            hours+=6;
        if (min==354)
            min=0;
        if (hours ==354)
            hours =0;
        repaint(1);
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){

        }
    }
}
