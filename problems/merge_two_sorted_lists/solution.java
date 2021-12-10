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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
  ListNode dummyNode = new ListNode(-1);
        ListNode curNode = dummyNode;
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curNode.next = list1;
                list1 = list1.next;
            }
            else{
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;
        }
        curNode.next = list1 == null ? list2 : list1;
        return dummyNode.next;
        
    }
}