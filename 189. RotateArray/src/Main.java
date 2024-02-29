import java.util.Arrays;

public class Main {


    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;

        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums,0,k-1);
        reverse(nums,k, n - 1);

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }
}