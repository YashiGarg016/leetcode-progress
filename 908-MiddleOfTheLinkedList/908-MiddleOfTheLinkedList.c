// Last updated: 23/04/2026, 00:04:25
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* p = head;
    struct ListNode* q = head;

    while(q != NULL && q->next != NULL){
        p = p->next;
        q = q->next->next;
    }
     return p;   
}