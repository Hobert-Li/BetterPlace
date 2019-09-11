package Classic._2_Sort;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/9 10:12
 */

public class _3_leetcode451_frequencySort {
    public String frequencySort(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            max = Math.max(max, map.get(s.charAt(i)));
        }

        String[] buckets = new String[max + 1];

        for (Map.Entry e : map.entrySet()) {
            String t = ""+e.getKey();
            if (buckets[(int) e.getValue()] == null) {
                buckets[(int) e.getValue()] = t;
            } else {
                buckets[(int) e.getValue()] = buckets[(int) e.getValue()] + t;
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = max; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[i].length(); j++) {
                    for (int k = 0; k < i; k++) {
                        ret.append(buckets[i].charAt(j));
                    }
                }
            }
        }

        return ret.toString();
    }

    public static void main(String[] args) {
        _3_leetcode451_frequencySort solution = new _3_leetcode451_frequencySort();
        String s = "cccaaa";
        System.out.println(solution.frequencySort(s));
    }
}
