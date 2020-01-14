package leetcode21_30;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 30. 串联所有单词的子串</p>
 * <p>题目描述： 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 *</p>
 *
 * <p>
 * 示例：
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/10 17:40
 */

//利用回溯找全排序会导致超时，所以改为用HashMap记录单词出现次数
public class _30_findSubstring {
    String[] words;
    private HashSet<String> dict = new HashSet<>();
    private List<Integer> res = new ArrayList<>();
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || "".equals(s) || words == null || words.length == 0) {
            return res;
        }
        this.words = words;
        boolean[] map = new boolean[words.length];
        backtracking("", 0, map);
        int length = 0;
        for (int i = 0; i < words.length; i++) {
            length += words[i].length();
        }
        for (int start = 0; start < s.length() - length + 1; start++) {
            int end = start + length;
            String t = s.substring(start, end);
            if (dict.contains(t)) {
                res.add(start);
            }
        }

        return res;
    }

    private void backtracking(String s, int i, boolean[] map) {
        if (i == words.length) {
            dict.add(s);
        }

        for (int j = 0; j < map.length; j++) {
            if (!map[j]) {
                map[j] = true;
                backtracking(s + words[j], i + 1, map);
                map[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        _30_findSubstring solution = new _30_findSubstring();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        System.out.println(JSON.toJSONString(solution.findSubstring(s, words)));
    }
}
