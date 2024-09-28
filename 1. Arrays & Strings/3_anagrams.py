def convert_to_map(s):
    char_map = {}

    for char in s:
        if char not in char_map:
            char_map[char] = 1  # new char set to 1 occ
        else:
            char_map[char] += 1  # same char, add occ
    
    return char_map

def anagrams(s1, s2):
    return convert_to_map(s1) == convert_to_map(s2)
