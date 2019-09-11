package Sort;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 15:29</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class Shell<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        int h = 1;

        while (h < N/3) {
            h = h*3 + 1;
        }

        while (h >= 1) {
            for (int i = 1; i < N; i++) {
                for (int j = i; j >= h &&less(nums[j],nums[j-h]) ; j-=h) {
                    swap(nums,j,j - h);
                }
            }
            h = h / 3;
        }
    }
}
