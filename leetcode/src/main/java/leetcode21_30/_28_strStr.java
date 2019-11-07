package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 28. 实现 strStr()</p>
 * <p>题目描述： 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * </p>
 *
 * <p>
 * 示例：
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/7 17:06
 */

//有很多扩展之后可以着重看看，KMP算法等
public class _28_strStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() == 0 || needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needle.length(); j++) {
                    if (haystack.charAt(j + i) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        _28_strStr solution = new _28_strStr();
        String haystack = "aaa";
        String needle = "aaaa";
        System.out.println(solution.strStr(haystack, needle));
    }
}
