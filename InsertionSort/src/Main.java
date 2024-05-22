import java.util.Arrays;

public class Main {

    public static void InsertionSort(int[] a, int n) {

        for (int i = 1; i < n; i++) {
            int x = a[i];
            int vt = i - 1;

            while (vt >= 0 && a[vt] > x) {
                a[vt + 1] = a[vt];
                vt--;
            }
            a[vt + 1] = x;
        }
    }

    public static void main(String[] args) {
        int[] a = {29, 97, 68, 17, -32, 53, 47};
        InsertionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}