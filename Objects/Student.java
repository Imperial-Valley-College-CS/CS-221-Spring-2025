import java.util.GregorianCalendar;

public class Student
{
   //Data fields (characteristics)
   private String name, gender;
   private GregorianCalendar dob;
   private double gpa;
   private int age;
   
   //Constructor(s)
   public Student(String n, String dateOfBirth, String g)
   {
      this.name = n;
      this.gender = g;
      setDOB(dateOfBirth);         //initializes this.dob (GregorianCalendar)
   }
   
   private void setDOB(String date)
   {
      String[] tokens = date.split("/");     // date as mm/dd/yyyy
      int month = Integer.parseInt(tokens[0]) - 1;
      int day = Integer.parseInt(tokens[1]);
      int year = Integer.parseInt(tokens[2]);
      
      this.dob = new GregorianCalendar( year, month, day );
   }
   
   //method (getter or setter or specialized)
   public String getName(){ return this.name; }
   
}