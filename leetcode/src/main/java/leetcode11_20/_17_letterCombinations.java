package leetcode11_20;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 17. 电话号码的字母组合</p>
 * <p>题目描述： 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。</p>
 *
 * <p>
 * 示例：
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * </p>
 *
 * @author 李宏博
 * @create 2019/10/29 14:19
 */
public class _17_letterCombinations {
    private String[] dict = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private String digits;
    private List<String> ret = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return ret;
        }
        this.digits = digits;
        backtracking(0, "");
        return ret;
    }

    private void backtracking( int index, String s) {
        if (index > digits.length() - 1) {
            ret.add(s);
            return;
        }
        for (int i = 0; i < dict[digits.charAt(index) - '0'].length(); i++) {
            backtracking(index + 1, s + dict[digits.charAt(index) - '0'].charAt(i));
        }
    }

    public static void main(String[] args) {
        _17_letterCombinations solution = new _17_letterCombinations();
        String digits = "";
        System.out.println(JSON.toJSONString(solution.letterCombinations(digits)));
    }
}
