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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int position = 0;
        int size = 0;
        while(current != null){
            
            size++;
            current = current.next;
        }
        
       position = (size/2) + 1;
        current = head;
        
        for(int i = 1; i< position; i++){
            current = current.next;
        }
        return current;
    }
}