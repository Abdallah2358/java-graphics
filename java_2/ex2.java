package java_2;

import java.awt.*;
import java.awt.geom.*;
import java.applet.*;
public class ex2 extends Applet {
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        int appletHeigh=getHeight();
        int appletWidth=getWidth();
        Color[]c={Color.red,Color.green,Color.yellow,Color.black};
        for(int i=0;i<6;i++)
        {
            int rectwidth = appletWidth * i / 8;
            int recthight = appletHeigh * i / 8;
            int rectleft = appletWidth / 2 - i * appletWidth / 16;
            int recttop = appletHeigh / 2 - i * appletHeigh / 16;
            GradientPaint  gp = new GradientPaint(rectleft,recttop,c[i%4],rectleft,recttop,c[i%4],true);
            g2.setPaint(gp);
            g2.setStroke(new BasicStroke(5));
            Ellipse2D oval = new Ellipse2D.Double(rectleft,recttop,rectwidth,recthight);
            g2.draw(oval);
            g.drawString("i = "+ Integer.toString(i),150 +i*50,20);
        }
    }
}