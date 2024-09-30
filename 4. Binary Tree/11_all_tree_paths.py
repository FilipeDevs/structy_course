class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def all_tree_paths(root):
    result = _all_tree_paths(root)
    for lst in result:
        lst.reverse()
    return result

def _all_tree_paths(root):
    if root is None:
        return []

    if root.left is None and root.right is None:
        return [[root.val]]

    all_paths = []

    left_paths = _all_tree_paths(root.left)
    for lst in left_paths:
        lst.append(root.val)
        all_paths.append(lst)

    right_paths = _all_tree_paths(root.right)
    for lst in right_paths:
        lst.append(root.val)
        all_paths.append(lst)

    return all_paths
