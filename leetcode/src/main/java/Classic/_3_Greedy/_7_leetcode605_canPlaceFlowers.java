package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 16:03
 */


public class _7_leetcode605_canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int n1 = n;
        int n2 = n;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1 >= 0 ? i - 1 : i] == 0 && flowerbed[i + 1 < flowerbed.length ? i + 1 : i] == 0) {
                n--;
                i++;
            } else if (flowerbed[i] == 1) {
                i++;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        _7_leetcode605_canPlaceFlowers solution = new _7_leetcode605_canPlaceFlowers();
        int[] flowerbed = {0,1,0,1,0,1,0,0};
        int n = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }
}
