class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }

        int[] count_s = new int[26];
        int[] count_t = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count_s[s.charAt(i) - 'a']++;
            count_t[t.charAt(i) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if (count_s[j] != count_t[j]) {
                return false; 
            }
        }
        return true; 
    }
}