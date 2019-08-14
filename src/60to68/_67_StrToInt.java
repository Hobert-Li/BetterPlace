/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 18:34</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _67_StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for (int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))
                continue;
            if (c < '0' || c > '9')
                return 0;
            ret = ret * 10 + (c - '0');
        }
        return isNegative ? -ret : ret;
    }
}
