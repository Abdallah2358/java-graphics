package java_1;
import java.applet.Applet;
import java.awt.*;
public class ex5 extends Applet {
    public void paint(Graphics g){
        //hair
        g.fillArc(100,100,80,80,0,180);
        //head
        g.setColor(Color.orange);
        g.fillOval(110,110,60,60);
        //eye white
        g.setColor(Color.white);
        g.fillOval(120,120,10,18);//left
        g.fillOval(150,120,10,18);//right
        //eye black
        g.setColor(Color.black);
        g.fillOval(120,120+4,10,10);//left
        g.fillOval(150,120+4,10,10);//right
        //hair plaits  (dfayr el shaar)
        for (int i = 0; i < 3; i++) {
            g.fillOval(100, 140 + i * 10, 10, 10);//left
            g.fillOval(170, 140 + i * 10, 10, 10);//right
        }
        //mouth
        g.setColor(Color.red);
        g.fillArc(130,140,20,20,180,180);
    }
}
