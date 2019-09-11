/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 16:26</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _56_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] nums,int[] num1,int[] num2) {
        int diff = 0;
        for (int num : nums)
            diff ^= num;
        diff &= -diff;
        for (int num : nums) {
            if ((num & diff)==0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }
}
