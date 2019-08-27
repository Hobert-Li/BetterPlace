package PAC_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>名字： 可重入锁ReentrantLock的实现</p>
 * <p>描述： 已经获取锁的线程进入其他需要相同锁的同步代码块不会被阻塞。</p>
 *
 * @author 李宏博
 * @create 2019/8/27 15:14
 */

public class PAC {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    private Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

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

    private class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                lock.lock();
                try {
                    while (count == FULL) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产，总量：" + count);
                    notEmpty.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }


    private class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                lock.lock();
                try {
                    while (count == 0) {
                        try {
                            notEmpty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费，总量：" + count);
                    notFull.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
