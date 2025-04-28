public class Student extends Person
{
   //data fields
   private double gpa;
   private String major;
   private char[] grades;
   
   //constructor
   public Student(String name, String gender, String dob, String major)
   {
      super(name, gender, dob); //invoke the constructor of superclass
      this.major = major;
   }
   
   public void setGrades( char[] g )
   {
      this.grades = g;
      calcGPA();
   }
   
   private void calcGPA()
   {
      double gp = 0.0;
      //missing code
      this.gpa = gp/this.grades.length;
   }
}