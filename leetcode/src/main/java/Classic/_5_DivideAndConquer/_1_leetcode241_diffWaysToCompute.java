package Classic._5_DivideAndConquer;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/5 19:08
 */


public class _1_leetcode241_diffWaysToCompute {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (input.charAt(i) == '+') {
                            ret.add(l + r);
                        }
                        if (input.charAt(i) == '-') {
                            ret.add(l - r);
                        }
                        if (input.charAt(i) == '*') {
                            ret.add(l * r);
                        }
                    }
                }
            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.parseInt(input));
        }
        return ret;
    }

    public static void main(String[] args) {
        _1_leetcode241_diffWaysToCompute solution = new _1_leetcode241_diffWaysToCompute();
        String input = "2*3-4*5";
        System.out.println(JSON.toJSONString(solution.diffWaysToCompute(input)));
    }
}
