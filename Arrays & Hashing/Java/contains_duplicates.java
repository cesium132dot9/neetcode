import java.util.HashSet; 
import java.util.Set;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> tracker = new HashSet<>(); 
        for (int num : nums) {
            if (tracker.contains(num))
                return true;
            tracker.add(num);
        }
        return false;
    }
}