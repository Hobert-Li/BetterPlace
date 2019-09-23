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
    static HashSet<String> set = null;

    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);

        return true;
    }

    public static void main(String[] args) {
        _6_leetcode139_wordBreak solution = new _6_leetcode139_wordBreak();
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<String>(Arrays.asList(new String[]{"apple", "pen"}));
        System.out.println(solution.wordBreak(s, wordDict));
    }
}
