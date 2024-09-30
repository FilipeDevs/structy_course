def pair_sum(numbers, target):
    result = []
    num_map = {}

    for i, number in enumerate(numbers):
        new_target = target - number

        if new_target in num_map:
            result = [num_map[new_target], i]
            break
        else:
            num_map[number] = i

    return result
