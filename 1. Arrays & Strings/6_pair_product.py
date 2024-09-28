def pair_product(numbers, target):
    num_map = {}

    for i in range(len(numbers)):
        if target % numbers[i] == 0:
            new_target = target // numbers[i]
            if new_target in num_map:
                return [num_map[new_target], i]
            else:
                num_map[numbers[i]] = i
    
    return None
