public class TestInheritance
{
   public static void main(String[] args)
   {
      Person p1 = new Person("Octavio Ortiz");
      Person p2 = new Person("Laura Lopez", "female");
      System.out.println( p2 );
      Student s1 = new Student("Olivia", "female", "4/15/1999", "Computer Science");
      char[] grades = {'A','a','b','B'};
      s1.setGrades( grades );
      System.out.println( s1 );
   }
}