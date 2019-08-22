package leetcode11_20;

/**
 * <p>题目名字： 11. 盛最多水的容器</p>
 * <p>题目描述： 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 * <p>示例：
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49</p>
 *
 * @author 李宏博
 * @create 2019/8/22 13:22
 */

public class _11_maxArea {
    public int maxArea(int[] height) {

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int l = j - i;
                int area = l * h;
                result = Math.max(result, area);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        _11_maxArea solution = new _11_maxArea();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println(result);
    }
}
