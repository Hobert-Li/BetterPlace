package Classic._6_Search._1_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 9:53
 */


public class _3_leetcode127_ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        boolean[] mark = new boolean[wordList.size()];
        queue.add(beginWord);
        int ret = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ret++;
            while (size > 0) {
                String cur = queue.poll();
                if (cur.equals(endWord)) {
                    return ret;
                }
                for (int i = 0; i < wordList.size(); i++) {
                    if (mark[i]) {
                        continue;
                    }
                    int diff = 0;
                    for (int j = 0; j < wordList.get(i).length(); j++) {
                        if (cur.charAt(j) != wordList.get(i).charAt(j)) {
                            diff++;
                        }
                    }
                    if (diff == 1) {
                        queue.add(wordList.get(i));
                        mark[i] = true;
                    }
                }
                size--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        _3_leetcode127_ladderLength solution = new _3_leetcode127_ladderLength();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(solution.ladderLength(beginWord, endWord, wordList));
    }
}
