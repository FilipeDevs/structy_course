class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def create_linked_list(values):
    if not values:
        return None

    head = Node(values[0])
    current = head

    for value in values[1:]:
        current.next = Node(value)
        current = current.next

    return head
