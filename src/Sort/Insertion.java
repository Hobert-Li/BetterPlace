/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 15:23</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class Insertion<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j],nums[j-1]); j--) {
                swap(nums,j,j - 1);
            }
        }
    }
}
