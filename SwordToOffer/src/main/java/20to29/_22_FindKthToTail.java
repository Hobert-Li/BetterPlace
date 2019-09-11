/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 17:42</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _22_FindKthToTail {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this(val,null);
        }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }

        ListNode P1 = head;

        while (P1 != null && k > 0) {
            k--;
            P1 = P1.next;
        }

        if (k > 0) {
            return null;
        }

        ListNode P2 = head;
        while (P1 != null) {
            P1 = P1.next;
            P2 = P2.next;
        }
        return P2;
    }

    public static void main(String[] args) {
        ListNode a5 = new ListNode(5);
        ListNode a4 = new ListNode(4,a5);
        ListNode a3 = new ListNode(3,a4);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);
        ListNode a0 = new ListNode(0,a1);

        _22_FindKthToTail solution = new _22_FindKthToTail();
        System.out.println(solution.FindKthToTail(a0,1).val);
    }
}
