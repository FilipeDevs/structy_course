class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def level_averages(root):
    result = []
    fill_nodes(root, result, 0)

    average_list = []
    for lst in result:
        average = sum(lst) / len(lst)
        average_list.append(average)

    return average_list

def fill_nodes(root, lst, level):
    if root is None:
        return

    if level == len(lst):
        lst.append([root.val])
    else:
        lst[level].append(root.val)

    fill_nodes(root.left, lst, level + 1)
    fill_nodes(root.right, lst, level + 1)
