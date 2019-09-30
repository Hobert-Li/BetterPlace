package Classic._7_DynamicProgramming._8_EditString;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/30 14:33
 */


public class _1_leetcode583_minDistance {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return word1.length() + word2.length() - 2*dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        _1_leetcode583_minDistance solution = new _1_leetcode583_minDistance();
        String word1 = "abcde";
        String word2 = "abcdefg";
        System.out.println(solution.minDistance(word1, word2));
    }
}
