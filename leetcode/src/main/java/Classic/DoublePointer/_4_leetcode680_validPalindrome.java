package Classic.DoublePointer;


/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 10:55
 */

public class _4_leetcode680_validPalindrome {
    static int jump = 1;
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        return validPalindrome(s, i, j);
    }

    private boolean validPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j) && jump != 0) {
                jump--;
                return validPalindrome(s, i + 1, j) || validPalindrome(s, i, j - 1);
            } else if (s.charAt(i) != s.charAt(j) && jump == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _4_leetcode680_validPalindrome solution = new _4_leetcode680_validPalindrome();
        String s = "cuucu";
        System.out.println(solution.validPalindrome(s));
    }
}
