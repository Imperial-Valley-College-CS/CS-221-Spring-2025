import java.util.GregorianCalendar;

public class Student
{
   //Data fields (characteristics)
   private String name;
   private GregorianCalendar dob;
   
   //Constructor(s)
   public Student(String n, String dateOfBirth)
   {
      this.name = n;
   }
   
   //method (getter or setter or specialized)
   public String getName(){ return this.name; }
   
}