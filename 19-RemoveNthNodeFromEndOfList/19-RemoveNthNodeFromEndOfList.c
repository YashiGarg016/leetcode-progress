// Last updated: 23/04/2026, 00:07:28
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
    struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
       struct ListNode* slow = head;
       struct ListNode* fast = head;
        
        do{
            fast = fast->next;
            n--;
        }while(n>0);
        
        if(fast == NULL){
            return head->next;
        }

        while(fast->next != NULL){
            slow = slow->next;
            fast = fast->next;
        }

        slow->next = slow->next->next; //detatchng the deleted node, reassigning the links
        return head;
    }
    