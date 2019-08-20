import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>题目名字： 3.无重复字符的最长子串</p>
 * <p>题目描述： 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。</p>
 * <p>示例：输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * @author 李宏博
 * @create 2019/8/19 22:39
 */

public class _3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == "")
            return 0;
        if (s.length() == 1)
            return 1;
        HashMap<Integer, StringBuilder> dict = new HashMap<Integer, StringBuilder>();

        char[] c = s.toCharArray();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            int has = sbget(t,c[i]);
            if (has == -1) {
                t.append(c[i]);
            } else {
                dict.put(t.length(),t);
                t.delete(0,has + 1);
                t.append(c[i]);
            }
        }
        if (t.length() != 0) {
            dict.put(t.length(),t);
            t = null;
        }


        int ret = Integer.MIN_VALUE;
        for (Map.Entry e : dict.entrySet()) {
            ret = Math.max(ret, (Integer) e.getKey());
        }
        return ret;
    }

    public int sbget(StringBuilder sb,char c) {
        for (int i = 0; i < sb.length(); i++) {
            if (c == sb.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _3_lengthOfLongestSubstring solution = new _3_lengthOfLongestSubstring();
        String s = "dvdf";
        int ret = solution.lengthOfLongestSubstring(s);
        System.out.println(ret);
    }
}
