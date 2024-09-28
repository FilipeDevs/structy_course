class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def insert_node(head, value, index):
    new_node = Node(value)

    if index == 0:
        new_node.next = head
        return new_node

    count = 0
    current = head.next
    prev = None

    while current is not None:
        count += 1
        if index == count:
            new_node.next = current
            prev.next = new_node
            break
        prev = current
        current = current.next

    if index > count:
        prev.next = new_node

    return head
