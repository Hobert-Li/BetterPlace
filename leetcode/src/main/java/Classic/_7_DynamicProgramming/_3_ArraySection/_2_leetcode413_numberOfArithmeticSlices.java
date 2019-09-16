package Classic._7_DynamicProgramming._3_ArraySection;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 13:05
 */


public class _2_leetcode413_numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int[] dp = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }

        int ret = 0;
        for (int i : dp) {
            ret += i;
        }
        return ret;
    }

    public static void main(String[] args) {
        _2_leetcode413_numberOfArithmeticSlices solution = new _2_leetcode413_numberOfArithmeticSlices();
        int[] A = {1,2,3,4};
        System.out.println(solution.numberOfArithmeticSlices(A));
    }
}
