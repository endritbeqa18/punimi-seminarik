public class TestBiii
{
  public static void main(String[] a)
  { 
  GraphWriterB e = new GraphWriterB();
  formulaMakerB B = new formulaMakerB();
    e.setTitle("Graph of  y =20*x-(0.5*x)^3");
    e.setAxes(100, 100, 400, "10", "100");
    double scale_factor = 400/100;
    e.setPoint0( (int)(B.formula3(0) * scale_factor));   
    e.setPoint1( (int)(B.formula3(2) * scale_factor));   
    e.setPoint2( (int)(B.formula3(4) * scale_factor));  
    e.setPoint3( (int)(B.formula3(6) * scale_factor));  
    e.setPoint4( (int)(B.formula3(8) * scale_factor));
    e.setPoint5( (int)(B.formula3(10) * scale_factor));
  }
}    