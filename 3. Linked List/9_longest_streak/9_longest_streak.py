class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def longest_streak(head):
    current = head
    max_streak = 0
    current_streak = 0
    prev_val = None

    while current is not None:
        if prev_val == current.val:
            current_streak += 1
        else:
            current_streak = 1
        if current_streak > max_streak:
            max_streak = current_streak
        prev_val = current.val
        current = current.next
    return max_streak
