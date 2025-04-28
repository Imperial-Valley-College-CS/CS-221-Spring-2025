public class Student extends Person
{
   //data fields
   private double gpa;
   private String major;
   
   //constructor
   public Student(String name, String gender, String dob, String major)
   {
      super(name, gender, dob); //invoke the constructor of superclass
      this.major = major;
   }
}