import java.util.Arrays;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 10:03</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _10_4_JumpFloorII {
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp,1);
        for (int i = 1;i < target;i++) {
            for (int j = 0;j < i;j++) {
                dp[i] = dp[i] + dp[j];
            }
        }
        return dp[target - 1];
    }

    public static void main(String[] args) {
        _10_4_JumpFloorII solution = new _10_4_JumpFloorII();
        System.out.println(solution.JumpFloorII(10));
    }
}
