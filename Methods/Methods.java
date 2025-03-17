public class Methods
{
   public static void main(String[] args)
   {
      double ans1 = gpa('A', 'B', 'b', 'a');      //invoke(call) gpa
      double ans2 = gpa('C', 'c', 'A', 'B');      //invoke(call) gpa
      System.out.println( ans1 );
      System.out.println( ans2 );
   }//end main
   
   public static double gpa(char gr1, char gr2, char gr3, char gr4)
   {
      double someVar = 0.0;
      
      someVar += getGP(gr1);
      someVar += getGP(gr2);
      someVar += getGP(gr3);
      someVar += getGP(gr4);      
      
      return someVar/4.0;    //placeholder for now
   }//end gpa
   
   public static double getGP( char gr )
   {
      if( gr == 'A' || gr == 'a' )
         return 4.0;
      if( gr == 'B' || gr == 'b' )
         return 3.0;
      if( gr == 'C' || gr == 'c' )
         return 2.0;
      if( gr == 'D' || gr == 'd' )
         return 1.0;
         
      return 0.0;
   }//end getGP
   
}//end class