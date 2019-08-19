import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/16 20:55
 */


public class test {
    private final int threadLocalHashCode = nextHashCode();

    private static AtomicInteger nextHashCode =
            new AtomicInteger();

    private static final int HASH_INCREMENT = 1;

    private int nextHashCode() {
        return nextHashCode.getAndAdd(HASH_INCREMENT);
    }

    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        test t3 = new test();
        test t4 = new test();



        int i = t1.threadLocalHashCode;
        System.out.println(i);
        i = t2.threadLocalHashCode;
        System.out.println(i);
        i = t3.threadLocalHashCode;
        System.out.println(i);
        i = t4.threadLocalHashCode;
        System.out.println(i);

        }
    }

