package Main;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class q21 {
    public static void main(String[] args) {
        System.out.println("ok");
    }
        public int mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(l1 != null && l2 != null ) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while(l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        //return ans.next;
        return 0;
    }
}
