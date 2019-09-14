package Classic._4_BinarySearch;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/12 12:32
 */


public class _2_leetcode744_nextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (letters[m] <= target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l < letters.length ? letters[l] : letters[0];
    }

    public static void main(String[] args) {
        _2_leetcode744_nextGreatestLetter solution = new _2_leetcode744_nextGreatestLetter();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(solution.nextGreatestLetter(letters, target));
    }
}
