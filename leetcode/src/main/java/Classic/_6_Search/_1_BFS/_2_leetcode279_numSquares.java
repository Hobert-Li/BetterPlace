package Classic._6_Search._1_BFS;

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
 * @create 2019/10/5 20:14
 */


public class _2_leetcode279_numSquares {
    public int numSquares(int n) {
        List<Integer> squares = generateSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] mark = new boolean[n + 1];
        queue.add(n);
        mark[n] = true;
        int ret = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ret++;
            while (size > 0) {
                int cur = queue.poll();
                for (int s : squares) {
                    int t = cur - s;
                    if (t < 0) {
                        break;
                    }
                    if (t == 0) {
                        return ret;
                    }
                    if (mark[t]) {
                        continue;
                    }
                    queue.add(t);
                    mark[t] = true;
                }
                size--;
            }
        }
        return n;
    }

    public List<Integer> generateSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        int index = 1;
        int cur = 1;
        while (cur <= n) {
            squares.add(cur);
            index++;
            cur = index * index;
        }
        return squares;
    }

    public static void main(String[] args) {
        _2_leetcode279_numSquares solution = new _2_leetcode279_numSquares();
        System.out.println(JSON.toJSONString(solution.generateSquares(5)));
    }
}
