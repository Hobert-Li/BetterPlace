package Classic._3_Greedy;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 12:59
 */


public class _3_leetcode452_findMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int ret = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                ret++;
                end = points[i][1];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        _3_leetcode452_findMinArrowShots solution = new _3_leetcode452_findMinArrowShots();
        int[][] points = {{1,2}, {2,3}, {3,4}, {4,5}};
        System.out.println(solution.findMinArrowShots(points));
    }
}
