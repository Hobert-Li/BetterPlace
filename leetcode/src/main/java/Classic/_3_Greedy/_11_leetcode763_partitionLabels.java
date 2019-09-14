package Classic._3_Greedy;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 18:22
 */


public class _11_leetcode763_partitionLabels {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            lastIndexMap.put(S.charAt(i), i);
        }

        List<Integer> ret = new ArrayList<>();

        int start = 0;
        while (start < S.length()) {
            int end = start;
            for (int j = start; j <= end; j++) {
                if (lastIndexMap.containsKey(S.charAt(j))) {
                    end = Math.max(end, lastIndexMap.get(S.charAt(j)));
                }
            }
            ret.add(end - start + 1);
            start = end + 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        _11_leetcode763_partitionLabels solution = new _11_leetcode763_partitionLabels();
        String S = "ababcbacadefegdehijhklij";
        System.out.println(JSON.toJSONString(solution.partitionLabels(S)));
    }
}
