package leetcode11_20;

/**
 * <p>题目名字： 13. 罗马数字转整数</p>
 * <p>题目描述： </p>
 * <p>示例：示例 1:
 *
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 *
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 *
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 *
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * @author 李宏博
 * @create 2019/8/23 16:36
 */

public class _13_romanToInt {
    static final int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] Roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public int romanToInt(String s) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                String temp = ""+s.charAt(i);
                for (int j = 0; j < Roman.length; j++) {
                    if (Roman[j].equals(temp)) {
                        result = result + nums[j];
                        temp = null;
                    }
                }
                break;
            }

            String temp = ""+s.charAt(i)+s.charAt(i+1);

            for (int j = 0; j < Roman.length; j++) {
                if (Roman[j].equals(temp)) {
                    result = result + nums[j];
                    i++;
                    temp = null;
                }
            }

            if (temp != null) {
                temp = ""+s.charAt(i);
                for (int j = 0; j < Roman.length; j++) {
                    if (Roman[j].equals(temp)) {
                        result = result + nums[j];
                        temp = null;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        _13_romanToInt solution = new _13_romanToInt();
        //String s = "III";
        //String s = "IV";
        //String s = "IX";
        //String s = "LVIII";
        //String s = "MCMXCIV";
        String s = "MMCDXXV";

        int result = solution.romanToInt(s);
        System.out.println(result);
    }
}
