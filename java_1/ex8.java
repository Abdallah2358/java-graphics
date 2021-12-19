package java_1;
import java.applet.Applet;
import java.awt.*;
public class ex8 extends Applet {
    int i =0 ;
    Color [] colors = {Color.red,Color.orange,Color.yellow,Color.green,Color.blue,Color.cyan,Color.magenta,Color.pink};
    int x = 50 ,y=50;
    public void paint (Graphics g){
        //draw circle
        for (int j = 0; j < 8; j++) {
            g.setColor(colors[j]);
            g.fillArc(x,y,50,50,j*45+i,45);
        }
        i-=10; //rotate circle clock wise
        if (x<500&&y==50) x+=10;//move from left to right
        if (y<500&&x==500) y+=10;//move from up to down
        if(x>50&&y==500)x-=10;//move from right to left
        if (x==50&&y>50)y-=10;//move from down up
        repaint(1);
        try {
            Thread.sleep(50);
        } catch (Exception ignored) {}
    }
}
