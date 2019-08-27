/**
 * <p>名字： 懒汉模式（线程不安全）</p>
 * <p>
 * 描述： 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，
 * 虽然节约了资源，但第一次加载时需要实例化，
 * 反映稍慢一些，而且在多线程不能正常工作。
 * </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 12:20
 */

public class _2_ {
    private static _2_ instance;

    private _2_() {
    }

    public static _2_ getInstance() {
        if (instance == null) {
            instance = new _2_();
        }
        return instance;
    }
}
