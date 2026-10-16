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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     int count=0;
     int c=0;
     ListNode num = head;
     while(num!=null){
 num=num.next;
 c++;
     }
     if(c==n){
        head=head.next;
        return head;
     }
    System.out.println("value of c" + c);
 count=c-n;
 ListNode i = head;
 ListNode j = head;
 while(i!=null){
if(count== 1){ 
    if(i.next!= null ){
    j=i.next.next;
    i.next=j;
    break;
    }
}
System.out.println("value of i" + i.val);
i=i.next;
count--;
System.out.println("value of count" + count);

 }
 return head;
}
}













