package assignment4;


import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

public class q1  extends Applet {
    int rotate_left_arm =0,rotate_right_arm =0,ref=1;
    public void paint(Graphics g) {
        My2d g2d = new My2d( (Graphics2D) g);
        //face
        Graphics2D g2 = g2d.g2d;
        g2.setColor(Color.yellow);
        //center (750,350)
        g2.fillArc(50,50,50,50,90,-180);
        g2d.fill_2d_ellipse  (500 ,100 ,500,500);

        //mouth
        g2.setColor(Color.black);
        g2d.fill_2d_arc(600,250,300,300,0,-180, Arc2D.OPEN);
        g2.setColor(Color.yellow);
        g2d.fill_2d_arc(620,270,260,260,0,-180,Arc2D.OPEN);

        //eyes
        //white
        g2.setColor(Color.white);
        g2d.fill_2d_ellipse(650-35,150,70,100);
        g2d.fill_2d_ellipse (850-35,150,70,100);
        //black
        g2.setColor(Color.black);
        g2d.fill_2d_ellipse(670-35,150,40,60);
        g2d.fill_2d_ellipse(870-35,150,40,60);

        //legs

        //midle bottom (750 ,600)
        double [] x_leg_left ={650,670,670,650};
        double [] y_leg = {530,530,620,620};
        double [] y_leg_black = {620,620,660,660};
        //left
        g2.setColor(Color.yellow);
        g2d.fill_2d_polygon(x_leg_left,y_leg);
        g2.setColor(Color.black);
        g2d.fill_2d_polygon(x_leg_left,y_leg_black);

        //right
        g2.setColor(Color.yellow);
        g2d.fill_2d_polygon(shift_points(x_leg_left,180),y_leg);
        g2.setColor(Color.black);
        g2d.fill_2d_polygon(shift_points(x_leg_left,180),y_leg_black);

        //arms
        //left edge (500,350)
        double [] x_arm_left ={510,510,510-90,510-90};
        double [] y_arm_left = {335,365,365+120,335+120};
        g2.setColor(Color.yellow);
        //move hand up
        g2d.rotate_2d(510,335,rotate_left_arm);
        g2d.fill_2d_polygon(x_arm_left,y_arm_left);

        g2.setColor(Color.black);
        g2d.fill_2d_ellipse(400,335+120+5,25,25);
        //move rest of body back to it position
        g2d.rotate_2d(510,335,-rotate_left_arm);

        //right edge (1000,350)
        double [] x_arm_right ={990,990,990+90,990+90};
        double [] y_arm_right ={335,365,365+120,335+120};
        //move hand up
        g2d.rotate_2d(990,335,rotate_right_arm);
        g2.setColor(Color.yellow);
        g2d.fill_2d_polygon(x_arm_right,y_arm_right);
        g2.setColor(Color.black);
        g2d.fill_2d_ellipse(990+90-5,335+120+5,25,25);
        rotate_left_arm +=ref;

        rotate_right_arm-=ref;
        if (rotate_left_arm==100)
            ref=-1;
        if (rotate_left_arm==0)
            ref=1;
        repaint(1);
        try {
            Thread.sleep(100);
        }catch (Exception ignored){

        }
    }
    public double [] shift_points(double [] points , double shift){
        double[] newArray = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            newArray[i]=points[i]+shift;
        }
        return newArray;
    }
}
