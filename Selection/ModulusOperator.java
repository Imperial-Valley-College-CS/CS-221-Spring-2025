import java.util.Scanner;

public class ModulusOperator
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      
      if( num % 2 == 0 )      //if num is evely divisible by 2
         System.out.println("Number is even");
      else
         System.out.println("Number is odd");
      
   }
}