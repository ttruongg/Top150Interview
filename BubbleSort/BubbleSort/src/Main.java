import java.util.Arrays;

public class Main {

    public static void Swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void BubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (a[j] < a[j - 1]) {
                    Swap(a, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {24, 45, 23, 13, 43, -1};
        BubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}