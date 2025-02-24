public class PA4_ValidEmail
{
   public static void main(String[] args)
   {
      //scan from user: name and email
      String name = "Olivia Ortiz".toLowerCase();
      String email = "o.ortiz@students.imperial.edu";
      
      int space = name.indexOf(' ');   //index value of space
      char firstI = name.toLowerCase().charAt(0);    //character at index value 0
      String lastName = name.toLowerCase().substring(space+1);   //grab last name
      String domain = "@students.imperial.edu";
      
      String expEmail = firstI+"."+lastName+domain;
      
      boolean valid = email.equals(expEmail);
   }
}