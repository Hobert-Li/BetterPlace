import java.util.PriorityQueue;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/15 18:21
 */


public class _41_1_GetMedian {

    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);

    private PriorityQueue<Integer> right = new PriorityQueue<>();

    private int N = 0;

    public void Insert(Integer val) {
        if (N % 2 == 0) {
            left.add(val);
            right.add(left.poll());
        } else {
            right.add(val);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if (N % 2 == 0)
            return (left.peek() + right.peek())/2.0;
        else
            return Double.valueOf(right.peek());
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        _41_1_GetMedian solution = new _41_1_GetMedian();
        for (int i = 0; i < nums.length; i++) {
            solution.Insert(nums[i]);
        }
        System.out.println(solution.GetMedian());
    }
}
