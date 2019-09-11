/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 15:25</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _52_FindFirstCommonNode {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        _52_FindFirstCommonNode solution = new _52_FindFirstCommonNode();
        ListNode a0 = new ListNode(0);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        ListNode b0 = new ListNode(0);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        ListNode b4 = new ListNode(4);
        a0.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = c1;
        c1.next = c2;
        b0.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = c1;
        System.out.println(solution.FindFirstCommonNode(a0,b0));
    }
}
