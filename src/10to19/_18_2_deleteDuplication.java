/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 18:35</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _18_2_deleteDuplication {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

    public static void main(String[] args) {

    }
}
