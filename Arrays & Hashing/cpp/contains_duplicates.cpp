#include <vector>
#include <unordered_set>

class Solution {
public:
    bool hasDuplicate(std::vector<int>& nums) {
        std::unordered_set<int> tracker; 
        for (int num : nums) {
            if (tracker.count(num)) {
                return true; 
            }
            tracker.insert(num); 
        }
        return false; 
    }
};
