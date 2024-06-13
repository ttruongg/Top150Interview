import java.util.Arrays;

public class Main {

    public static void Swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void QuickSort(int[] a, int n) {
        QuickSort(a, 0, n - 1);
    }

    public static void QuickSort(int[] a, int left, int right) {
        if (left < right) {
            int iPivot = Partition(a, left, right);
            QuickSort(a, left, iPivot - 1);
            QuickSort(a, iPivot + 1, right);
        }
    }

    public static int Partition(int[] a, int left, int right) {
        int pivot = a[right];
        int vt = left - 1;

        for (int i = left; i <= right - 1; i++) {
            if (a[i] < pivot) {
                vt++;
                Swap(a, vt, i);
            }
        }
        vt++;
        Swap(a, vt, right);
        return vt;
    }

    public static void main(String[] args) {
        int[] a = {15, 20, 4, 36, 27, 9, 14, 72, 1};
        QuickSort(a, a.length);
        System.out.print(Arrays.toString(a));
    }
}