class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def get_node_value(head, index):
    current = head
    while current is not None:
        if index == 0:
            return current.val
        current = current.next
        index -= 1
    return None
