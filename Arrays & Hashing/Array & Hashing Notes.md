# 1. Contains Duplicates
## Solution: 
Used a set to keep track of the numbers that appeared. Then check if the same number has appeared again.  

### C++
-	For loops and enhanced for loops have the same syntax as Java
	-	Enhanced for loops; `for (type var : collection)`
-	unordered_set vs set
    - set automatically orders the numbers in ascending order
        - Strange considering sets in math are unordered 
-	`.count()` behaviour for sets
    - Used to see if a set contains a number 


# 2. Valid Anagrams
## Solution: 
1. Check if the two strings are the same length. 
2. Keep track the number of times each character appears. 
3. Compare the two dictionaries. 

### Python: 
- `.get()` function for dictionaries will return None if the key isn’t present
-	Able to set the return value for the key not being present
### Java: 
- Two arrays of length 26 for each string 
- `charAt(<index>) - 'a'` is a [[Array & Hashing Notes#^adf866|character index conversion]] ^c2215c


# 3. Two Sums
## Solution: 

### Java: 
-	`HashMap<Integer, Integer> <variable name> = new HashMap<>();`
-	`Key.put(K key, V value)`
    - Connect the specified value with the specified key


# 4. Group Anagram
## Solution: 
Converted words into tuples which contained letters and the letter's number of occurrence. Stored this tuple as a key in a dictionary/hashmap for easy lookup. Returned only the values of the hashmap. 

### Python: 
- `sorted()` returns a list
- Creating the key tuple   ^adf866
    - `Counter()` returns a tuple of letters used and the count of each 
    - `ord(char) - ord('a')` is a [[Array & Hashing Notes#^c2215c|character index conversion]] in Python 
### Java: 
- Two arrays with same contents are considered different 
    - Never use arrays as hashmap keys
    - Arrays compares **object identity** intead of contents 
- Hashmaps
    - The `computeIfAbsent()` method takes in the key, and a function 
- Type declarations in java is very annoying


# 5. Top K Frequent Elements
## Solution: 
Have a dictionary which mapped the numbers to their frequencies. Then found the max frequencies. Then added the original numbers to a list/array respectively.

### Java: 
- `PriorityQueue` to determine the max frequency numbers
- `Map.Entry<k, v>` to store the number to frequency in the priority queue
- Lambda functions in java are written as `(inputs) -> output`


# 6. Encode and Decode Strings 
## Solution: 
Encode: 
1. Added all the strings in the collection into one large string with its length and `"#"` to separate them
Decode: 
2. Loop through the total string
	1. If character is not equal to `#`, add a number which is a String to be used later
	2. Else parse the number that is a String into an integer. Then get the substring using the length of the string before `#` and add it to the list.

### Java: 
### C++: 
``` cpp
std::string str = "pneumonoultramicroscopicsilicovolcanoconiosis";
char c = str[9]; // c = 'l' 

// str.sub_string(starting position, length)
std::string sub_str = str.sub_string(9, 2) // sub_str = "lt"

std::string str_num = "10"; 
int num = std::stoi(str_num); // num = 10 
```
