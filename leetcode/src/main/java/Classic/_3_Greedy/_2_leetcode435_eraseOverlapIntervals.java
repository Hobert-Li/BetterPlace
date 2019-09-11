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
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        System.out.println(JSON.toJSONString(intervals));

        return 0;
    }

    public static void main(String[] args) {
        _2_leetcode435_eraseOverlapIntervals solution = new _2_leetcode435_eraseOverlapIntervals();
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        solution.eraseOverlapIntervals(intervals);
    }
}
