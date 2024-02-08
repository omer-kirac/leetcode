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
    public int getDecimalValue(ListNode head) {
        ListNode reversed = reverseList(head); // linked list'i ters çevir

        ListNode current = reversed;
        int sum = 0;
        int multiply = 1;

        while(current != null){
            sum += current.val * multiply;
            multiply *= 2;
            current = current.next;
        }

        return sum;
    }

    // linked list'i ters çevirmek için yardımcı metod
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}
