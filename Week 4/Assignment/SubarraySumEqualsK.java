import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int count = 0;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 1};
        int k1 = 2;
        int[] test2 = {1, -1, 0};
        int k2 = 0;
        
        System.out.println(subarraySum(test1, k1));
        System.out.println(subarraySum(test2, k2));
    }
}
