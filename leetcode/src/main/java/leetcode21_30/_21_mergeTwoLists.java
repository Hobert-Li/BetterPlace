package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 21. 合并两个有序链表</p>
 * <p>题目描述： 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。</p>
 *
 * <p>
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/1 14:31
 */
public class _21_mergeTwoLists {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode aux = new ListNode(0);
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode now = aux;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                now.next = p2;
                p2 = p2.next;
                now = now.next;
            } else if (p2 == null) {
                now.next = p1;
                p1 = p1.next;
                now = now.next;
            } else if (p1.val >= p2.val) {
                now.next = p2;
                p2 = p2.next;
                now = now.next;
            } else {
                now.next = p1;
                p1 = p1.next;
                now = now.next;
            }
        }
        return aux.next;
    }

    public static void main(String[] args) {
        _21_mergeTwoLists solution = new _21_mergeTwoLists();
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode head = solution.mergeTwoLists(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
