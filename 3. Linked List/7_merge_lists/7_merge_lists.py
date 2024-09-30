class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def merge_lists(head1, head2):
    dummy_head = Node(None)
    tail = dummy_head
    curr1 = head1
    curr2 = head2

    while curr1 is not None and curr2 is not None:
        if curr1.val < curr2.val:
            tail.next = curr1
            curr1 = curr1.next
        else:
            tail.next = curr2
            curr2 = curr2.next
        tail = tail.next

    if curr1 is None:
        tail.next = curr2

    if curr2 is None:
        tail.next = curr1

    return dummy_head.next
