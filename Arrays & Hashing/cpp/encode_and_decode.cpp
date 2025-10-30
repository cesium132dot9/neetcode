#include <vector>
using std::vector;
#include <string>
using std::string;

class Solution {
public:

    string encode(vector<string>& strs) {
        string together = ""; 
        for (string str : strs) {
            together += std::to_string(str.length()) + "#" + str; 
        }
        return together;
    }

    vector<string> decode(string s) {
        vector<string> lst; 
        string currLength = "";
        string currStr = "";
        for (int i = 0; i < s.length(); i++) {
            char currChar = s[i]; 
            if (currChar != '#') {
                currLength = currLength + currChar; 
            }
            else {
                int strLength = std::stoi(currLength);
                currStr = s.substr(++i, strLength); 
                lst.push_back(currStr);
                i += strLength - 1; 
                currLength = "";
            }
        }
        return lst; 
    }
};
