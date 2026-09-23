import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                    
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[] test1 = {-1, 0, 1, 2, -1, -4};
        int[] test2 = {0, 0, 0};
        
        int[][] res1 = threeSum(test1);
        System.out.print("[");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(Arrays.toString(res1[i]));
            if (i < res1.length - 1) System.out.print(",");
        }
        System.out.println("]");
        
        int[][] res2 = threeSum(test2);
        System.out.print("[");
        for (int i = 0; i < res2.length; i++) {
            System.out.print(Arrays.toString(res2[i]));
            if (i < res2.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
