/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 14:54</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _51_InversePairs {
    private long cnt = 0;
    private int[] tmp;

    public int InversePairs(int[] nums) {
        tmp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return (int) (cnt % 1000000007);
    }

    private void mergeSort(int[] nums,int l,int h) {
        if (h - l < 1)
            return;
        int m = l + (h - l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,h);
        merge(nums,l,m,h);
    }

    private void merge(int[] nums,int l ,int m, int h) {
        int i = l;
        int j = m + 1;
        int k = l;
        while (i <= m || j <= h) {
            if     (i > m)            tmp[k] = nums[j++];
            else if(j > h)            tmp[k] = nums[i++];
            else if(nums[i] <= nums[j]) tmp[k] = nums[i++];
            else if(nums[i] >  nums[j]) {
                                      tmp[k] = nums[j++];
                                      this.cnt = this.cnt + m - i +1;
            }
            k++;
        }
        for (int a = l;a <= h;a++) {
            nums[a] = tmp[a];
        }
    }

    public static void main(String[] args) {
        _51_InversePairs solution = new _51_InversePairs();
        int[] nums = {1,2,3,4,5,6,7,0};
        System.out.println(solution.InversePairs(nums));
    }
}
