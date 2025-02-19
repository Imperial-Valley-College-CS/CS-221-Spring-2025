import java.util.Scanner;

public class StringMethods
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      String myName = scan.nextLine();
      
      int space = myName.indexOf(32);
      String fName = myName.substring(0, space);
      String lName = myName.substring(space+1);
      
      System.out.println( fName );
      System.out.println( lName );
   }
}