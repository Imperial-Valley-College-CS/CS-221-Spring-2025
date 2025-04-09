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
   
   //method (getter or setter or specialized)
   private void setDOB(String date)
   {
      String[] tokens = date.split("/");     // date as mm/dd/yyyy
      int month = Integer.parseInt(tokens[0]) - 1;
      int day = Integer.parseInt(tokens[1]);
      int year = Integer.parseInt(tokens[2]);
      
      this.dob = new GregorianCalendar( year, month, day );
      setAge();
   }   
   
   private void setAge()
   {
      //GregCal corresponds to today's date
      GregorianCalendar today = new GregorianCalendar();
      long t1 = this.dob.getTimeInMillis();
      long t2 = today.getTimeInMillis();
      double age = (double)(t2-t1)/(1000.0*60*60*24*365.25);
      this.age = (int)age;
   }
   
   public int getAge()
   {
      setAge();
      return this.age;
   }
   public String getName(){ return this.name; }
   
}