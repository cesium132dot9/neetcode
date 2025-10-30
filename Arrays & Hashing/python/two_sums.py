class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i in range(len(nums)): 
            num2 = target - nums[i]
            if num2 in nums[i + 1:]:
                return [i, nums.index(num2, i + 1)]