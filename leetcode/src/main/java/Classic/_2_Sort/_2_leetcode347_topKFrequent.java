package Classic._2_Sort;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/6 17:46
 */

public class _2_leetcode347_topKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i : map.keySet()) {
            int fre = map.get(i);
            if (buckets[fre] == null) {
                buckets[fre] = new ArrayList<>();
            }

            buckets[fre].add(i);
        }

        List<Integer> ret = new ArrayList<>(k);
        for (int i = buckets.length-1; i >= 0 && ret.size() < k; i--) {
            if (buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= k - ret.size()) {
                ret.addAll(buckets[i]);
            } else {
                ret.addAll(buckets[i].subList(0, k - ret.size()));
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        _2_leetcode347_topKFrequent solution = new _2_leetcode347_topKFrequent();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(JSON.toJSONString(solution.topKFrequent(nums, k)));
    }
}
