/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 18:06</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _23_EntryNodeOfLoop {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead,fast = pHead;
        fast = fast.next.next;
        slow = slow.next;
        while (slow != fast) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
