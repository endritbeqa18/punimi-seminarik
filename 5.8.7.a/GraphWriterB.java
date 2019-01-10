import javax.swing.*;
import java.awt.*;

public class GraphWriterB extends JPanel

{  private int width=1000;
   private int x_pozita;
   private int y_pozita;
   private int gjatsia_boshtit;
   private String x_emertimi = "";
   private String y_emertimi = "";
   private int height;
   private String title = "";
   private JFrame korniza;
   private int x_nr0;
   private int y_nr0;
   private int x_nr1;
   private int y_nr1;
   private int x_nr2;
   private int y_nr2;
   private int x_nr3;
   private int y_nr3;
   private int x_nr4;
   private int y_nr4;
   private int x_nr5;
   private int y_nr5;
  
  
     
   public void setTitle(String title)//kjo metode sherben per te dhene titullin e grafikut 
   { 
      this.title = title;
      korniza.setTitle(title);
   }

   public GraphWriterB() 
   {
      korniza = new JFrame();//krijon kornizen
      korniza.setSize(width,width);
      korniza.setVisible(true);
      korniza.setTitle(title);
      korniza.getContentPane().add(this);
   }
   public void paintComponent(Graphics g)//vizaton grafikun
   {
    g.drawLine(x_pozita,y_pozita, x_pozita + gjatsia_boshtit, y_pozita);
    g.drawLine(x_pozita,y_pozita, x_pozita, y_pozita - gjatsia_boshtit);
    g.drawString(x_emertimi, x_pozita + gjatsia_boshtit, y_pozita + 15);
    g.drawString(y_emertimi, x_pozita - 15, y_pozita - gjatsia_boshtit);
    g.drawString("0", x_pozita - 15 , y_pozita ); 
    g.drawString("0", x_pozita, y_pozita + 15 );
     
    g.fillOval(x_nr0, y_nr0, 4 ,4 );
    g.fillOval(x_nr1, y_nr1, 4 ,4 );
    g.fillOval(x_nr2, y_nr2, 4 ,4 );
    g.fillOval(x_nr3, y_nr3, 4 ,4 );
    g.fillOval(x_nr4, y_nr4, 4 ,4 );
    g.fillOval(x_nr5, y_nr5, 4 ,4 );
    
    g.drawLine(x_nr0, y_nr0, x_nr1, y_nr1);
    g.drawLine(x_nr1, y_nr1, x_nr2, y_nr2);
    g.drawLine(x_nr2, y_nr2, x_nr3, y_nr3);
    g.drawLine(x_nr3, y_nr3, x_nr4, y_nr4);
    g.drawLine(x_nr4, y_nr4, x_nr5, y_nr5);
    repaint();

   }
  
   public void setAxes(int x_pos, int y_pos, int axis_length, String x_label, String y_label)//llogarit  koordinat per boshte
   {
    x_pozita = x_pos;
    y_pozita = y_pos+axis_length;
    gjatsia_boshtit = axis_length;
    x_emertimi = x_label;
    y_emertimi = y_label;
   
   }
 
   public void setPoint0(int height)//llogarit koordinatat per piken 0
   {
    y_nr0 = y_pozita-height-2;
    x_nr0 = x_pozita-1;
   }
  
   public void setPoint1(int height)
   {
    y_nr1 = y_pozita-height-2;
    x_nr1 = (x_pozita + (gjatsia_boshtit / 5)-2);
   }
  
   public void setPoint2(int height)
   {
    y_nr2 = y_pozita-height-2;
    x_nr2 = (x_pozita + (gjatsia_boshtit / 5)*2 -2);
   } 
   
   public void setPoint3(int height)
   {
    y_nr3 = y_pozita-height-2;
    x_nr3 = (x_pozita + (gjatsia_boshtit / 5)*3 -2);
   }  
 
   public void setPoint4(int height)
   {
    y_nr4 = y_pozita-height-2;
    x_nr4 = (x_pozita + (gjatsia_boshtit / 5) *4 -2);
   }  
 
   public void setPoint5(int height)
   {
    y_nr5 = y_pozita-height-2;
    x_nr5 = x_pozita + gjatsia_boshtit-2;
   }   
   
}