class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def add_lists(head1, head2):
    return add_lists_recursive(head1, head2, 0)

def add_lists_recursive(head1, head2, carry):
    if head1 is None and head2 is None and carry == 0:
        return None

    value1 = 0 if head1 is None else head1.val
    value2 = 0 if head2 is None else head2.val

    sum_value = value1 + value2 + carry
    digit = sum_value % 10

    new_node = Node(digit)

    next_carry = 1 if sum_value >= 10 else 0

    next1 = None if head1 is None else head1.next
    next2 = None if head2 is None else head2.next

    new_node.next = add_lists_recursive(next1, next2, next_carry)

    return new_node
