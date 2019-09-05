package Classic.DoublePointer;

import common.ListNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/5 17:57
 */

public class _6_leetcode141_hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode q = head;
        ListNode l = head;
        while (q != null && q.next != null) {
            q = q.next.next;
            l = l.next;
            if (q == l) {
                return true;
            }
        }
        return false;
    }
}
