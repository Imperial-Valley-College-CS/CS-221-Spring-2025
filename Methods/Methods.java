public class Methods
{
   public static void main(String[] args)
   {
      double ans1 = gpa('A', 'B', 'b', 'a');      //invoke(call) gpa
      double ans2 = gpa('C', 'c', 'A', 'B', 'A');      //invoke(call) gpa
      double ans3 = gpa(95, 82, 77, 96);      //invoke(call) gpa
      System.out.println( ans1 );
      System.out.println( ans2 );
      System.out.println( ans3 );
   }//end main
   
   public static double gpa(char gr1, char gr2, char gr3, char gr4, char gr5)
   {
      double someVar = 0.0;
      
      someVar += getGP(gr1);
      someVar += getGP(gr2);
      someVar += getGP(gr3);
      someVar += getGP(gr4); 
      someVar += getGP(gr5);     
      
      return someVar/5.0;    //placeholder for now
   }//end gpa
   
   public static double gpa(char gr1, char gr2, char gr3, char gr4)
   {
      double someVar = 0.0;
      
      someVar += getGP(gr1);
      someVar += getGP(gr2);
      someVar += getGP(gr3);
      someVar += getGP(gr4);      
      
      return someVar/4.0;    //placeholder for now
   }//end gpa
   
   public static double gpa(int gr1, int gr2, int gr3, int gr4)
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
   
   public static double getGP( int gr )
   {
      if( gr >= 90 )
         return 4.0;
      else if( gr >= 80 )
         return 3.0;
      else if( gr >= 70 )
         return 2.0;
      else if( gr >= 60 )
         return 1.0;
      else   
         return 0.0;
   }//end getGP
   
}//end class