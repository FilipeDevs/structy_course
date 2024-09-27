def uncompress(s):
    # two pointers approach
    result = ""
    start_index = 0
    current_index = 0

    while current_index < len(s):
        if s[current_index].isdigit():
            # is digit so increase window
            current_index += 1
        else:
            # char found -> process window
            number_char = int(s[start_index:current_index])
            for _ in range(number_char):
                result += s[current_index]
            # reset two pointers
            current_index += 1
            start_index = current_index

    return result
