import java.util.*; 

public class encodeAndDecode {
    public String encode(List<String> strs) {
        String together = "";
        for (String str : strs) {
            together += str.length() + "#" + str; 
        }
        return together; 
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        String currLength = "";
        String currStr = "";
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar != '#') {
                currLength = currLength + currChar; 
            }
            else {
                int strLength = Integer.parseInt(currLength); 
                currStr = str.substring(++i, i+strLength); 
                lst.add(currStr);
                i += strLength - 1; 
                currLength = "";
            }
        }
        return lst; 
    }
}
