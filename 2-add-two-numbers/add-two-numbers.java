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
        ListNode head = l3;
        int carry=0, sum;
        int x,y;
        while(l1 != null || l2 != null || carry != 0){
            if(l1 != null){
                x = l1.val;
            }else{
                x = 0;
            }

            if(l2 != null){
                y = l2.val;
            }else{
                y=0;
            }

            sum = x + y + carry;
            carry = sum/10;
            l3.next = new ListNode(sum%10);
            l3 = l3.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return head.next;
    }
}