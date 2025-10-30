class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        # groups = [] 
        # for word in strs:
        #     appears = False
        #     for anagram in groups: 
        #         if sorted(word) == sorted(anagram[0]): 
        #             anagram.append(word)
        #             appears = True
        #     if not appears: 
        #         groups.append([word])
        # return groups

        # claude answer 
        groups = {}

        for word in strs: 
            key = [0] * 26
            for char in word: 
                key[ord(char) - ord('a')] += 1 
            key = tuple(key)

            groups.setdefault(key, []).append(word)
        return list(groups.values())