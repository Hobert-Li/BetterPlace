/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/29 14:51</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _5_replaceSpace {
    public String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0;i <= p1; i++) {
            if (str.charAt(i)==' ') {
                str.append("  ");
            }
        }

        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 >p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            } else {
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        _5_replaceSpace solution = new _5_replaceSpace();
        StringBuffer str = new StringBuffer("a B c");
        System.out.println(solution.replaceSpace(str));
    }
}
