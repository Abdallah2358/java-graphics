package java_1;
import java.applet.Applet;
import java.awt.*;
public class ex9 extends Applet {
    int x_center= 300,y_center=300,x_ball,y_ball, radius =200 ,ball_radius= 15;
    int []angles={0,90,180,270};//can be replaced by one angle just to give illusion of differance in
    //position and speed
    Color [] colors = {Color.green,Color.blue,Color.red,Color.yellow};
    public void paint(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i < 4; i++) {
            g.setColor(Color.BLACK);
            g.drawOval(x_center - radius + i * 50  , y_center - radius + i * 50, radius*2 - i * 100, radius*2 - i * 100);
            x_ball= (int)(x_center -ball_radius  + (radius-i*50) *Math.cos(Math.toRadians(angles[i])));
            y_ball= (int)(y_center -ball_radius + (radius-i*50) *Math.sin(Math.toRadians(angles[i])));
            g.setColor(colors[i]);
            g.fillOval(x_ball , y_ball,ball_radius*2,ball_radius*2);
            //again can be replaced by just angle++ just to give the kids something to amuse them
            if (i%2==0)
                angles[i]+=10;
            else
                angles[i]-=10;
        }
        repaint();
        try {
            Thread.sleep(100);
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
