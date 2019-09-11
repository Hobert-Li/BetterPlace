/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/8 17:14</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _33_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return VerifySquenceOfBST(sequence,0,sequence.length - 1);
    }

    private boolean VerifySquenceOfBST(int[] sequence, int first, int last) {
        if (last - first <= 1)
            return true;
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;
        for (int i = cutIndex; i < last; i++) {
            if (sequence[i] < rootVal)
                return false;
        }
        return VerifySquenceOfBST(sequence, first, cutIndex - 1) && VerifySquenceOfBST(sequence, cutIndex, last - 1);
    }

    public static void main(String[] args) {
        _33_VerifySquenceOfBST solution = new _33_VerifySquenceOfBST();
        //int[] sequence = {3,7,5,9,12,10,8}; true
        int[] sequence = {4,8,5,9,18,15,10};

        System.out.println(solution.VerifySquenceOfBST(sequence));
    }
}
