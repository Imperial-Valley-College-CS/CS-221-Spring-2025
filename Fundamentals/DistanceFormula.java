public class DistanceFormula
{
   public static void main(String[] args)
   {
      //Scanner scan = new Scanner(System.in);
      
      double x1 = 4;
      double y1 = 6;
      double x2 = 10;
      double y2 = 19;
      
      double a = Math.pow( x2-x1, 2);
      double b = Math.pow( y2-y1, 2);
      double dist = Math.sqrt( a+b );
      
      System.out.printf("Distance: %.1f", dist);
   }
}