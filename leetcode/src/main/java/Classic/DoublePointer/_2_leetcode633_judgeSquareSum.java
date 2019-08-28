package Classic.DoublePointer;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 22:05
 */

public class _2_leetcode633_judgeSquareSum {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);//??
        while (i <= j) {
            int temp = i * i + j * j;
            if (temp == c) {
                return true;
            } else if (temp < c) {
                i++;
            } else if (temp > c) {
                j--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int c = 2;
        _2_leetcode633_judgeSquareSum solution = new _2_leetcode633_judgeSquareSum();
        System.out.println(solution.judgeSquareSum(c));
    }
}
