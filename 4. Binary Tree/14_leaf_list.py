class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def construct_leaf_list(root, lst):
    if root is None:
        return

    if root.left is None and root.right is None:
        lst.append(root.val)
        return

    construct_leaf_list(root.left, lst)
    construct_leaf_list(root.right, lst)

def leaf_list(root):
    lst = []
    construct_leaf_list(root, lst)
    return lst
