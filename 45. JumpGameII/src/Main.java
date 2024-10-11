public class Main {

    public static int jump(int[] nums) {
        int totalJump = 0;
        int destination = nums.length - 1;

        int coverage = 0, lastJumpIdx = 0;
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJump++;
                if (coverage >= destination)
                    return totalJump;
            }
        }
        return totalJump;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}