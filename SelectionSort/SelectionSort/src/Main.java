import java.util.Arrays;

public class Main {
    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void SelectionSort(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {
            int lc = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[lc])
                    lc = j;
            }
            swap(a, i, lc);
        }
    }

    public static void main(String[] args) {
        int[] a = {24, 45, 23, 13, 43, -1};
        SelectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}