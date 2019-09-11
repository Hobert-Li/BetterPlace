/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 18:15</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _17_print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number,0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0;i < 10;i++) {
            number[digit] = (char) (i+'0');
            print1ToMaxOfNDigits(number,digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    public static void main(String[] args) {
        _17_print1ToMaxOfNDigits solution = new _17_print1ToMaxOfNDigits();
        solution.print1ToMaxOfNDigits(5);
    }
}
