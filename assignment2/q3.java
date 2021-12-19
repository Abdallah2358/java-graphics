package assignment2;

import java.applet.Applet;
import java.awt.*;

public class q3  extends Applet {
    int x =0 ;
    public void paint(Graphics g) {

        //girl head
            //hair
        g.fillArc(100+x,100,100,100,0,180);
        //left
        g.fillOval(100+x,150,20,20);
        g.fillOval(100+x,170,20,20);
        g.fillOval(100+x,190,20,20);
        //right
        g.fillOval(180+x,150,20,20);
        g.fillOval(180+x,170,20,20);
        g.fillOval(180+x,190,20,20);
        //face
        g.setColor(Color.pink);
        g.fillOval(150-30+x,150-30,60,60);
        //eye left
        g.setColor(Color.black);
        g.drawOval(130+x,130,15,7);
        g.fillOval(133+x,130,7,7);
        //eye right
        g.setColor(Color.black);
        g.drawOval(170-15+x,130,15,7);
        g.fillOval(173-15+x,130,7,7);
        //mouth+x
        g.setColor(Color.green);
        g.fillArc(135+x,150,30,30 , 0,-180);

        //body
        int[] xBody = {140,160,160,190,185,115,110,140,140};
        xBody = this.shift_points(xBody,x);
        int[] yBody = {180,180,190,220,300,300,220,190,180};
        g.setColor(Color.CYAN);
        g.fillPolygon(xBody,yBody,9);

        //arm
        int []xArm ={140,160,160,170,220,220,160,140,140};
        xArm =this.shift_points(xArm,x);
        int [] yArm = { 220,220,240,270,270,290,290,240,220};
        g.setColor(Color.yellow);
        g.fillPolygon(xArm,yArm, xArm.length);

        //hand
        g.setColor(Color.pink);
        g.fillOval(220+x,270,20,20);

        //dog
        g.setColor(Color.black);
        // dog lace
        g.drawLine(230+x,270,400+x,400);
        // dog head
        g.fillRect(400+x,380,40,20);
        g.setColor(Color.red);
        g.fillOval(400+x,380,10,10);
        g.setColor(Color.black);
        // dog ears
        int [] x_ear_right = {400,410,410};
        int [] y_ear_right = {380,380,365};
        int [] x_ear_left ={400-24,400,400};
        int [ ]y_ear_left={380+20,380+20,380-15};
        x_ear_right=shift_points(x_ear_right,x);
        x_ear_left =shift_points(x_ear_left,x);
        g.fillPolygon(x_ear_right,y_ear_right,x_ear_right.length);
        g.fillPolygon(x_ear_left,y_ear_left,x_ear_right.length);

        // dog body
        int [] x_dog_body ={400,300,280,300,376};
        int []y_dog_body ={400,400,420,440,440};
        x_dog_body=shift_points(x_dog_body,x);
        g.fillPolygon(x_dog_body,y_dog_body,x_dog_body.length);

        // dog legs
        int [] x_l1 = {300,310,310,320,320,310};
        int [] y_l1 = {440,440,470,470,480,480};
        int [] x_l2 = shift_points(x_l1,20);
        int [] x_l3 =shift_points(x_l2,20);
        int [] x_l4=shift_points(x_l3,20);
        int [] y_l4 = shift_points(y_l1,-10);

        x_l1=shift_points(x_l1,x);
        x_l2=shift_points(x_l2,x);
        x_l3=shift_points(x_l3,x);
        x_l4=shift_points(x_l4,x);


        g.fillPolygon(x_l1,y_l1, x_l1.length);
        g.fillPolygon(x_l2,y_l1, x_l1.length);
        g.fillPolygon(x_l3,y_l1, x_l1.length);
        g.fillPolygon(x_l4,y_l4, x_l1.length);

        //dog tail
        g.drawLine(280+x,420,280+x,460);


        //skirt
        g.setColor(Color.yellow);
        int []xSkirt ={115,185,200,100};
        xSkirt=this.shift_points(xSkirt,x);
        int [] ySkirt ={300,300,400,400 };
        g.fillPolygon(xSkirt,ySkirt,4);

        //legs
        g.setColor(Color.pink);
        int[] xLeg_left = {120,140,140,160,160,130,120};
        int [] xLeg_right = shift_points(xLeg_left, 40);

        xLeg_left = shift_points(xLeg_left,x);
        xLeg_right= shift_points(xLeg_right,x);

        int []yLegs = {400,400,450,450,470,470,400};

        g.fillPolygon(xLeg_right,yLegs ,xLeg_right.length);
        g.fillPolygon(xLeg_left,yLegs,xLeg_right.length);

        x++;
        //
        repaint(1);
        try {
            Thread.sleep(100);
        }catch (Exception ignored){

        }
    }
    public int [] shift_points(int [] points , int shift){

        int[] newArray = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            newArray[i]=points[i]+shift;
        }
        return newArray;
    }
}
