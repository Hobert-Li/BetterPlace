package PAC.PAC_1;

/**
 * <p>名字： wait()和notify()方法的实现</p>
 * <p>描述： 这也是最简单最基础的实现，缓冲区满和为空时都调用wait()方法等待，
 * 当生产者生产了一个产品或者消费者消费了一个产品之后会唤醒所有线程。</p>
 *
 * @author 李宏博
 * @create 2019/8/27 15:00
 */

public class PAC {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        PAC pac = new PAC();
        new Thread(pac.new Producer()).start();
        new Thread(pac.new Consumer()).start();
        new Thread(pac.new Producer()).start();
        new Thread(pac.new Consumer()).start();
        new Thread(pac.new Producer()).start();
        new Thread(pac.new Consumer()).start();
        new Thread(pac.new Producer()).start();
        new Thread(pac.new Consumer()).start();
    }
    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (LOCK) {
                    while (count == FULL) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产，总量：" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (LOCK) {
                    while (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费，总量：" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }
}
