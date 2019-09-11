/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/30 17:56</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _10_1_Fibonacci {
    private int[] fib = new int[40];

    public _10_1_Fibonacci() {
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2;i < fib.length;i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    public int Fibonacci(int n) {
        return fib[n];
    }

    public static void main(String[] args) {
        _10_1_Fibonacci solution = new _10_1_Fibonacci();
        System.out.println(solution.Fibonacci(10));
    }
}
