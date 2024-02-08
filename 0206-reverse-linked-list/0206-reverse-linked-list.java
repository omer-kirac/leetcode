class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        
 
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        
    
        int[] llist = new int[size];
        
       
        current = head;
        int i = 0;
        while (current != null) {
            llist[i] = current.val;
            current = current.next;
            i++;
        }
       
        current = head;
        for (int a = llist.length - 1; a >= 0; a--) {
            current.val = llist[a];
            current = current.next;
        }
        
        return head;
    }
}
