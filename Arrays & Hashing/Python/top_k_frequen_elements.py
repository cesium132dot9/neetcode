class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_to_freq = {}
        most_freq = []
        for num in nums:
            num_to_freq.setdefault(num, 0)
            num_to_freq[num] += 1
        for i in range(k): 
            most_freq_num = max(num_to_freq, key=num_to_freq.get)
            freq = num_to_freq.pop(most_freq_num)
            most_freq.append(most_freq_num)
        return most_freq
