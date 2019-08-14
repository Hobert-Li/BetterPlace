/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 17:23</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _58_1_ReverseSentence {
    public String ReverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0,j = 0;
        while (j <= n) {
            if (j == n || chars[j] == ' ') {
                reverse(chars,i,j - 1);
                i = j + 1;
            }
            j++;
        }
        reverse(chars,0,n - 1);
        return new String(chars);
    }

    private void reverse(char[] chars,int i,int j) {
        while (i < j) {
            swap(chars,i++,j--);
        }
    }

    private void swap(char[] chars,int i,int j) {
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }

    public static void main(String[] args) {
        _58_1_ReverseSentence solution = new _58_1_ReverseSentence();
        String str = "I am a student.";
        System.out.println(solution.ReverseSentence(str));
    }

}
