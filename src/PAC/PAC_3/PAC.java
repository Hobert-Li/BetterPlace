package PAC_3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p>名字： 阻塞队列BlockingQueue的实现</p>
 * <p>描述：
 * </p>
 *
 * @author 李宏博
 * @create 2019/8/27 15:27
 */

public class PAC {
    private static Integer count = 0;
    private final Integer FULL = 10;
    final BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

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
                if (count > FULL) {
                    i--;
                    continue;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    blockingQueue.put(1);
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产，计数器：" + count
                            + "，队中数量：" + blockingQueue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (count < 0) {
                    i--;
                    continue;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    blockingQueue.take();
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费，计数器：" + count +
                            "，队中数量：" + blockingQueue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
