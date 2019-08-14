import java.util.Stack;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/7 18:15</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _31_IsPopOrder {
    public boolean IsPopOrder(int[] pushSequence,int[] popSequence) {
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int pushIndex = 0,popIndex = 0;pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while (popIndex < n && !stack.isEmpty() &&stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

}
