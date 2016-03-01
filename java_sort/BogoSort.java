import java.util.*;

public class BogoSort{
  private static final Random generator = new Random();

  public static void sort(int[] array)  {
    while (!isSorted(array)) {
      for (int i = 0; i < array.length; i++){
        int randomPosition = generator.nextInt(array.length);
        int temp = array[i];
        array[i] = array[randomPosition];
        array[randomPosition] = temp;
      }
    }
  }

  private static boolean isSorted(int[] array)  {
    for (int i = 1; i < array.length; i++){
      if (array[i] < array[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
