package java_1;

import java.applet.Applet;
import java.awt.*;

public class ex6 extends Applet {
    public void paint (Graphics g){
        //screen body
        g.fillRect(10,30,110,100);
        g.fillArc(30,120,70,20,180,180);//arc
        g.fillRect(10,140,110,10);//small base
        g.setColor(Color.white);
        g.fillRect(15,35,100,90);//inner screen
        g.setColor(Color.black);
        g.fillRect(160,10,50,140);//case body
        g.setColor(Color.white);
        g.fillRect(170,20,30,10);//upper cd rom
        g.fillRect(170,40,30,10);//lower cdrom
        g.fillOval(170,110,30,30);//the circle for ventilation
    }
}
