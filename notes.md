# Arrays & Hashing 

## Contains Duplicates 
Used a set to keep track of the numbers that appeared. Then check if the same number has appeared again.  
### C++: 
-	Very similar to Java
-	For loops are the same as Java
-	Enhanced for loops; `for (type var : collection)`
    - Java uses the same syntax 
-	unordered_set vs set
    - set automatically orders the numbers in ascending order
        - Strange considering sets in math are unordered 
-	`.count()` behaviour for sets
    - Used to see if a set contains a number 


## Valid Anagram: 
Check if the two strings are the same length. Use a dictionary to keep track the number of times each character appears. Compare the two dictionaries. Since the strings are of equal length use a single loop to get the number of times each character appears
### Python: 
-	`.get()` function for dictionaries will return None if the key isn’t present
-	Able to set the return value for the key not being present


## Two Sums: 
### Java: 
-	`HashMap<Integer, Integer> <variable name> = new HashMap<>();`
-	`Key.put(K key, V value)`
    - Connect the specified value with the specified key


## Group Anagrams: 
Converted words into tuples which contained letters and the letter's number of occurence. Stored this tuple as a key in a dictionary/hashmap for easy lookup. Returned only the values of the hashmap. 
### Python: 
- `sorted()` returns a list
- Creating the key tuple  
    - `Counter()` returns a tuple of letters used and the count of each 
    - `ord(char) - ord('a')` maps lowercase letter to a 0-25 index  
### Java: 
- Two arrays with same contents are considered different 
    - Never use arrays as hashmap keys
    - Arrays compares **object identity** intead of contents 
- Hashmaps
    - The `computeIfAbsent()` method takes in the key, and a function 
- Type declarations in java is very annoying


<<<<<<< HEAD
## Top K Frequen Elements
=======
## Top K Frequent Elements: 
Have a dictionary which mapped the numbers to their frequencies. Then found the max frequencies. Then added the original numbers to a list/array respectively. 
### Java: 
- `PriorityQueue` to determine the max frequency numbers
- `Map.Entry<k, v>` to store the number to frequency in the priority queue
- Lambda functions in java are written as `(inputs) -> output`
>>>>>>> deb303f820f70c5d45a3e67281b01fc56e606247
