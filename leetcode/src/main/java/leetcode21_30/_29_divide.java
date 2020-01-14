package leetcode21_30;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 29. 两数相除</p>
 * <p>题目描述： 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * </p>
 *
 * <p>
 * 示例：
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/7 17:55
 */

//边界问题为解决
public class _29_divide {
    public int divide(long dividend, long divisor) {
        boolean isNegative;
        isNegative = dividend * divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int count = 0;
        while (dividend >= divisor) {
            count++;
            divisor <<= 1;
        }

        long result = 0;
        while (count > 0) {
            count--;
            divisor >>= 1;
            if (divisor <= dividend) {
                result += 1 << count;
                dividend -= divisor;
            }
        }

        if (isNegative) {
            result = -result;
        }
        if (Integer.MIN_VALUE <= result && result <= Integer.MAX_VALUE) {
            return (int) result;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        _29_divide solution = new _29_divide();
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(solution.divide(dividend,divisor));
    }
}
