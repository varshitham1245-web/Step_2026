public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int globalMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if (currentSum > globalMax) {
                globalMax = currentSum;
            }
        }
        
        return globalMax;
    }

    public static void main(String[] args) {
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {-3, -1, -2};
        
        System.out.println(maxSubArray(test1));
        System.out.println(maxSubArray(test2));
    }
}
