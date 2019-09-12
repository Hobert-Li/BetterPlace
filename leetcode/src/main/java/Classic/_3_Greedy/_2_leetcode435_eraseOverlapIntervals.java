package Classic._3_Greedy;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/9 17:49
 */

public class _2_leetcode435_eraseOverlapIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int t = 1;
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                t++;
            }
        }

        return intervals.length - t;
    }

    public static void main(String[] args) {
        _2_leetcode435_eraseOverlapIntervals solution = new _2_leetcode435_eraseOverlapIntervals();
        //int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        int[][] intervals = {{1,2}, {1,2}, {1,2}, {1,2}};
        System.out.println(solution.eraseOverlapIntervals(intervals));
    }
}
