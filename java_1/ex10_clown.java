package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex10_clown extends Applet {
    int x =0 , j=0 , move,i=10;
    public void paint(Graphics g) {
        //hat
        g.setColor(Color.red);
        int [] x_hat={15+x,20+x,35+x};
        int [] y_hat={30,5,30};
        g.fillPolygon(x_hat,y_hat,3);
        //head
        g.setColor(Color.yellow);
        g.fillOval(15+x,25,22,22);
        //back hand (because drawn first )
        move =x+j;
        int [] x_b_hand={20+x,30+x,30+ move,35+ move,55+ move,55+ move,30+ move,20+ move};
        int [] y_b_hand={60     ,60,70,         80,         80,          90,   90,         70};
        g.setColor(Color.blue);
        g.fillPolygon(x_b_hand,y_b_hand,x_b_hand.length);
        g.fillOval(55+ move,80,10,10);
        //front leg
        int []x_b_leg ={10+x,40+x,40+move,50+move,30+move,50+move};
        int []y_b_leg ={105,105,155,155,165,165};
        g.setColor(Color.black);
        g.fillPolygon(x_b_leg,y_b_leg,x_b_leg.length);
        //body
        int [] x_body ={20+x,30+x,30+x,40+x,40+x,10+x,10+x,20+x};
        int [] y_body ={45,45,55,65,105,105,65,55};
        g.setColor(Color.pink);
        g.fillPolygon(x_body,y_body,x_body.length);
        //front hand (same coordinates as back hand only move hand  and color is different)
        move =x-j;
        int [] x_f_hand ={20+x,30+x,30+ move,35+ move,55+ move,55+ move,30+ move,20+ move};
        int [] y_f_hand={60     ,60,70,         80,         80,          90,   90,         70};
        g.setColor(Color.red);
        g.fillPolygon(x_f_hand,y_f_hand,y_f_hand.length);
        g.fillOval(55+ move,80,10,10);
        //front leg
        int []x_f_leg ={10+x,40+x,40+move,50+move,30+move,50+move};
        int []y_f_leg ={105,105,155,155,165,165};
        g.setColor(Color.blue);
        g.fillPolygon(x_f_leg,y_f_leg,y_f_leg.length);
        //ball
        g.setColor(Color.yellow);
        g.fillOval(0+x,165,60,60);
        g.setColor(Color.blue);
        for (int k = 0; k < 4; k++) {
            g.fillArc(0+x,165,60,60,k*90-x,30);
        }

        //move all right
        x+=10;
        //move hands
        j+=i;
        if (j==20)
            i=-10;
        if (j==-20)
            i=10;
        if (x==this.getBounds().width)
            x=-60;
        repaint();
        try { Thread.sleep(100); }catch (Exception e ) { e.printStackTrace();}
    }

}
