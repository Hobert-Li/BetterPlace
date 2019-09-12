package Classic._3_Greedy;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 13:09
 */


public class _4_leetcode406_reconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                } else {
                    return b[0] - a[0];
                }
            }
        });

        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }

        return queue.toArray(new int[queue.size()][]);
    }

    public static void main(String[] args) {
        _4_leetcode406_reconstructQueue solution = new _4_leetcode406_reconstructQueue();
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(JSON.toJSONString(solution.reconstructQueue(people)));
    }
}
