package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 10:33
 */


public class _1_leetcode17_letterCombinations {
    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private String digits;
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        this.digits = digits;
        return findLetter(0);
    }

    private List<String> findLetter(int i) {
        List<String> list = new ArrayList<>();
        String t = map[Integer.parseInt("" + digits.charAt(i))];
        if (i == digits.length() - 1) {
            for (int j = 0; j < t.length(); j++) {
                list.add("" + t.charAt(j));
            }
            return list;
        }

        List<String> nextlist = findLetter(i + 1);
        for (int j = 0; j < t.length(); j++) {
            for (String s : nextlist) {
                list.add("" +t.charAt(j) + s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        _1_leetcode17_letterCombinations solution = new _1_leetcode17_letterCombinations();
        String digits = "23";
        System.out.println(JSON.toJSONString(solution.letterCombinations(digits)));
    }
}
