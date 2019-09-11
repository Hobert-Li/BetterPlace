/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 10:00</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _10_3_JumpFloor {
    public int JumpFloor(int n) {
        if (n <= 2) {
            return n;
        }
        int pre2 = 1,pre1 = 2;
        int result = 0;
        for (int i = 2;i < n;i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
