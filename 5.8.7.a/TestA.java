public class TestA
{
  public static void main(String[] a)
  { 
    GraphWriterA e = new GraphWriterA();//krijohet nje objekt graphwriterA
    formulaMakerA A= new formulaMakerA();//krijohet nje objekt formulaMakerA 
    e.setTitle("Graph of  y = x*x");
    e.setAxes(100, 100, 400, "5", "30");
    double scale_factor = 400/30;// heresi mes gjatesise se boshtit ne pixella dhe vleres maksimale te Y
    e.setPoint0( (int)(A.formula(0) * scale_factor)); 
    e.setPoint1( (int)(A.formula(1) * scale_factor));   
    e.setPoint2( (int)(A.formula(2) * scale_factor));  
    e.setPoint3( (int)(A.formula(3) * scale_factor));  
    e.setPoint4( (int)(A.formula(4) * scale_factor));
    e.setPoint5( (int)(A.formula(5) * scale_factor));
  }
}    