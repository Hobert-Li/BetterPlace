/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 17:29</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _21_reOrderArray {

    private boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public void reOrderArray(int[] nums) {
        int oddCnt = 0;
        for (int x : nums) {
            if (isOdd(x)) {
                oddCnt++;
            }
        }
        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (isOdd(num))
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }

    public void reOrderArray(){

    }

    public static void main(String[] args) {
        _21_reOrderArray solution = new _21_reOrderArray();
        int[] nums = {1,2,3,4,5};
        solution.reOrderArray(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }


}
