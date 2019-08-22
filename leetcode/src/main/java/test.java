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
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        thread.start();
        thread.start();

        try {
            Thread.currentThread().wait(3000);
        } catch (InterruptedException e) {
            System.out.println("出错");
        }
    }
}
