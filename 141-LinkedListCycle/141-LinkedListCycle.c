// Last updated: 23/04/2026, 00:06:20
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode* p = head;
    struct ListNode* q = head;
 

    while(q != NULL && q->next != NULL){
        p = p->next;
        q = q->next->next;

        if(p==q){
            return true;
        }
    }
    return false;

}