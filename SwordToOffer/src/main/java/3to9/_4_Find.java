/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/29 14:29</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _4_Find {
    public boolean Find(int target,int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length,cols = matrix[0].length;
        int r = 0,c = cols - 1;
        while (r <= rows - 1 && c >= 0 ) {
            if (target == matrix[r][c])
                return true;
            else if (target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}
