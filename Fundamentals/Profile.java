import java.util.Scanner;

public class Profile
{
   public static void main(String[] args)
   {
      //Create a Scanner Object (allows for user input)
      Scanner scan = new Scanner(System.in);
      
      System.out.println("What's your name?");
      String yourName = scan.nextLine();
      
      System.out.println("How old are you?");
      int age = scan.nextInt();
      
      System.out.printf("Name: %s\nAge: %d", yourName, age);
      
//       double inches = 30.5;
//       int students = 30;
//       char firstInital = 'A';
//       boolean isHot = false;
//       String myName = "Octavio Ortiz";
//       System.out.println( myName );
      
   }//end main method
}//end class