package assignment2;

import java.applet.Applet;
import java.awt.*;



public class q2 extends Applet {
    double shift_x =0;
    double shift_y =0;
    int angle =0;
    int cR = 15;
    int R_outer=200;
    int R_inner=150;
    int int_x_outer =100;
    int int_y_outer =100 ;
 int int_x_inner = int_x_outer+R_outer-R_inner , int_y_inner =int_y_outer+R_outer-R_inner ;

    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawOval(int_x_outer, int_y_outer,R_outer*2,R_outer*2);
        g.drawOval(int_x_inner, int_y_inner,R_inner*2,R_inner*2);
        shift_x = (Math.cos((angle*3.14/180.0)));
        shift_y = (Math.sin(angle*3.14/180.0));

        g.drawString(Double.toString(shift_x),50,50    );
        g.setColor(Color.green);
        g.fillOval((int_x_outer + R_outer- cR )+(int)(R_outer*shift_x) , (int_y_outer +R_outer -cR)-(int)(R_outer*shift_y),cR*2,cR*2);
        g.setColor(Color.blue);
        g.fillOval((int_x_inner + R_inner - cR )- (int)(R_inner*shift_x) ,(int_y_inner +R_inner -cR)-(int)(R_inner*shift_y),cR*2,cR*2);

        angle= angle+10;
        repaint();
        try {
            Thread.sleep(100);
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
