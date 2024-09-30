from collections import deque

class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def tree_levels(root):
    if root is None:
        return []

    levels = []
    queue = deque([(root, 0)])
    while queue:
        node, level = queue.popleft()
        
        if level == len(levels):
            levels.append([node.val])
        else:
            levels[level].append(node.val)

        if node.left:
            queue.append((node.left, level + 1))
        if node.right:
            queue.append((node.right, level + 1))

    return levels
