/**
 * <p>名字： 懒汉模式（线程安全）</p>
 * <p>
 *     这种写法能够在多线程中很好的工作，
 *     但是每次调用getInstance方法时都需要进行同步,
 *     造成不必要的同步开销,
 *     而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 * </p>
 *
 * @author 李宏博
 * @create 2019/8/27 12:21
 */

public class _3_ {
    private static _3_ instance;

    private _3_() {

    }

    public static synchronized _3_ getInstance() {
        if (instance == null) {
            instance = new _3_();
        }
        return instance;
    }
}
