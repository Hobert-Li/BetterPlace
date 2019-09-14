package Classic._4_BinarySearch;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/12 11:27
 */


public class _1_leetcode69_mySqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 0;
        int h = x;
        while (l <= h) {
            int m = l + (h - l)/2;
            int t = x / m;
            if (t == m) {
                return m;
            } else if (t < m) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        _1_leetcode69_mySqrt solution = new _1_leetcode69_mySqrt();
        System.out.println(solution.mySqrt(8));
    }
}
