import java.util.BitSet;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/26 17:16</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _50_FirstNotRepeatingChar {

    public static int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[256];
        for (int i = 0;i < str.length();i++) {
            cnts[str.charAt(i)]++;
        }

        for (int i = 0;i < str.length();i++) {
            if (cnts[str.charAt(i)]==1) {
                return i;
            }
        }

        return -1;
    }

    public static int FirstNotRepeatingChar2(String str) {
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for (char c : str.toCharArray()) {
            if (!bs1.get(c) && !bs2.get(c)) {
                bs1.set(c);
            }
            else if (bs1.get(c) && !bs2.get(c)) {
                bs2.set(c);
            }
        }

        for (int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if (bs1.get(c) && !bs2.get(c)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abacfdabacfdabacfzd"));
        System.out.println(FirstNotRepeatingChar2("abacfdabacfdabacfzd"));
    }
}
