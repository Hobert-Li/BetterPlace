import java.util.ArrayList;
import java.util.Arrays;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 16:55</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _58_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int cur = array[i] + array[j];
            if (cur == sum)
                return new ArrayList<Integer>(Arrays.asList(array[i], array[j]));
            if (cur < sum)
                i++;
            else
                j--;

        }
        return new ArrayList<Integer>();
    }
}
