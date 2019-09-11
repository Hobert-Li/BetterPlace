/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 17:22</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _20_isNumeric {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }

        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}
