import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numToFreq = new HashMap<>();
        for (int num : nums) {
            if (numToFreq.containsKey(num)) {
                numToFreq.computeIfPresent(num, (key, value) -> value+1);
            }
            else {
                numToFreq.put(num, 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>
                (numToFreq.size(), (pair1, pair2) ->
                        pair2.getValue() - pair1.getValue());
        heap.addAll(numToFreq.entrySet());

        int[] topKInt = new int[k];
        for (int i = 0; i < k; i++) {
            topKInt[i] = heap.poll().getKey();
        }
        return topKInt;
    }
}