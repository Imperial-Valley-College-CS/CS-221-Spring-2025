import java.util.*;

public class Person
{
   //data fields
   protected String name, gender;
   protected GregorianCalendar dob;
   protected int age;
   
   //constructor(s)
   public Person(String n)
   {
      this.name = n;
   }   
   
   public Person(String name, String gender)
   {
      this.name = name;
      this.gender = gender;
   }
   
   public Person(String name, String gender, String dob)
   {
      this.name = name;
      this.gender = gender;
      setDOB( dob );
   }
   
   //method (getter or setter or specialized)
   protected void setDOB(String date)
   {
      String[] tokens = date.split("/");     // date as mm/dd/yyyy
      int month = Integer.parseInt(tokens[0]) - 1;
      int day = Integer.parseInt(tokens[1]);
      int year = Integer.parseInt(tokens[2]);
      
      this.dob = new GregorianCalendar( year, month, day );
      setAge();
   }
   
   protected void setAge()
   {
      //GregCal corresponds to today's date
      GregorianCalendar today = new GregorianCalendar();
      long t1 = this.dob.getTimeInMillis();
      long t2 = today.getTimeInMillis();
      double age = (double)(t2-t1)/(1000.0*60*60*24*365.25);
      this.age = (int)age;
   }

   
}