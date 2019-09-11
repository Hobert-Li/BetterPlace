package Sort;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 15:01</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class Bubble<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean isSorted = false;
        for (int i = N - 1; i > 0&& !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j+1],nums[j])) {
                    isSorted = false;
                    swap(nums,j,j + 1);
                }
            }
        }
    }
}
