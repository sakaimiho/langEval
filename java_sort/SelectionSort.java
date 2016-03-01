public class SelectionSort {
 
   public static void main(String args[]) {
 
      int[] array = {1,10,2,9,3,8,4,7,5,6};
      System.out.print("Start : " );     
      for(int x = 0; x < array.length; x++) {
         System.out.print( " " + array[x]);     
      }
      System.out.println(" "); 
 
      int first; 
      int tmp; 
      int count=1; 
      for ( int i=array.length-1; i>0; i--,count++ ) {
         first = 0;
         for(int j=1; j<=i; j++) {
            if( array[j] < array[first] )  
               first = j;
         }
         tmp = array[first]; 
         array[first] = array[i];
         array[i] = tmp; 
 
      System.out.print("Pass " + count + ": " );
      for(int x = 0; x < array.length; x++) {
         System.out.print( " " + array[x]);
      }
      System.out.println(" ");
 
 
      } 
   }
}
 
