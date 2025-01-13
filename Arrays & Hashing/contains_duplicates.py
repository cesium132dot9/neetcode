class Solution:
    def hasDuplicate(self, nums: list[int]) -> bool:
        tracker = set()
        for num in nums:
            if num in tracker: 
                return True
            tracker.add(num)
        return False