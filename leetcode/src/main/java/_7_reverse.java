/**
 * <p>题目名字： 7. 整数反转</p>
 * <p>题目描述： 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。</p>
 * <p>
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21</p>
 *
 * @author 李宏博
 * @create 2019/8/21 16:30
 */

public class _7_reverse {
    public int reverse(int x) {
        String str = String.valueOf(x);

        if (str.length() == 1) {
            return Integer.valueOf(str);
        }

        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        boolean isNegative = false;

        if (sb.charAt(i) == '-') {
            i++;
            sb = new StringBuilder(sb.substring(i,sb.length()));
            isNegative = true;
        }

        i = 0;
        int j = sb.length() - 1;
        while (j >= 0 && sb.charAt(j) == '0') {
            sb = new StringBuilder(sb.substring(i,j));
            j--;
        }
        sb = sb.reverse();

        try {
            int result = Integer.valueOf(sb.toString());
            if (isNegative) {
                return 0-result;
            } else {
                return result;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        _7_reverse solution = new _7_reverse();
        int x = 1534236469;
        //int x = -123;
        //int x = 120;
        int result = solution.reverse(x);
        System.out.println(result);
    }
}
