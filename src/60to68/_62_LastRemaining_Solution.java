/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 18:12</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _62_LastRemaining_Solution {
    public int LastRemaining_Solution(int n,int m) {
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        return (LastRemaining_Solution(n-1,m) + m) % n;
    }

    public static void main(String[] args) {
        _62_LastRemaining_Solution solution = new _62_LastRemaining_Solution();
        int n = 10;
        int m = 5;
        System.out.println(solution.LastRemaining_Solution(n,m));
    }
}
