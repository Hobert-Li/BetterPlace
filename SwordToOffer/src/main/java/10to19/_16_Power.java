/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 18:04</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _16_Power {
    public double Power(double base,int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;

        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }

        double pow = Power(base * base,exponent/2);
        if (exponent % 2 != 0)
            pow = pow * base;

        return isNegative ? 1/pow : pow;
    }

    public static void main(String[] args) {
        _16_Power solution = new _16_Power();
        double base = 5.2;
        int exponent = 9;
        System.out.println(solution.Power(base,exponent));
    }
}
