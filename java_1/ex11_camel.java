package java_1;

import java.applet.Applet;
import java.awt.*;
//not animated
public class ex11_camel extends Applet {
    //int x =0 ,j=0;
    public void paint(Graphics g) {
        //start point 100,400
        //body
        g.drawLine(100,400,95,440);
        int [] x_body = {100,115,215,230,215,115};
        int [] y_body ={400,420,420,400,380,380};
        g.fillPolygon(x_body,y_body,x_body.length);
        //sanama .... just comment the line and run and you will get it
        g.fillArc(115,380-40,100,80,0,180);
        //legs
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                int shift = k  * 20 + i * 70;//draw 1 leg then shift it 3 times to get total of 4 legs
                //why do that ?
                //to let you only think about only manipulating one leg instead of thinking about 4
                //how the shift works you have 2 loops
                //inner loops using counter "k" draw 2 legs with distance 20 between them
                //since 130-115=15 then 20 is good distance between each leg
                //then outer loop using "i" draws the pair of legs twice to give you 4 legs
                //with moving 1st leg of 2nd pair of legs to start at a distance of 60 from
                //the 1st leg of the 1st pair of legs why 60 ?
                //caz in body 215-115 =100 and each pair takes 40 so 100-40 =60
                int [] x_leg ={115 + shift,125+shift,120+shift,130+shift,130+shift,115+shift};
                int [] y_leg ={420,420,470,470,475,475};
                g.fillPolygon(x_leg,y_leg,x_leg.length);
            }
        }
        //neck
        //remember the last point at the most right was 230,400 and above it 215,380 so they will be our start and end
        //its height can be about 50-60 i guess
        //remember pythagoras theorem  that perpendicular triangles are always
        //3,4,5 ratio so from this if you move 30 on x axis and 40 on y axis you get 50 on straight line of y=x axis
        int  [] x_neck ={215,215+30,260,230 };//260 is just moving 15 to right to have base for head
        int  [] y_neck ={ 380 , 380-40,380-40,400};//going up is always minus y value i always forget this
        g.fillPolygon(x_neck,y_neck,x_neck.length);
        //head
        //this going to be an oval with height less than width and its height must end at the base which is 380-40
        g.fillOval(215+30,380-40-10,40,20);//the 380-40 - 10 is just removing half the height of the oval to make
        //sure that the oval is touching the neck
        //eye
        g.setColor(Color.white);
        g.fillOval(215+30+10,380-40-5,5,5);//380-40-5 came by trial and error wont really matter at the exam
        //any value near it will do just keep it relative to what you draw on your paper
        //dont forget to reset color
        g.setColor(Color.black);
        //ears
        int [] x_ear ={215+30,245+5,245+10,245+10+5,245+10+10};
        int [] y_ear ={380-40,340-20,340-10,340-20,340-10};
        g.fillPolygon(x_ear,y_ear,x_ear.length);

        //start of human
        //remember the camel body ended at 215+30+40 = 285 for x so start drawing the man for x of 320 or more to look better
        //remember that the camel body ended at 475 which was the lowes piece of its body look at the legs poly "y"
        // to guid you self draw a rectangle of the size  you want in the paper  you hum to have like this
        g.setColor(Color.green);
        g.drawRect(320,380-40,50,475-380+40);
        //head
        g.setColor(Color.black);
        g.fillOval(330,340,30,30);
        //body //ends at x=370
        int [] x_man ={345-3, 345+3,345+3,345+3+7,345+3+12,345-3-12,345-3-7,345-3};//345 is middle of head circle so it is easier
        //to move from it
        int [] y_man ={340+15,340+15,340+15+20,340+15+20+20,340+15+20+20+70,340+15+20+20+70,340+15+20+20,340+15+20,340+15};
        g.fillPolygon(x_man,y_man,x_man.length);

        // man legs  y = 340+15+20+20+70=465
        for (int i = 0; i < 2; i++) {
            int shift = i* 10 ;
            int [] x_man_legs ={345-7+shift,345-3+shift,345-3+shift,345+shift,345+shift,345-7+shift};
            int [] y_man_legs ={465,465,470,470,475,475};
            g.fillPolygon(x_man_legs,y_man_legs,x_man_legs.length);
        }
        //hand
        g.setColor(Color.blue);
        int [] x_hand = {345-3,345+3,345+3,345+15,345+15,345-3};
        int [] y_hand = {475-60-10,475-60-10,475-60,475-60,475-60+6,475-60+6};
        g.fillPolygon(x_hand,y_hand,x_hand.length);
        //bridle
        g.setColor(Color.magenta);
        g.drawLine(215+30,380-40,360,475-60);
    }
}
