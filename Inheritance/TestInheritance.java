public class TestInheritance
{
   public static void main(String[] args)
   {
      Person p1 = new Person("Octavio Ortiz", "male", "12/16/1999");
      Person p2 = new Person("Laura Lopez", "female", "6/9/2010");
      Student s1 = new Student("Olivia", "female", "4/15/2023", "Computer Science");
      char[] grades = {'A','a','b','B'};
      s1.setGrades( grades );
      
      Person[] people = new Person[3];
      people[0] = p1;
      people[1] = p2;
      people[2] = s1;
      
      for( int i = 0; i < people.length; i++ )
         if( people[i].getAge() >= 18 )
            System.out.println( people[i] );
            
      for( Person p : people )
         if( p.getAge() >= 18 )
            System.out.println( p );
   }
}