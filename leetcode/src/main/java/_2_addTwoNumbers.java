import java.math.BigDecimal;

/**
 * <p>题目名字： 两数相加</p>
 * <p>题目描述： 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。</p>
 * <p>示例：输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807</p>
 *
 * @author 李宏博
 * @create 2019/8/19 17:33
 */

public class _2_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode look = result;

        boolean j = false;
        while (l1 != null || l2 != null) {
            if (j) {
                look.val = 1;
                j = false;
            }

            if (l1.val + l2.val + look.val >= 10) {
                j = true;
                look.val = look.val + l1.val + l2.val - 10;
            } else {
                look.val = look.val + l1.val + l2.val;
            }

            if (l1.next == null && j == false) {
                look.next = l2;
                break;
            }
            if (l1.next == null && j == true) {
                look.next = l2;
                look.val
                break;
            }
            if (l2.next == null) {
                look.next = l1;
                break;
            }

            look.next = new ListNode(0);
            look = look.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        look = result;
        while (true) {
            if (look == null) {
                break;
            }

            if (look.next.next == null && look.next.val == 0) {
                look.next = null;
                break;
            }

            look = look.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1_2 = new ListNode(8);
        //ListNode l1_3 = new ListNode(3);
        l1.next = l1_2;
        //l1_2.next = l1_3;

        ListNode l2 = new ListNode(0);
        //ListNode l2_2 = new ListNode(6);
        //ListNode l2_3 = new ListNode(4);
        //l2.next = l2_2;
        //l2_2.next = l2_3;

        _2_addTwoNumbers solution = new _2_addTwoNumbers();
        ListNode head = solution.addTwoNumbers(l1, l2);
        ListNode ret = head;
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}
