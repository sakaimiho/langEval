public class OddEvenSort {
	 public static void sort(int[] data){
	 int flag = 1;

	 while(flag==1) {
	   flag = 0;
	   for (int i = 0; i < data.length-1; i += 2) { /* Pair1 */
	     if (data[i] > data[i+1]) {
	       swap(data,i, i+1);
	       flag = 1;
	     }
	   }
	   for (int i = 1;i < data.length-1;i += 2) { /* Pair2 */
	     if (data[i] > data[i+1]) {
	       swap(data,i, i+1);
	       flag = 1;
	     }
	   }
	 }
	}

	 private static void swap(int[] a, int i, int j) {
	      int t = a[i];
	      a[i] = a[j];
	      a[j] = t;
	  }
}
