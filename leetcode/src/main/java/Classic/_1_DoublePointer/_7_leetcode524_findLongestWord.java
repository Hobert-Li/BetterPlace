package Classic._1_DoublePointer;

import java.util.Arrays;
import java.util.List;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/5 18:03
 */

public class _7_leetcode524_findLongestWord {
    public String findLongestWord(String s, List<String> d) {
        String ret = "";
        for (String str : d) {
            for (int i = 0, j = 0; i < s.length(); i++) {

                if (s.charAt(i) == str.charAt(j)) {
                    j++;
                }

                if (j >= str.length()) {
                    if (str.length() >= ret.length()) {
                        if ("".equals(ret)) {
                            ret = str;
                        } else if (str.length() > ret.length()) {
                            ret = str;
                        } else if (str.length() == ret.length() && str.compareTo(ret) < 0) {
                            ret = str;
                        }
                    }
                    break;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        _7_leetcode524_findLongestWord solution = new _7_leetcode524_findLongestWord();
        String s = "bab";
        List<String> d = Arrays.asList("ba","ab","a","b");
        System.out.println(solution.findLongestWord(s, d));
    }
}
