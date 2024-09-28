class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def linked_list_find(head, target):
    current = head
    while current is not None:
        if current.val == target:
            return True
        current = current.next
    return False
