public class TestBii
{
  public static void main(String[] a)
  { 
  GraphWriterB e = new GraphWriterB();
  formulaMakerB B = new formulaMakerB();
    e.setTitle("Graph of  y =90-(0.8*x)*(0.8*x)");
    e.setAxes(100, 100, 400, "10", "100");
    double scale_factor = 400/100;// heresi mes gjatesise se boshtit ne pixella dhe vleres maksimale te Y
    e.setPoint0( (int)(B.formula2(0) * scale_factor));   
    e.setPoint1( (int)(B.formula2(2) * scale_factor));   
    e.setPoint2( (int)(B.formula2(4) * scale_factor));  
    e.setPoint3( (int)(B.formula2(6) * scale_factor));  
    e.setPoint4( (int)(B.formula2(8) * scale_factor));
    e.setPoint5( (int)(B.formula2(10) * scale_factor));
  }
}   