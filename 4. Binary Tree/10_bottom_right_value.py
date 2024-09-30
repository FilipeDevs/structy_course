from collections import deque

class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def bottom_right_value(root):
    if root is None:
        return None

    queue = deque([root])
    current = None
    while queue:
        current = queue.popleft()
        if current.left:
            queue.append(current.left)
        if current.right:
            queue.append(current.right)

    return current.val
