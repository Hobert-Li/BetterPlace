import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/16 18:32
 */


public class _45_PrintMinNumber {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }

        int n = numbers.length;
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = numbers[i] + "";
        }

        Arrays.sort(nums,(s1,s2) -> (s1 + s2).compareTo(s2 + s1));
        String ret = "";
        for (String str : nums) {
            ret += str;
        }
        return ret;
    }

    public static void main(String[] args) {
        _45_PrintMinNumber solution = new _45_PrintMinNumber();
        int[] numbers = {3, 32, 321};
        System.out.println(solution.PrintMinNumber(numbers));
    }
}
