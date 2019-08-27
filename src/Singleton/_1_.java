/**
 * <p>名字： 饿汉模式</p>
 * <p>描述： 这种方式在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快。
 * 这种方式基于类加载机制避免了多线程的同步问题，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化instance显然没有达到懒加载的效果。</p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 12:13
 */

public class _1_ {

    private static _1_ instance = new _1_();

    private _1_(){
    }

    public static _1_ getInstance() {
        return instance;
    }
}
