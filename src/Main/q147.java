package Main;

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

public class q147 {
    public ListNode insertionSortList(ListNode head) {
        for(ListNode cur = head; cur != null; cur = cur.next)
            for(ListNode j = head; j != cur; j = j.next)
                if(j.val > cur.val){
                     int temp = j.val;
                    j.val = cur.val;
                    cur.val = temp;
                }

        return head;
    }
}
