package leetcode1_10;

/**
 * <p>题目名字： 6. Z 字形变换</p>
 * <p>题目描述： 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 * <p>
 * 示例：输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * </p>
 *
 * @author 李宏博
 * @create 2019/8/21 9:14
 */

public class _6_convert {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }

        int down = 0;
        boolean isplus = true;
        for (int i = 0; i < s.length(); i++) {
            if (down == numRows) {
                down = down - 2;
                isplus = !isplus;
            }

            if (i != 0 && down == 0) {
                isplus = !isplus;
            }

            if (isplus) {
                sb[down].append(""+s.charAt(i));
                down++;
            } else {
                sb[down].append(""+s.charAt(i));
                down--;
            }
        }

        String result = "";
        for(StringBuilder t : sb) {
            result += t.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        _6_convert solution = new _6_convert();
        String s = "AB";
        int numRows = 1;
        String result = solution.convert(s, numRows);
        System.out.println(result);
    }
}
