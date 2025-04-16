import java.util.Scanner;

public class TestExceptions
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] arr = {4, 9, 10, 12};
      //System.out.println( arr[4] );
      System.out.println("Enter an index value: ");
      int x = scan.nextInt();
      try
      {
         System.out.println( arr[x] );
      }catch( ArrayIndexOutOfBoundsException e )
      {
         System.out.println( e.getMessage() );
      }
      System.out.println( "Happy Spring Break" );
   }
}