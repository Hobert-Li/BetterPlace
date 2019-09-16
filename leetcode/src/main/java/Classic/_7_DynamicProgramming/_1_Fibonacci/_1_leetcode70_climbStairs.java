package Classic._7_DynamicProgramming._1_Fibonacci;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/14 20:58
 */


public class _1_leetcode70_climbStairs {
    public int climbStairs(int n) {
        int pre2 = 1;
        int pre1 = 1;
        int cur = 1;
        for (int i = 1; i < n; i++) {
            cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        _1_leetcode70_climbStairs solution = new _1_leetcode70_climbStairs();
        System.out.println(solution.climbStairs(4));
    }
}
