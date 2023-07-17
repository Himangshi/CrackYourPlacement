/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
        int l1=getLength(headA);
        int l2=getLength(headB);
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int d=0;
        if(l1>l2){
            d=l1-l2;
            while(d>0){
             ptr1=ptr1.next;
             d--;
            }
        }
        else{
            d=l2-l1;
            while(d>0){
              ptr2=ptr2.next;
              d--;
            }
        }

        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
            return ptr1;
            }
         ptr1=ptr1.next;
         ptr2=ptr2.next;

        }
        return null;
    }

    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
