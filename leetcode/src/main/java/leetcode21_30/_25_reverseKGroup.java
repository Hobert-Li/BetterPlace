package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 *
 * <p>
 * 示例：
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/5 16:44
 */

//copy
public class _25_reverseKGroup {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode sentry = new ListNode(0);
    public ListNode reverseKGroup(ListNode head, int k) {
        sentry.next = head;
        ListNode pre = sentry;
        ListNode now = sentry;
        while (pre.next != null) {
            for (int i = 0; i < k && pre != null; i++) {
                pre = pre.next;
            }
            if (pre == null) {
                break;
            }
            ListNode start = now.next;
            ListNode next = pre.next;
            pre.next = null;
            now.next = reverse(start);
            start.next = next;
            now = start;
            pre = now;
        }
        return sentry.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        _25_reverseKGroup solution = new _25_reverseKGroup();
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode p = solution.reverseKGroup(head, 3);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

}
