package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 16:22
 */


public class _8_leetcode392_isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        _8_leetcode392_isSubsequence solution = new _8_leetcode392_isSubsequence();
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
