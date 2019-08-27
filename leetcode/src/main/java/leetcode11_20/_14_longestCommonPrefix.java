package leetcode11_20;

/**
 * <p>题目名字： 14. 最长公共前缀</p>
 * <p>题目描述： 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。</p>
 * <p>示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * @author 李宏博
 * @create 2019/8/23 16:55
 */

public class _14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minlen = Integer.MAX_VALUE;

        for (String s : strs) {
            minlen = Math.min(minlen, s.length());
        }

        if (minlen == 0) {
            return "";
        }

        int i = 0;
        StringBuilder sb = new StringBuilder("");

        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != strs[0].charAt(i)) {
                return "";
            }
        }

        while (i < minlen) {
            sb.append(""+strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (sb.length() != 0 && strs[j].charAt(i) != strs[0].charAt(i)) {
                    sb.delete(sb.length()-1, sb.length());
                    return sb.toString();
                }
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _14_longestCommonPrefix solution = new _14_longestCommonPrefix();
        //String[] strs = {"flower","flow","flight"};
        //String[] strs = {"dog","racecar","car"};
        String[] strs = {"abca","aba","aaab"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}

