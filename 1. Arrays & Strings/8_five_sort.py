def five_sort(array):
    start_index = 0
    end_index = len(array) - 1

    while start_index < end_index:
        if array[end_index] == 5:
            # 5 at the right no need to swap move right pointer to left
            end_index -= 1
        elif array[start_index] != 5:
            # not a 5 at the left so no need to swap, move left pointer to right
            start_index += 1
        else:
            array[start_index], array[end_index] = array[end_index], array[start_index]
    
    return array
