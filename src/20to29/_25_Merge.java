/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 18:29</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _25_Merge {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next,list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
