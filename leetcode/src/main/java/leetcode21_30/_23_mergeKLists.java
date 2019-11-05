package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 23. 合并K个排序链表</p>
 * <p>题目描述： 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。</p>
 *
 * <p>
 * 示例：
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/5 16:00
 */

//暴力，能过，更优解有优先队列排序，或者分治法。
public class _23_mergeKLists {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode aux = new ListNode(0);
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode p = aux;
        while (isNotNull(lists)) {
            ListNode minnode = findMin(lists);
            p.next = minnode;
            p = p.next;
        }
        return aux.next;
    }

    private ListNode findMin(ListNode[] lists) {
        ListNode res = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            min = Math.min(min, lists[i].val);
        }
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val == min) {
                res = lists[i];
                lists[i] = lists[i].next;
                break;
            }
        }
        return res;
    }

    private boolean isNotNull(ListNode[] lists) {
        boolean res = false;
        for (int i = 0; i < lists.length; i++) {
            res |= (lists[i] != null);
        }
        return res;
    }

    public static void main(String[] args) {
        _23_mergeKLists solution = new _23_mergeKLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        ListNode root = solution.mergeKLists(lists);
        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }
    }
}
