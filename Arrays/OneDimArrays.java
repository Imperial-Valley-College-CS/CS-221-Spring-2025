import java.util.Arrays;

public class OneDimArrays
{
   public static void main(String[] args)
   {
      int[] arr1 = {1, 3, 8, 20, 41};
      int[] arr2 = {2, 11, 22, 37, 50};
      int[] ans = merge(arr1, arr2);
      System.out.println( Arrays.toString(ans) );
   }//end main
   
   public static int[] merge( int[] a, int[] b )
   {
      int i = 0; int j = 0; int k = 0;
      int[] c = new int[a.length+b.length];
      
      while( i < a.length && j < b.length )
      {
         if( a[i] <= b[j] )
         {
            c[k] = a[i]; i++;
         }else
         {
            c[k] = b[j]; j++;
         }
         k++;
      }
      
      while( j < b.length )         //grab remaining elements in b
      {
         c[k] = b[j]; j++; k++;
      }
      
      while( i < a.length )         //grab remaining elements in a
      {
         c[k] = a[i]; i++; k++;
      }
      
      return c;      
   }//end merge
   
}//end class