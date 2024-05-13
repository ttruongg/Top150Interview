import java.util.Arrays;

public class Main {

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void interChangeSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {24, 45, 23, 13, 43, -1};
        interChangeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}