import java.util.HashSet; 
import java.util.Set;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> tracker = new HashSet<>(); 
        for (int foo = 0; foo < nums.length; foo++) {
            if (tracker.contains(nums[foo]))
                return true;
            tracker.add(nums[foo]);
        }
        return false;
    }
}