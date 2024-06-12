import java.util.Arrays;

public class Main {

    public static void ArrangeIncrese(int[] a, int n) {
        MergeSort(a, 0, n - 1);
    }

    public static void MergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort(a, left, mid);
            MergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int m = 0;
        while (!(i > mid && j > right)) {
            if (i <= mid && j <= right && a[i] < a[j] || j > right) {
                tmp[m++] = a[i++];
            } else {
                tmp[m++] = a[j++];
            }
        }
        for (int k = 0; k < m; k++) {
            a[left + k] = tmp[k];
        }
    }

    public static void main(String[] args) {

        int[] a = {29, 97, 68, 17, -32, 53, 47};
        ArrangeIncrese(a, a.length);
        System.out.print(Arrays.toString(a));
    }
}