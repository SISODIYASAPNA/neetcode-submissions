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
    public boolean hasCycle(ListNode head) {
        ListNode t= new ListNode();
        ListNode r = new ListNode();
        if(head == null ||  head.next == null ) return false;
       if(head.next.next == head) return true;
      t= head;
      r=head;
        while(r!= null && r.next!= null){
       t=t.next;
       if(r!= null && r.next!= null){
        r=r.next.next;
       }
    if(t==r) return true;
    
        }
return false;
    }
    
}
