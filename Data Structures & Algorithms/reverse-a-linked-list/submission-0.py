# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        node=None
        curr=head

        while curr != None:
            temp=curr.next
            curr.next=node
            node=curr
            #head=curr
            curr=temp
        return node
    

