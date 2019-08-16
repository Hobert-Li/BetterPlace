import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/15 18:38
 */


public class _41_2_FirstAppearingOnce {

    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1)
            queue.poll();
    }

    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

    public static void main(String[] args) {
        _41_2_FirstAppearingOnce solution = new _41_2_FirstAppearingOnce();
        String str = "google";

        for (int i = 0; i < str.length(); i++) {
            solution.Insert(str.charAt(i));
        }

        System.out.println(solution.FirstAppearingOnce());
    }
}
