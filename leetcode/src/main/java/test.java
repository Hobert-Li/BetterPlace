/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/21 16:59
 */

public class test {
    public static void main(String[] args) {

        char i = 'A';
        try {
            int tStart = Integer.valueOf(""+i);
            System.out.println(tStart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
