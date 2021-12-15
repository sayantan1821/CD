package Main;


//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
public class q23 {
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
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        int mid = k / 2;
        ListNode p1 = mergeNode(lists, 0, mid);
        ListNode p2 = mergeNode(lists, mid + 1, k);

        ListNode Ans = new ListNode();
        ListNode res = Ans;
        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                res.next = p1;
                res= res.next;
                p1 = p1.next;
            } else {
                res.next = p2;
                res = res.next;
                p2 = p2.next;
            }
        }
        while(p1 != null) {
            res.next = p1;
            res = res.next;
            p1 = p1.next;
        }
        while(p2 != null) {
            res.next = p2;
            res = res.next;
            p2 = p2.next;
        }
        return Ans.next;
    }
    public ListNode mergeNode(ListNode[] lists, int h, int t) {
        if(h == t) {
            return lists[h];
        }
        int k = lists.length;
        int mid = k / 2;
        ListNode p1 = mergeNode(lists, h, mid);
        ListNode p2 = mergeNode(lists, mid + 1, t);

        ListNode ans = new ListNode();
        ListNode res = ans;

        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                res.next = p1;
                res= res.next;
                p1 = p1.next;
            } else {
                res.next = p2;
                res = res.next;
                p2 = p2.next;
            }
        }
        while(p1 != null) {
            res.next = p1;
            res = res.next;
            p1 = p1.next;
        }
        while(p2 != null) {
            res.next = p2;
            res = res.next;
            p2 = p2.next;
        }
        return ans.next;
    }
}
