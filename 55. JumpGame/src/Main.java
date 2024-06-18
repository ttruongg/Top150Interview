import java.util.Arrays;

public class Main {

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i > -1; i--) {
            if (i + nums[i] >= goal) goal = i;

        }

        if (goal == 0) return true;
        return false;


    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 0, 4};
        System.out.println(canJump(a));
    }
}