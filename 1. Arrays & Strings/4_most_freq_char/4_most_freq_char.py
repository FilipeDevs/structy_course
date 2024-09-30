def most_frequent_char(s):
    # build frequency map
    char_map = {}

    for char in s:
        if char not in char_map:
            char_map[char] = 1  # 1st occ
        else:
            char_map[char] += 1
    
    most_freq = '0'
    current_max_occ = 0

    # find most frequent char
    for char in s:
        if char_map[char] > current_max_occ:
            current_max_occ = char_map[char]
            most_freq = char
    
    return most_freq
