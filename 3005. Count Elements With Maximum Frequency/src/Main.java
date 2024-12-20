import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int maxFrequencyElements(int[] nums) {
        int count = 0;
        int freq = 0;
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            tmp.put(nums[i], tmp.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = Collections.max(tmp.values());

        for (int key : tmp.keySet()) {
            if (tmp.get(key) == maxFreq) {
                count = count + maxFreq;
            }

        }


        return count;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums));
    }
}