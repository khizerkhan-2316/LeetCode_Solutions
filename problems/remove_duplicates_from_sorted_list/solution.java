/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
if (head == null || head.next == null) {
            return head;
        }
        
        ListNode listNode = new ListNode(head.val);
        ListNode listNode2 = listNode;
        
        while (head.next != null) {
            if (head.val != head.next.val) {
                listNode.next = new ListNode(head.next.val);
                listNode = listNode.next;
            }
            head = head.next;
        }
        
        return listNode2;
    
        
    }
}