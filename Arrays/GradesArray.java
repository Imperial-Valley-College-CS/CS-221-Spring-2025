import java.util.Scanner;

public class GradesArray
{
   public static void main(String[] args)
   {
      //ask the user for their grades & calculate their gpa
      Scanner scan = new Scanner(System.in);
      System.out.print("How many classes are you taking? ");
      int numClasses = scan.nextInt();
      scan.nextLine();     //scans the 5\r\n that are in queue from previous scan
      
      char[] grades = new char[numClasses];     //create array for letter grades
      
      for( int i = 0; i < grades.length; i++ )
      {
         System.out.print("Enter next grade: ");
         grades[i] = scan.nextLine().charAt(0);
      }
      
      System.out.println( "GPA: " + gpa(grades) );
      
   }//end main
   
   public static double gpa(char[] g)
   {
      double sum = 0.0;
      
      for( char x : g )       //for-each loop
      {
         if( x == 'A' || x == 'a' )
            sum += 4.0;
         if( x == 'B' || x == 'b' )
            sum += 3.0;
         if( x == 'C' || x == 'c' )
            sum += 2.0;
         if( x == 'D' || x == 'd' )
            sum += 1.0;
      }
      
      return sum/g.length;
      
   }//end gpa
   
}//end class