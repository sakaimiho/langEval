public class StoogeSort {
    public static void stoogeSort(int[] L) {
        stoogeSortR(L, 0, L.length - 1);
    }

    public static void stoogeSortR(int[] L, int i, int j) {
        if (L[j] < L[i]) {
            int tmp = L[i];
            L[i] = L[j];
            L[j] = tmp;
        }
        if (j - i > 1) {
            int t = (j - i + 1) / 3;
            stoogeSortR(L, i, j - t);
            stoogeSortR(L, i + t, j);
            stoogeSortR(L, i, j - t);
        }
    }
}
