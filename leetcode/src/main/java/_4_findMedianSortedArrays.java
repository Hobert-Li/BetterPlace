import java.util.PriorityQueue;

/**
 * <p>题目名字： 4.寻找两个有序数组的中位数</p>
 * <p>题目描述： 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/20 16:30
 */

public class _4_findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> right = new PriorityQueue<>();//小顶堆
        PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);//大顶堆

        boolean isRight = true;
        for (int i = 0; i < nums1.length; i++) {
            if (isRight) {
                left.add(nums1[i]);
                right.add(left.poll());
                isRight = !isRight;
            } else {
                right.add(nums1[i]);
                left.add(right.poll());
                isRight = !isRight;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (isRight) {
                left.add(nums2[i]);
                right.add(left.poll());
                isRight = !isRight;
            } else {
                right.add(nums2[i]);
                left.add(right.poll());
                isRight = !isRight;
            }
        }

        int length = nums1.length + nums2.length;
        if (length % 2 != 0 ) {
            return right.peek();
        } else {
            return ((double) (left.peek() + (double) right.peek()))/2;
        }
    }

    public static void main(String[] args) {
        _4_findMedianSortedArrays solution = new _4_findMedianSortedArrays();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double ret = solution.findMedianSortedArrays(nums1,nums2);
        System.out.println(ret);
    }
}
