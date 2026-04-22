// Last updated: 23/04/2026, 00:05:37
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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode p = head; //fast boi
        ListNode q = head; //slow boi

        while(p.next != null && p.next.next != null){
            p = p.next.next;
            q = q.next;
        }

        return q;
    }
   
    public boolean isPalindrome(ListNode head) {
       if(head == null || head.next==null){
        return true;
       } 

       ListNode middle = findMiddle(head);
       ListNode secondHalf = reverse(middle.next);

       ListNode firstHalf = head;
       while(secondHalf != null){
        if(firstHalf.val != secondHalf.val){
            return false;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
       }
       return true;
    }
}