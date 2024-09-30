class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def return_path(root, target):
    if root is None:
        return None

    if root.val == target:
        return [target]

    left_path = return_path(root.left, target)
    if left_path is not None:
        left_path.append(root.val)
        return left_path

    right_path = return_path(root.right, target)
    if right_path is not None:
        right_path.append(root.val)
        return right_path

    return None

def path_finder(root, target):
    path = return_path(root, target)
    if path is None:
        return None
    path.reverse()
    return path
