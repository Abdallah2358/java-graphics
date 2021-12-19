package java_1;
import java.applet.Applet;
import java.awt.*;
public class ex8_continued extends Applet {
    int move=0;
     int direction  =1; //1= inward , -1 = out ward
    Color [] colors = {Color.red,Color.orange,Color.yellow,Color.green,Color.blue,Color.cyan,Color.magenta,Color.pink};
    //you start  at 200,200 and end at 400,400 so your center is 300,300
    int [] start_x ={200,400,400,200};
    int [] start_y ={200,200,400,400};
    public void paint(Graphics g) {
        int x=1,y=1;//must be inside paint to be reset with each repaint
        //this x=1 ,y =1 moves the left up toward and away from center
        for (int i = 0; i < 4; i++) {
            if (i==1)
                x = -1;//moves the right up to center or away from it
            if (i==2)
                y=-1;//mooves the right down to center or away from it
            if (i==3)
                x=1;
            //draw circle
            for (int j = 0; j < 8; j++) {
                g.setColor(colors[j]);
                g.fillArc(start_x[i]+move*x,start_y[i]+move*y,50,50,j*45,45);//stop at 300
                g.setColor(Color.black);//inner black circle (on top)
                g.fillOval(start_x[i]+move*x+15,start_y[i]+move*y+15,20,20);//50-15-15=20//try to make it 10 and 10 and 30
            }
        }
        move+=direction;
        if (move==100)
            direction=-1;//stops at 300 and moves back to 200
        if (move==0)
            direction=1;//stops at 200 and moves back to 300
        repaint(1);
        try {
            Thread.sleep(50);
        } catch (Exception ignored) {}
    }
}
