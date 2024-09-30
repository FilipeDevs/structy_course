def intersection(list_a, list_b):
    result = []
    set_a = set(list_a)  # O(n)

    # O(m)
    for val in list_b:
        if val in set_a:  # O(1)
            result.append(val)
    
    return result
