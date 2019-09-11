/**
 * <p>Description:  从 1 到 n 整数中 1 出现的次数</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/16 18:26
 */
//????
public class _43_NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m=m*10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
