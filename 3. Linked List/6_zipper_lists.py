class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def zipper_lists(head1, head2):
    head = head1
    tail = head
    current1 = head1.next
    current2 = head2

    count = 0
    while current1 is not None and current2 is not None:
        if count % 2 == 0:
            tail.next = current2
            current2 = current2.next
        else:
            tail.next = current1
            current1 = current1.next
        tail = tail.next
        count += 1

    if current1 is None:
        tail.next = current2

    if current2 is None:
        tail.next = current1

    return head
