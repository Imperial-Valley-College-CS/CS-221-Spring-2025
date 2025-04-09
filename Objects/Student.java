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
      setDOB();
   }
   
   private void setDOB()
   {
   }
   
   //method (getter or setter or specialized)
   public String getName(){ return this.name; }
   
}