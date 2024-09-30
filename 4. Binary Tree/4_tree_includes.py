from collections import deque

class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def tree_includes(root, target):
    if root is None:
        return False

    queue = deque([root])
    while queue:
        current = queue.popleft()
        if current.val == target:
            return True
        if current.left:
            queue.append(current.left)
        if current.right:
            queue.append(current.right)

    return False
