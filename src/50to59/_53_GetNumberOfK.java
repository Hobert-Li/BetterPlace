/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 15:46</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _53_GetNumberOfK {

    public int GetNumberOfK(int[] nums,int K) {
        int first = binarySearch(nums,K);
        int last = binarySearch(nums, K + 1);
        return (first == nums.length || nums[first] != K) ? 0 : last - first;
    }

    private int binarySearch(int[] nums,int K) {
        int l = 0,h = nums.length;
        while (l < h) {
            int m = l + (h-l)/2;
            if (nums[m] >= K)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        _53_GetNumberOfK solution = new _53_GetNumberOfK();
        int[] nums = {1, 2, 3, 3, 3, 3, 5, 6};
        int K = 3;
        System.out.println(solution.GetNumberOfK(nums,K));
    }

}
