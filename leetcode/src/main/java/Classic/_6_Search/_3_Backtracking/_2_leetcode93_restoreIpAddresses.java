package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 13:58
 */


public class _2_leetcode93_restoreIpAddresses {
    private List<String> ret = new ArrayList<>();
    private String s;

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() == 0) {
            return ret;
        }
        this.s = s;
        List<String> list = new ArrayList<>();
        findIP(s,  list, 0);
        return ret;
    }

    private void findIP(String s, List<String> list, int n) {
        //递归终止条件
        if (n == 3) {
            if (isIpNum(s)) {
                String t = "";
                for (String t1 : list) {
                    t1 += ".";
                    t += t1;
                }
                t += s;
                ret.add(t);
            }
            return;
        }

        int i = 1;
        while (i < s.length()) {
            String s1 = s.substring(0, i);
            if (!isIpNum(s1)) {
                break;
            }
            String next = s.substring(i);
            List<String> tolist = new ArrayList<>();
            tolist.addAll(list);
            tolist.add(s1);
            findIP(next, tolist, n + 1);
            i++;
        }

    }

    private boolean isIpNum(String s) {
        int sl = s.length();
        Integer num;
        try {
            num = Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        int nl = num.toString().length();
        return sl == nl && num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        _2_leetcode93_restoreIpAddresses solution = new _2_leetcode93_restoreIpAddresses();
        String s = "0279245587303";
        System.out.println(JSON.toJSONString(solution.restoreIpAddresses(s)));
    }
}
