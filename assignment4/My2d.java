package assignment4;

import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("unused")
public class My2d {
    Graphics2D g2d ;
  public My2d(Graphics2D g2d){
        this.g2d =g2d;
    }

    /*
    how to use ?
    put this at the top

     My2d g2d = new My2d((Graphics2D) g);

    g2d.fun....
     */
    /*
    * add this to your class help with animation
    *    @SuppressWarnings("unused")
    public int [] shift_points(int [] points , int shift){

        int[] newArray = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            newArray[i]=points[i]+shift;
        }
        return newArray;
    }
    *
    * */
    public void draw_2d_polygon (double [] x , double [] y  ){
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x[0],y[0]);
        for (int i = 1; i < x.length; i++)
            gp.lineTo(x[i],y[i]);
        gp.closePath();
        g2d.draw(gp);
    }
    public void  rotate_2d (double x,double y , double angle_from_orignal ){
    g2d.rotate(Math.toRadians(angle_from_orignal),x,y);
    }
    public void fill_2d_polygon (double [] x , double [] y  ){
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x[0],y[0]);
        for (int i = 1; i < x.length; i++) {
            gp.lineTo(x[i],y[i]);
        }
        gp.closePath();
        g2d.fill(gp);
    }

    public void  draw_2d_line (double x1,double y1 , double x2 ,double y2 ){
        Line2D l = new Line2D.Double(x1,y1,x2,y2);
        g2d.draw(l);
    }

    public void  draw_2d_rect (double x1,double y1 , double width ,double height ){
        Rectangle2D rec = new Rectangle2D.Double(x1,y1,width,height);
        g2d.draw(rec);
    }
    public void  fill_2d_rect (double x1,double y1 , double width ,double height ){
        Rectangle2D rec = new Rectangle2D.Double(x1,y1,width,height);
        g2d.fill(rec);
    }

    public void  draw_2d_ellipse (double x1,double y1 , double width ,double height ){
        Ellipse2D ellipse2D = new Ellipse2D.Double(x1,y1,width,height);
        g2d.draw(ellipse2D);
    }
    public void  fill_2d_ellipse (double x1,double y1 , double width ,double height ){
        Ellipse2D ellipse2D = new Ellipse2D.Double(x1,y1,width,height);
        g2d.fill(ellipse2D);
    }
    public void  draw_2d_arc (double x1,double y1 , double width ,double height,double startAngel,double endAngle, int  type  ){
        Arc2D arc2D = new Arc2D.Double(x1,y1,width,height ,startAngel,endAngle,type);
        g2d.draw(arc2D);
    }
    public void  fill_2d_arc (double x1,double y1 , double width ,double height,double startAngel,double extent, int  type  ){
        Arc2D arc2D = new Arc2D.Double(x1,y1,width,height ,startAngel,extent,type);
        g2d.fill(arc2D);
    }
}
