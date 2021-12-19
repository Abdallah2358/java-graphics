package java_1;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
public class ex2 extends Applet {
    int n_sides ,rotate_angle;
    public void  init(){
        n_sides= Integer.valueOf(JOptionPane.showInputDialog("enter number of sides"));
    }
    public  void  paint(Graphics g){
        g.drawString(Integer.toString(n_sides),100,100);
        int raduis = 100; //also length of side /2
        int x_center= 300,y_center=300;
        rotate_angle=(360/n_sides)/2;//why divide by 2 ? ..to make the shapes look like they rotate to the center of each sid
        for (int i = 0; i < 5; i++) {
            draw_regular_polygon(g,x_center,y_center,raduis,n_sides,0);
            draw_regular_polygon(g,x_center,y_center,raduis,n_sides,rotate_angle);
            //the value decremented does not really affect anything
            raduis-=20;
        }
    }
    public  static  void draw_regular_polygon (Graphics g,int x_center,int y_center,int raduis,int n_sides ,int rotate_angle){
        int x1,x2,y1,y2;
        x1= (int )(x_center+raduis* Math.cos(rotate_angle*3.14/180));
        y1= (int )(y_center-raduis* Math.sin(rotate_angle*3.14/180));
        for (int i = rotate_angle; i <= 360+rotate_angle; i+=(360/n_sides)) {
            x2 =(int)(x_center+raduis*Math.cos(i*3.14/180));
            y2 =(int)(y_center+raduis*Math.sin(i*3.14/180));
        g.drawLine(x1,y1,x2,y2);
        x1=x2;y1=y2;
        }

    }
}
