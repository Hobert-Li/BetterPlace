package Classic._7_DynamicProgramming._6_Knapsack;

import java.util.*;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/23 14:42
 */


public class _6_leetcode139_wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String t : wordDict) {
                if (t.length() <= i && t.equals(s.substring(i - t.length(), i))) {
                    dp[i] = dp[i] || dp[i - t.length()];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        _6_leetcode139_wordBreak solution = new _6_leetcode139_wordBreak();
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<String>(Arrays.asList("apple", "pen"));
        System.out.println(solution.wordBreak(s, wordDict));
    }
}
