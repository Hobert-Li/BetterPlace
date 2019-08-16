import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/15 17:57
 */


public class _40_GetLeastNumbers {

    /**
     * 快排思想
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] nums, int k) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (k > nums.length || k <= 0)
            return ret;
        findKthSmallest(nums, k - 1);
        for (int i = 0; i < k; i++) {
            ret.add(nums[i]);
        }
        return ret;
    }

    private void findKthSmallest(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k)
                break;
            if (j > k)
                h = j - 1;
            else l = j + 1;
        }
    }

    private int partition(int[] nums, int l, int h) {
        int p = nums[l];
        int i = l, j = h + 1;
        while (true) {
            while (i != h && nums[++i] < p);
            while (j != l && nums[--j] > p);
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    /**
     * 堆排思想
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] nums, int k) {
        if (k > nums.length || k <= 0) {
            return new ArrayList<Integer>();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {

    }
}
