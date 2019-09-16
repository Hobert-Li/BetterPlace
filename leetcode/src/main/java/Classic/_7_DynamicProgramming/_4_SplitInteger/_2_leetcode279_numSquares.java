package Classic._7_DynamicProgramming._4_SplitInteger;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 17:46
 */


public class _2_leetcode279_numSquares {
    public int numSquares(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >=0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        _2_leetcode279_numSquares solution = new _2_leetcode279_numSquares();
        int n = 12;
        System.out.println(solution.numSquares(n));
    }
}
