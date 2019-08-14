/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 18:22</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _24_ReverseList {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newList = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }

        return newList.next;
    }
}
