import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }

        HashMap<Character, Integer> count_s = new HashMap<Character, Integer>(); 
        HashMap<Character, Integer> count_t = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char char_i = s.charAt(i);
            count_s.computeIfPresent(char_i, (k, v) -> v + 1);
            count_s.putIfAbsent(char_i, 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char char_j = s.charAt(j);
            count_t.computeIfPresent(char_j, (k, v) -> v + 1); 
            count_t.putIfAbsent(char_j, 1); 
        } 

        if (count_s.equals(count_t)) {
            return true;
        }
        else {
            return false; 
        }
    }
}