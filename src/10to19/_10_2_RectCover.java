/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/30 18:05</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _10_2_RectCover {
    public int RectCover(int n) {
        if (n <= 2)
            return 2;
        int pre2 = 1,pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n;i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        _10_2_RectCover solution = new _10_2_RectCover();
        System.out.println(solution.RectCover(9));
    }
}
