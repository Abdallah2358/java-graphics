package java_2;
import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

public class ex1 extends Applet {
    Color[] mColors ={Color.red,Color.green,Color.blue,Color.gray};
    int mNumberOfLines=10;
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        for(int i=0;i<mNumberOfLines;i++)
        {
            double ratio=(double) i/(double) mNumberOfLines;
            Line2D Line =new Line2D.Double(0,ratio*getHeight(),ratio*getWidth(),getHeight());
            g2.setColor(mColors[i%mColors.length]);
            g2.draw(Line);
        }
    }
}