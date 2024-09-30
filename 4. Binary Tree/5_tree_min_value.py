from collections import deque

class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def tree_min_value(root):
    if root is None:
        return float('inf')

    min_val = float('inf')
    queue = deque([root])
    while queue:
        current = queue.popleft()
        if current.val < min_val:
            min_val = current.val
        if current.left:
            queue.append(current.left)
        if current.right:
            queue.append(current.right)

    return min_val
