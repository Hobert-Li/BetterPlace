/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 17:11</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _58_2_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (n >= str.length())
            return str;
        char[] chars = str.toCharArray();
        reverse(chars,0,n-1);
        reverse(chars,n,chars.length-1);
        reverse(chars,0,chars.length-1);
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
        _58_2_LeftRotateString solution = new _58_2_LeftRotateString();
        String str = "1231231313";
        int n = 4;
        System.out.println(solution.LeftRotateString(str,n));
    }
}
