import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];

            if (tmp.containsKey(remain)) {
                return new int[]{tmp.get(remain), i};
            } else {
                tmp.put(nums[i], i);
            }

        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int targer = 6;
        int[] result = twoSum(nums, targer);

        System.out.println(Arrays.toString(result));

    }
}