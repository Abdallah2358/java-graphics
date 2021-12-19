package assignment1;

import java.applet.Applet;
import java.awt.*;

public class qTwo extends Applet {
    public void paint(Graphics g) {
        //top line
        g.drawLine(400, 50, 500, 50);
        //blue
        g.setColor(Color.blue);
        //rectangle top
        g.fillRect(425, 60, 50, 40);
        g.fillRect(425, 150, 50, 100);

        //steps
        for (int i = 0; i < 150; ) {
            drawStepLeft(400 - i, 50 + i, 50, 50, g);
            drawStepRight(500 + i, 50 + i, 50, 50, g);

            i += 50;
        }
        //black
        g.setColor(Color.black);

        //bottom line
        g.drawLine(250, 250, 650, 250);
        //left coulomb
        g.drawLine(250, 250, 250, 200);
        //right coulmb
        g.drawLine(650, 250, 650, 200);

    }

    public void drawStepLeft(int x, int y, int moveX, int moveY, Graphics g) {
        g.setColor(Color.black);
        g.drawLine(x, y, x, y + moveY);
        g.drawLine(x, y + moveY, x - moveX, y + moveY);
        g.setColor(Color.red);
        g.fillRect((x - moveX + 3), (y + moveY + 3), (moveX - 6), (moveY - 6));
    }

    public void drawStepRight(int x, int y, int moveX, int moveY, Graphics g) {
        g.setColor(Color.black);
        g.drawLine(x, y, x, y + moveY);
        g.drawLine(x, y + moveY, x + moveX, y + moveY);
        g.setColor(Color.red);
        g.fillRect((x + 3), (y + moveY + 3), (moveX - 6), (moveY - 6));
    }
}