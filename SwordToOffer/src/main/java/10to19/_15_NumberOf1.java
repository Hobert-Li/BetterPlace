/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 18:00</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _15_NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n&(n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 010110100;
        _15_NumberOf1 solution = new _15_NumberOf1();
        System.out.println(solution.NumberOf1(n));
    }
}
