package assignment1;//abdallah mohamed ahmed el hadidi
//section 3

import java.applet.Applet;
import java.awt.*;

public class qOne extends Applet {
    public void paint(Graphics g) {
        //big rectacngel in buttom
        g.drawRect(50, 200, 400, 100);
        //left circle
        g.fillOval(100, 275, 50, 50);
        //right circle
        g.fillOval(350, 275, 50, 50);

        //small lef rectacngel in top
        g.drawRect(100, 100, 150, 100);
        //small right  rectacngel in top
        g.drawRect(250, 100, 150, 100);
        //smaller filled right  rectacngel in top
        g.fillRect(260, 110, 130, 80);

    }
}