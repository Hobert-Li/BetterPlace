/**
 * <p>名字： 静态内部类单例模式</p>
 * <p>描述：
 * 第一次加载Singleton类时并不会初始化sInstance，
 * 只有第一次调用getInstance方法时虚拟机加载SingletonHolder并初始化sInstance,
 * 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 * </p>
 *
 * @author 李宏博
 * @create 2019/8/27 12:33
 */

public class _5_ {
    private _5_() {
    }

    public static _5_ getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final _5_ sInstance = new _5_();
    }
}
