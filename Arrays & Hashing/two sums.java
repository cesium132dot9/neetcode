import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];
            if (map.containsKey(num2)) {
                return new int[]{map.get(num2), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
