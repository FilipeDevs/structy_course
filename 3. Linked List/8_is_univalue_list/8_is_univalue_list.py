class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def is_univalue_list(head):
    current = head
    value = current.val

    while current is not None:
        if current.val != value:
            return False
        current = current.next

    return True
