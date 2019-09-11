package Classic._3_Greedy;

import java.util.Arrays;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/9 17:36
 */

public class _1_leetcode455_findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ret = 0;
        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ret++;
                i++;
            }
            j++;
        }
        return ret;
    }

    public static void main(String[] args) {
        _1_leetcode455_findContentChildren solution = new _1_leetcode455_findContentChildren();
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};

        System.out.println(solution.findContentChildren(g, s));
    }
}
