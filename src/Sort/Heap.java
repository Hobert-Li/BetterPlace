/**
 * <p>Description:  堆排序</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/14 21:29
 */


public class Heap<T extends Comparable<T>> {

    private T[] heap;
    private int N = 0;

    public Heap(int maxN) {
        this.heap = (T[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private boolean less(int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    protected void swap(int i, int j) {
        T t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1))
                j++;
            if (!less(k, j))
                break;
            swap(k, j);
            k = j;
        }
    }

    public void insert(Comparable v) {
        heap[++N] = (T) v;
        swim(N);
    }

    public T delMax() {
        T max = heap[1];
        swap(1,N--);
        heap[N + 1] = null;
        sink(1);
        return max;
    }

}
