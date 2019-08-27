package LRU_2;


/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 13:53
 */

public class test {
    public static void main(String[] args) {
        LRUcache c2 = new LRUcache(10);

        for (int i = 0; i < 100; i++) {
            c2.put(i, i*10);
        }
        c2.get(95);

        System.out.println(c2.toString());
    }
}
