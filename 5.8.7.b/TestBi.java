public class TestBi
{
  public static void main(String[] a)
  { 
  GraphWriterB e = new GraphWriterB();//krijohet nje objekt graphwriterB
  formulaMakerB B = new formulaMakerB();//krijohet nje objekt formulaMakerB
    e.setTitle("Graph of  y = x*x+2*x+1");
    e.setAxes(100, 100, 400, "10", "100");
    double scale_factor = 400/100;// heresi mes gjatesise se boshtit ne pixella dhe vleres maksimale te Y
    e.setPoint0( (int)(B.formula1(0) * scale_factor));   
    e.setPoint1( (int)(B.formula1(2) * scale_factor));   
    e.setPoint2( (int)(B.formula1(4) * scale_factor));  
    e.setPoint3( (int)(B.formula1(6) * scale_factor));  
    e.setPoint4( (int)(B.formula1(8) * scale_factor));
    e.setPoint5( (int)(B.formula1(10) * scale_factor));
  }
}    