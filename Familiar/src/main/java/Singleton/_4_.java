package Singleton;

/**
 * <p>名字： 双重检查模式 （DCL）</p>
 * <p>描述：
 * 在这里使用volatile会或多或少的影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。
 * DCL优点是资源利用率高，第一次执行getInstance时单例对象才被实例化，效率高。
 * 缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，虽然发生的概率很小。
 * DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效，
 * 在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
 * </p>
 * @author 李宏博
 * @create 2019/8/27 12:28
 */

public class _4_ {
    private volatile static _4_ instance;

    private _4_() {
    }

    public static _4_ getInstance() {
        if (instance == null) {
            synchronized (_4_.class) {
                if (instance == null) {
                    instance = new _4_();
                }
            }
        }
        return instance;
    }
}
