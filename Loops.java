public class Loops
{
   public static void main(String[] args)
   {
      String myName = "Bruce Wayne";
      int numVowels = 0;
      for(int i = 0; i < myName.length(); i++)
      {
         char let = myName.toLowerCase().charAt(i);
         if( let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u' )
            numVowels++;
      }
      System.out.println( numVowels );
   }
}