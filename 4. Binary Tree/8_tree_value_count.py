class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def tree_value_count(root, target):
    if root is None:
        return 0

    current_occ = 1 if root.val == target else 0
    current_occ += tree_value_count(root.left, target)
    current_occ += tree_value_count(root.right, target)

    return current_occ
