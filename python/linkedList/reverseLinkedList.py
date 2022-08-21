# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head):
        # Len is 0
        if head is None:
            return head;
        # Len is 1
        if head.next is None:
            return head;
        
        p = None;
        c = head;
        h = head.next;
        while True:
            c.next = p
            p = c;
            c = h;
            if h.next is None:
                h.next = p;
                break;
            h = h.next;
        h.next = p;
        return h;

    def printList(self, head):
        cur = head;
        while cur != None:
            print(cur.val);
            cur = cur.next;

n_5 = ListNode(5, None);
n_4 = ListNode(4, n_5);
n_3 = ListNode(3, n_4);
n_2 = ListNode(2, n_3);
head = ListNode(1, n_2);

solution = Solution()
ans = solution.reverseList(head)

solution.printList(ans)

