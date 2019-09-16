package Classic._7_DynamicProgramming._5_LongestIncreasingSubsequence;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/16 13:41
 */


public class _2_leetcode646_findLongestChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        //[[-9,8],[-6,-2],[-6,9],[-5,3],[-1,4],[0,3],[1,6],[8,10]]
        int[] dp = new int[pairs.length];
        dp[0] = 1;
        for (int i = 1; i < pairs.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[pairs.length - 1];
    }

    public static void main(String[] args) {
        _2_leetcode646_findLongestChain solution = new _2_leetcode646_findLongestChain();
        int[][] pairs = {{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};
        System.out.println(solution.findLongestChain(pairs));
    }
}
