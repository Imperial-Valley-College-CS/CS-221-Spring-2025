public class TestStudent
{
   public static void main(String[] args)
   {
      //Create Student object (instance of a Student)
      Student sto = new Student("Joe Lopez","10/12/2005","male");
      Student stu = new Student("Lisa Lopez", "4/8/2005","female");
      
      Student[] roster = new Student[2];
      roster[0] = sto;
      roster[1] = stu;
      
      for( Student x : roster )
      {
         //prints what toString method returns
         System.out.println( x.getAge() );      
      }
   }
}