public class formulaMakerB// kjo klas ka 4 metoda se marrin si argument nje int dhe kthejne rezultatin e funksionit
{

 public int formula1(int x)
 {int f=x*x+2*x+1;
 return f;
 }
 
 public double formula2(int x)
 {double f=90-Math.pow(0.8*x,2);
 return f;
 }
 
 public double formula3(int x)
 {double f=20*x-Math.pow(0.5*x,3);
 return f;
 }
 
 public double formula4(int x)
 {double f=0.1*Math.pow(x,3)+Math.pow(x,2)-x;
 return f;
 }

}
