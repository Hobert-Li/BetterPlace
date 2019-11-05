package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 24. 两两交换链表中的节点</p>
 * <p>题目描述： 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。</p>
 *
 * <p>
 * 示例：
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/5 16:29
 */
public class _24_swapPairs {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode sentry = new ListNode(0);
    public ListNode swapPairs(ListNode head) {
        sentry.next = head;
        ListNode p = sentry;
        while (p != null && p.next != null && p.next.next != null) {
            ListNode t = p.next.next;
            p.next.next = t.next;
            t.next = p.next;
            p.next = t;
            p = p.next.next;
        }
        return sentry.next;
    }

    public static void main(String[] args) {
        _24_swapPairs solution = new _24_swapPairs();
        ListNode l = new ListNode(1);
        //ListNode l2 = new ListNode(2);
        //ListNode l3 = new ListNode(3);
        //ListNode l4 = new ListNode(4);
        //ListNode l5 = new ListNode(5);

        //l.next = l2;
        //l2.next = l3;
        //l3.next = l4;
        //l4.next = l5;

        ListNode p = solution.swapPairs(l);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
