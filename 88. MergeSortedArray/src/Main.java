import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;
        while ( b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]){
                nums1[c] = nums1[a];
                a--;
            } else {
                nums1[c] = nums2[b];
                b--;
            }
            c--;

        }

        System.out.println(Arrays.toString(nums1));


    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, m, arr2, n);


    }
}