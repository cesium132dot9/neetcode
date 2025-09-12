import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>(); 

        for (String word : strs) {
            Integer[] arrayKey = new Integer[26]; 
            Arrays.fill(arrayKey, 0);
            for (int i = 0; i < word.length(); i++) {
                arrayKey[(int) word.charAt(i) - (int) 'a'] += 1;
            }
            
            String key = Arrays.toString(arrayKey); 
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values()); 
    }
}

