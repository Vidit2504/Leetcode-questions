class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Save the next node
            curr.next = prev;              // Reverse the link
            prev = curr;                   // Move prev one step forward
            curr = nextTemp;               // Move curr one step forward
        }
        
        return prev; // prev is the new head of the reversed list
    }
}