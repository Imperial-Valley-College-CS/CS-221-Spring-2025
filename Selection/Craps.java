public class Craps
{
   public static void main(String[] args)
   {
      System.out.println("Do you want to roll?");
      String answer = "yes";
      
      if(answer.toLowerCase().equals("yes"))
      {
         int die1 = (int)(6*Math.random())+1;
         int die2 = (int)(6*Math.random())+1;
         int sum = die1+die2;
         
         System.out.printf("Die1: %d, Die2: %d\n", die1, die2);
         
         if( sum == 7 || sum == 11 )
         {
            System.out.println("You WIN!");
         }
      }else
      {
         System.out.println("Womp Womp!!");
      }     
   }
}