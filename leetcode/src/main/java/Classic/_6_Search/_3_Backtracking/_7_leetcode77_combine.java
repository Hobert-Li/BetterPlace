package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 18:46
 */


public class _7_leetcode77_combine {
    private List<List<Integer>> ret = new ArrayList<>();
    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        List<Integer> list = new ArrayList<>();
        find(1, list);
        return ret;
    }

    private void find(int start, List<Integer> list) {
        if (list.size() == k) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int j = start; j <= n; j++) {
            list.add(j);
            find(j + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        _7_leetcode77_combine solution = new _7_leetcode77_combine();
        int n = 4;
        int k = 2;
        System.out.println(JSON.toJSONString(solution.combine(n, k)));
    }
}
