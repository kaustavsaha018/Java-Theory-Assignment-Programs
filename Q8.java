import java.awt.*;
import java.applet.*;
public class Q8 extends Applet{
    public void paint(Graphics g){
        //orange stripe
        g.setColor(Color.orange);
        g.fillRect(55,20,120,30);
        
        //green stripe
        g.setColor(Color.green);
        g.fillRect(55,80,119,30);
        
        //blue wheel
        g.setColor(Color.blue);
        g.drawOval(100,50,30,30);

        int l=0,x=115,y=65;
        double x1,y1,d;

        for(int i=1;i<=24;i++){
            d=(double)l*3.14/180.0;
            x1=x+(double)13*Math.cos(d);
            y1=y+(double)13*Math.sin(d);
            g.drawLine(x,y,(int)x1,(int)y1);
            l=l+(360/24);
        }
    }
}
/*
<applet code = "Q8.class" width = "500" height = "500"></applet>
*/