/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/29 14:11</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _3_duplicate {
    public boolean dubpicate(int[] nums,int length,int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0;i < length;i++) {
            while (nums[i] != i) {
                int j = nums[i];
                if (nums[i] == nums[j]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, j);
            }
        }
        return false;
    }

    private void swap(int[] nums,int i,int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        _3_duplicate solution = new _3_duplicate();
        int[] nums = {2, 3, 1, 0, 2, 5};
        int length = nums.length;
        int[] duplication = new int[1];
        System.out.println(solution.dubpicate(nums,length,duplication));
        System.out.println(duplication[0]);
    }
}
