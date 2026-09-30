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
    public ListNode reverseList(ListNode head) {

if(head==null)
return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = cur.next;

        while(nxt!= null){
            cur.next = pre;
            pre= cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next=pre;
return cur;
    }
}
