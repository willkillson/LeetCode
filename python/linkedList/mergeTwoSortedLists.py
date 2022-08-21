from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        return list1;
        
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
ans = solution.mergeTwoLists(head,head)

# solution.printList(ans)