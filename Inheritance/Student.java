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
      
      for( char g : this.grades )
         switch( g )
         {
            case 'a':case 'A': gp += 4.0; break;
            case 'b':case 'B': gp += 3.0; break;
            case 'c':case 'C': gp += 2.0; break;
            case 'd':case 'D': gp += 1.0; break;
         }
      
      this.gpa = gp/this.grades.length;
   }
   
   @Override
   public String toString()
   {
      return super.toString() + String.format("GPA: %.2f",this.gpa);
   }
}