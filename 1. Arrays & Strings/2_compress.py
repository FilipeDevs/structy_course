def compress(s):
    # Two pointers
    result = ""
    s += "!"  # add special char to mark end of string
    start_streak = 0
    end_streak = 0

    while end_streak < len(s):
        if s[start_streak] == s[end_streak]:
            end_streak += 1  # same char continue streak
        else:  # different char end of streak
            count = end_streak - start_streak
            if count < 2:
                result += s[start_streak]
            else:
                result += str(count) + s[start_streak]
            start_streak = end_streak

    return result
