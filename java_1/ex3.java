package java_1;
import java.applet.Applet;
import java.awt.*;
public class ex3 extends Applet {
    public void paint (Graphics g){
        Color [] colors={Color.green,Color.yellow,Color.red,Color.blue};
            int x= 0;
        for (int i = 0; i < 4; i++) {
            g.setColor(colors[i]);
            g.fillRect(135+x,135+x,415-2*x,415-2*x);
            x+=50;
        }
    }
}
