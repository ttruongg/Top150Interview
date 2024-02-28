import java.util.Arrays;
import java.util.HashMap;

public class Main {
    //solution 1
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //solution 2
    public static int majorityElement2(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        majorityElement2(nums);
        System.out.println(majorityElement2(nums));
    }
}