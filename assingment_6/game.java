package assingment_6;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class game extends Applet implements KeyListener {
    //buffer for off screen
    Graphics g;
    Image img ;


    hilcopter_blue blue;
    hilcopter_red red;

    boolean isOver =false;
    boolean both_hit = false;
    boolean isBlueHit =false;
    boolean isRedHit =false;

    //x and y intial values for red and blue
    int xBlue = 100,yBlue =100,xRed=1500-100,yRed=100;
    int Rotate_fan =0;

    // bulltes arry of postion
    Vector<Integer>  x_bullet_blue=new Vector<Integer>();
    Vector<Integer>  y_bullet_blue=new Vector<Integer>();
    Vector<Integer>  x_bullet_red =new Vector<Integer>();
    Vector<Integer>  y_bullet_red =new Vector<Integer>();

    // scpre
    int red_score =0 , blue_score=0;

    public  void init(){
        this.resize(2000,1000);
        addKeyListener( this );
    }

    public void  paint(Graphics gToDraw){
        //start of buffer
        img = createImage(this.getWidth(),this.getHeight());
        g =img.getGraphics();
        //end of buffer

        // intiating my2d
        My2d g2d = new My2d((Graphics2D) g);

        // draw back ground
        g.setColor(Color.gray);
        g2d.fill_2d_rect(0,0,this.getWidth(),this.getHeight());
        //DRAW HILCOPTERS


        //is game over
        if(!isOver){
            blue = new hilcopter_blue(xBlue, yBlue, g2d, Rotate_fan);
            red = new hilcopter_red(xRed, yRed, g2d, Rotate_fan);
            blue.draw_hili();
            red.draw_hili();

            //draw collision domain
            g.setColor(Color.green);
            //blue collission domain
            g.drawRect(xBlue, yBlue - 40, 255, 110);

            //red collission domain
            g.drawRect(xRed - 255 + 20, yRed - 40, 255, 110);

            //draw red bullets
            g.setColor(Color.red);
            for (int j = 0; j < x_bullet_red.size(); j++) {
                g.drawLine(x_bullet_red.get(j), y_bullet_red.get(j), x_bullet_red.get(j) - 5, y_bullet_red.get(j));
            }
            //draw blue bullets
            g.setColor(Color.blue);
            for (int j = 0; j < x_bullet_blue.size(); j++) {
                g.drawLine(x_bullet_blue.get(j), y_bullet_blue.get(j), x_bullet_blue.get(j) + 5, y_bullet_blue.get(j));
            }

            //check if blue hili is hit
            for (int j = 0; j < x_bullet_red.size(); j++) {
                if (y_bullet_red.get(j) >= yBlue - 40 && y_bullet_red.get(j) <= yBlue - 40 + 110) {
                    if (x_bullet_red.get(j) >= xBlue && x_bullet_red.get(j) <= xBlue + 255 || x_bullet_red.get(j) - 5 >= xBlue && x_bullet_red.get(j) - 5 <= xBlue + 255) {
                        isBlueHit = true;
                        break;
                    }
                }
            }
            //check if red is hit
            for (int j = 0; j < x_bullet_blue.size(); j++) {
                if (y_bullet_blue.get(j) >= yRed - 40 && y_bullet_blue.get(j) <= yRed - 40 + 110) {
                    if (x_bullet_blue.get(j) >= xRed - 255 + 20 && x_bullet_blue.get(j) <= xRed + 20 || x_bullet_blue.get(j) + 5 >= xRed - 255 + 20 && x_bullet_blue.get(j) + 5 <= xRed + 20) {
                        isRedHit = true;
                        break;
                    }
                }
            }
            //collision area
            if ((xRed - 255 + 20) >= xBlue && (xRed - 255 + 20) <= xBlue + 255 || (xRed + 20) >= xBlue && (xRed + 20) <= xBlue + 255) {
                if (yRed - 40 >= yBlue - 40 && yRed - 40 <= yBlue - 40 + 110 || yRed - 40 + 110 >= yBlue - 40 && yRed - 40 + 110 <= yBlue - 40 + 110) {
                    both_hit =true;
                   isOver=true;
                }
            }
            //score
            g.setFont(new Font("Arial",Font.BOLD,20) );



            g.setColor(Color.BLUE);
            g.drawString("Blue score : "+Integer.toString(blue_score),50,20);

            g.setColor(Color.red);
            g.drawString("Red score : "+Integer.toString(red_score),1500,20);
            //red
            if (isBlueHit) {
                red_score++;
                reset_game();
            }
            //blue
            if (isRedHit) {
                blue_score++;
                reset_game();
            }
            //end game
            if (blue_score ==2 || red_score==2)
            {
                isOver=true;
            }
            //move red bulltes
            for (int j = 0; j < x_bullet_red.size(); j++) {
                x_bullet_red.set(j, x_bullet_red.get(j) - 100);
            }
            //move blue bulltes
            for (int j = 0; j < x_bullet_blue.size(); j++) {
                x_bullet_blue.set(j, x_bullet_blue.get(j) + 100);
            }


        }
        else {

            String winner = "";
            if (both_hit){
                winner = "Both lost";
            }
            if (red_score==2){
                winner= "Red won";
            }
            if (blue_score==2)
            {
                winner="Blue won";
            }
            g.setColor(Color.white);
            g.setFont(new Font("Arial",Font.BOLD,100)   );
            g.drawString("game Over & " + winner ,500,500);

        }




        //draw buffer
        gToDraw.drawImage(img,0,0,null);


        //rotate fans
        Rotate_fan +=10;

        repaint();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void  reset_game(){
        xBlue = 100;
        yBlue =100;
        xRed=1500-100;
        yRed=100;
        x_bullet_blue=new Vector<Integer>();
        y_bullet_blue=new Vector<Integer>();
        x_bullet_red =new Vector<Integer>();
        y_bullet_red =new Vector<Integer>();
        isBlueHit =false;
        isRedHit =false;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        //RED
        //move red
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            yRed-=10;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            yRed+=10;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xRed-=10;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xRed+=10;
        }
        //fire red
        if (e.getKeyCode() == KeyEvent.VK_P) {
            x_bullet_red.add(xRed-255+20);
            y_bullet_red.add(yRed-40+55);
        }
        //BLUE
        //move blue
        if (e.getKeyCode() == KeyEvent.VK_W) {
            yBlue-=10;
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            yBlue+=10;
        } if (e.getKeyCode() == KeyEvent.VK_A) {
            xBlue-=10;
        }else if (e.getKeyCode() == KeyEvent.VK_D) {
            xBlue+=10;
        }
//fire blue
        if (e.getKeyCode() == KeyEvent.VK_T) {
            x_bullet_blue.add(xBlue+255);
            y_bullet_blue.add(yBlue-40+55);
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
