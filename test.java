import java.applet.Applet;
import java.awt.*;

public class test extends Applet {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Paint old = g2.getPaint();
        g2.setPaint(new GradientPaint(0,0,Color.red,0,150,Color.black));
        g2.setStroke(new BasicStroke(1));
        g2.drawOval(200,50,100,100);
        g.fillOval(50,50,100,100);
        g.setColor(Color.black);
        g.fillOval(200,200,100,100);
    }
}
