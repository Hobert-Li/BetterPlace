import java.util.ArrayList;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 16:37</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _57_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        int start = 1;
        int end = 2;
        int curSum = 3;
        while (end < sum) {
            if (curSum > sum) {
                curSum = curSum - start;
                start++;
            } else if (curSum < sum) {
                end++;
                curSum += end;
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = start;i <= end;i++) {
                    list.add(i);
                }
                ret.add(list);
                curSum = curSum - start;
                start++;
                end++;
                curSum += end;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        _57_FindContinuousSequence solution = new _57_FindContinuousSequence();
        int sum = 10000;
        System.out.println(solution.FindContinuousSequence(sum));
    }
}
