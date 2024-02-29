import java.util.Arrays;

public class Main {


    //Solution 1
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

    //Solution 2
    public static void rotate2(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[n];
        k = k % n;
        if (k > n){
            return;
        }
        for (int i = n - k; i < n; i++){
            result[i-n+k] = nums[i];
        }

        for (int j = 0; j < n - k; j++){
            result[j+k] = nums[j];
        }

        for (int i=0; i < n; i++){
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        //rotate(nums, 3);
        rotate2(nums,3);
        System.out.println(Arrays.toString(nums));

    }
}