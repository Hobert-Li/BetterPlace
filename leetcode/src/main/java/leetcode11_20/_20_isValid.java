package leetcode11_20;

import java.util.HashMap;
import java.util.Stack;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 20. 有效的括号</p>
 * <p>题目描述： 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * </p>
 *
 * <p>
 * 示例：
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/10/31 17:33
 */
public class _20_isValid {
    HashMap<Character, Character> dict = new HashMap<>();
    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        dict.put('(', ')');
        dict.put('[', ']');
        dict.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || dict.get(stack.peek()) == null ||s.charAt(i) != dict.get(stack.peek())) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == dict.get(stack.peek())) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        _20_isValid solution = new _20_isValid();
        String s = "([)]";
        System.out.println(solution.isValid(s));
    }
}
