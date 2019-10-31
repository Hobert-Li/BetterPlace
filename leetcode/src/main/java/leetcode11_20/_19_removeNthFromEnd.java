package leetcode11_20;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 19. 删除链表的倒数第N个节点</p>
 * <p>题目描述： 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。</p>
 *
 * <p>
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * </p>
 *
 * @author 李宏博
 * @create 2019/10/31 17:01
 */
public class _19_removeNthFromEnd {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode pre = root;
        ListNode now = root;
        int t = 0;
        while (pre != null) {
            if (t < n + 1) {
                pre = pre.next;
                t++;
            } else {
                pre = pre.next;
                now = now.next;
            }
        }

        now.next = now.next.next;
        return root.next;//注意这里的返回值
    }

    public static void main(String[] args) {
        _19_removeNthFromEnd solution = new _19_removeNthFromEnd();
        ListNode head = new ListNode(1);
        //ListNode node2 = new ListNode(2);
        //ListNode node3 = new ListNode(3);
        //ListNode node4 = new ListNode(4);
        //ListNode node5 = new ListNode(5);

        //head.next = node2;
        //node2.next = node3;
        //node3.next = node4;
        //node4.next = node5;
        //node5.next = null;

        int n = 1;
        head = solution.removeNthFromEnd(head, n);

        ListNode p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
