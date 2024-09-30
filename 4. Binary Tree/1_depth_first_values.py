class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def recursivedepthFirst(node, result):
    if node is None:
        return

    result.append(node.val)
    recursivedepthFirst(node.left, result)
    recursivedepthFirst(node.right, result)

def depthFirstValues(root):
    result = []
    recursivedepthFirst(root, result)
    return result
