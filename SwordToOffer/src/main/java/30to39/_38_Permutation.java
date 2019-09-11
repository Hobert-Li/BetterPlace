import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>Description:  字符串的排列</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/15 17:29
 */


public class _38_Permutation {

    public ArrayList<String> ret = new ArrayList<String>();

    public ArrayList<String> Permutation(String str) {
        if (str.length() == 0) {
            return ret;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        backtracking(chars, new boolean[chars.length], new StringBuilder());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder sb) {
        if (sb.length() == chars.length) {
            ret.add(sb.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (hasUsed[i])
                continue;
            if (i != 0 && chars[i] == chars[i - 1] && !hasUsed[i - 1])
                continue;
            hasUsed[i] = true;
            sb.append(chars[i]);
            backtracking(chars, hasUsed, sb);
            sb.deleteCharAt(sb.length() - 1);
            hasUsed[i] = false;
        }
    }

    public static void main(String[] args) {
        _38_Permutation solution = new _38_Permutation();
        solution.Permutation("abc");
        for (String str : solution.ret) {
            System.out.println(str);
        }
    }

}
