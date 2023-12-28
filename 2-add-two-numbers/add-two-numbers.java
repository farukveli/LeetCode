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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode tmp, head;
        head = l3;
        int carry=0;

        if(l1 != null && l2 != null){
            l3.val = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null && l2 != null){
            l3.next = new ListNode();
            l3.next.val = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }

        if(l1 != null){
            tmp = l1;
        }else{
            tmp = l2;
        }

        while(tmp != null){
            l3.next = new ListNode();
            l3.next.val = (tmp.val + carry)%10;
            carry = (tmp.val + carry)/10;
            tmp = tmp.next;
            l3 = l3.next;
        }

        if(carry!=0){
            l3.next = new ListNode();
            l3.next.val = carry;
        }
        
        return head;
    }
}