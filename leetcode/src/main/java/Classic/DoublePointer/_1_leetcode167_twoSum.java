package Classic.DoublePointer;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 21:57
 */

public class _1_leetcode167_twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
                continue;
            }

            if (numbers[i] + numbers[j] > target) {
                j--;
                continue;
            }

            if (numbers[i] + numbers[j] == target) {
                break;
            }
        }
        return new int[]{i + 1,j + 1};
    }
}
