package Classic.DoublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 9:56
 */

public class _3_leetcode345_reverseVowels {
    static final List<Character> list = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'});
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] c = new char[s.length()];
        while (i <= j) {
            if (list.contains(s.charAt(i)) && list.contains(s.charAt(j))) {
                c[i] = s.charAt(j);
                c[j] = s.charAt(i);
                i++;
                j--;
            } else if (list.contains(s.charAt(i)) && !list.contains(s.charAt(j))) {
                c[j] = s.charAt(j);
                j--;
            } else if (!list.contains(s.charAt(i)) && list.contains(s.charAt(j))) {
                c[i] = s.charAt(i);
                i++;
            } else if (!list.contains(s.charAt(i)) && !list.contains(s.charAt(j))) {
                c[i] = s.charAt(i);
                c[j] = s.charAt(j);
                i++;
                j--;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        _3_leetcode345_reverseVowels solution = new _3_leetcode345_reverseVowels();
        String s = "a.";
        System.out.println(solution.reverseVowels(s));
    }
}
