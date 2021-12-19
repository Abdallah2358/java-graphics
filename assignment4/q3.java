package assignment4;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Arc2D;

public class q3 extends Applet {
    //     x=(int)(100+100 *Math.cos((i*3.14/180.0)));
//        y=(int)(100+100 *Math.sin((i*3.14/180.0)));
    int rotate_wheel=0, x_move=0;
    public void paint(Graphics g) {
        My2d g2d = new My2d((Graphics2D) g);
        //move train horizntaly
        g2d.g2d.translate(x_move,0);
        //train
        //body

        g.setColor(Color.blue);
        //first car
          g2d.fill_2d_rect(200,200,400,200);
        //second car
          g2d.fill_2d_rect(200+400+100,200,400,200);
         //windows
          g.setColor(Color.WHITE);
        for (int i = 0; i < 4; i++) {
            g2d.fill_2d_rect(200+400/5+400/5*i,240,40,40);
            g2d.fill_2d_rect(200+400+100+400/5+400/5*i,240,40,40);

        }
        //chain
        g.setColor(Color.BLACK);
        g2d.fill_2d_rect(200+400,400-40,100,20);
        //front
        double []x_triangle ={1100,1150,1100};
        double [] y_triangle = {400,400,400-100};
        g2d.fill_2d_polygon(x_triangle,y_triangle);
        g2d.fill_2d_arc(700+400-20,240,40,40,-90,180,Arc2D.PIE);
        g2d.fill_2d_rect(200+400+100+400/5+400/5*3-20,200-40,20,40);
        //wheels
        //bottom line middle point at (400,400)
        draw_wheel(400-100-40,400-40,40,rotate_wheel,g2d,g);
        draw_wheel(400+100-40,400-40,40,rotate_wheel,g2d,g);
        //bottom middle point at ( 900,400)
        draw_wheel(900-100-70,400-70-30,70,rotate_wheel,g2d,g);
        draw_wheel(900+100-40,400-40,40,rotate_wheel,g2d,g);
        //stop moving platform
        g2d.g2d.translate(-x_move,0);

        g2d.fill_2d_rect(0,400+40,getWidth(),20);
        if (x_move==200+1150)
            x_move=-1400;
        rotate_wheel--;
        x_move++;
        repaint(1);
        try {
            Thread.sleep(10);
        }catch (Exception ignored){

        }
    }

    public void  draw_wheel(double x,double y,double r,double start_angle,My2d g2d ,Graphics g){
        Color oldColor = g.getColor();
        g.setColor(Color.yellow);
        g2d.fill_2d_ellipse(x,y,r*2,r*2);
        g.setColor(Color.black);
        for (int i = 0; i < 4; i++) {
            g2d.fill_2d_arc(x, y, r * 2, r * 2, start_angle +90*i, 30 , Arc2D.PIE);
        }
       g.setColor(oldColor);
        }

    }
