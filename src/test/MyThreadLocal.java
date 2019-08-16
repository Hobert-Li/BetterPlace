/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/16 17:56
 */


public class MyThreadLocal {

    private static final ThreadLocal<Object> THREAD_LOCAL = new ThreadLocal<Object>() {
        @Override
        protected Object initialValue() {
            System.out.println("[线程" + Thread.currentThread().getName() + "]调用get方法时，当前线程共享变量没值，调用initialValue获取默认值！");
            return null;
        }
    };

    public static void main(String[] args) {
        new Thread(new MyIntegerTask("IntegerTask1")).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new MyIntegerTask("IntegerTask2")).start();
    }

    private static class MyIntegerTask implements Runnable {
        private String name;

        public MyIntegerTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {

                if (null == MyThreadLocal.THREAD_LOCAL.get()) {
                    MyThreadLocal.THREAD_LOCAL.set(0);
                    System.out.println("i=" + i + "[线程" + name + "]当前线程不存在缓存,set 0");
                } else {
                    int num = (int) MyThreadLocal.THREAD_LOCAL.get();
                    MyThreadLocal.THREAD_LOCAL.set(num + 1);
                    System.out.println("i=" + i + "[线程" + name + "]往threadLocal中set: " + MyThreadLocal.THREAD_LOCAL.get());


                    if (i == 3) {
                        System.out.println("i=" + i + "[线程" + name + "]，threadLocal移除当前线程");
                        MyThreadLocal.THREAD_LOCAL.remove();
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
