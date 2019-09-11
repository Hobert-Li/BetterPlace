package Sort;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 14:55</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class Selection<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(nums[j],nums[min])) {
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }
}
