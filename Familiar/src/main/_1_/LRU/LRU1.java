package LRU;

import java.util.HashMap;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/10 14:05
 */


public class LRU1<K, V> {

    private class Entry<K, V> {
        Entry pre;
        Entry next;
        K key;
        V val;
    }

    private int capacity;
    private Entry head;
    private Entry tail;
    private HashMap<K, Entry<K, V>> map = new HashMap<>();

    public LRU1() {
        capacity = 10;
    }

    public LRU1(int capacity) {
        this.capacity = capacity;
    }

    public void put(K key, V val) {
        Entry e = map.get(key);
        if (e == null) {
            if (map.size() >= capacity) {
                map.remove(tail.key);
                removeLast();
            }
            e = new Entry();
            e.key = key;
        }
        e.val = val;
        moveToFirst(e);
        map.put(key, e);
    }

    public V get(K key) {
        Entry<K, V> e = map.get(key);
        if (e == null) {
            return null;
        }
        moveToFirst(e);
        return e.val;
    }

    private void moveToFirst(Entry e) {
        if (e == head) {
            return;
        }

        if (e.pre != null) {
            e.pre.next = e.next;
        }

        if (e.next != null) {
            e.next.pre = e.pre;
        } else if (e == tail && e.next == null) {
            tail = tail.pre;
            tail.next = null;
        }

        if (head == null || tail == null) {
            head = tail = e;
            return;
        }

        e.next = head;
        head.pre = e;
        head = e;
        head.pre = null;
    }

    private void removeLast() {
        if (tail != null) {
            tail = tail.pre;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
        }
    }

}
