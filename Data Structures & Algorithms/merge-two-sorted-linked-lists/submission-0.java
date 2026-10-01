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
        ListNode list3 = null;
        ListNode head = null;
         if(list1 == null)
        return list2;

         if(list2 == null)
        return list1;

        while(list1!= null && list2!= null){
        if(list1.val <= list2.val) {
            if (list3 == null){
           list3= list1;
           head= list3;
            }else{
                list3.next = list1;
                list3= list3.next;
            }
           list1=list1.next;
        }
        else{
          if (list3 == null){
           list3= list2;
           head = list3;
            }else{
                list3.next = list2;
                list3= list3.next;
            }
           list2=list2.next;  
        }
        
       }
      if(list1!= null) 
      list3.next= list1;
     if(list2 != null) 
      list3.next= list2;
      
      
        return head;
    }
    
}





