package LRU_1;

import java.util.HashMap;

/**
 * <p>名字： 链表+HashMap实现</p>
 * <p>题目描述： </p>
 *
 * @author 李宏博
 * @create 2019/8/27 13:22
 */

public class LRUcache<K, V> {

    private class Entry<K, V> {
        Entry pre;
        Entry next;
        public K key;
        public V value;
    }

    private final int capacity;
    private Entry head;
    private Entry tail;
    private HashMap<K, Entry<K,V>> map;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        Entry entry = map.get(key);
        if (entry == null) {
            if (map.size() >= capacity) {
                map.remove(tail.key);
                removeLast();
            }
            entry = new Entry();
            entry.key = key;
        }
        entry.value = value;
        moveToFirst(entry);
        map.put(key,entry);
    }

    public V get(K key) {
        Entry<K, V> entry = map.get(key);
        if (entry == null) {
            return null;
        }
        moveToFirst(entry);
        return entry.value;
    }

    private void moveToFirst(Entry entry) {
        if (entry == head) {
            return;
        }

        if (entry.pre != null) {
            entry.pre.next = entry.next;
        }

        if (entry.next != null) {
            entry.next.pre = entry.pre;
        } else if (entry == tail && entry.next == null) {
            tail = tail.pre;
            tail.next = null;
        }

        if (head == null || tail == null) {
            head = tail = entry;
            return;
        }

        entry.next = head;
        head.pre = entry;
        head = entry;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Entry cur = head;
        while (cur != null) {
            sb.append(String.format("%s : %s\n", cur.key, cur.value));
            cur = cur.next;
        }

        return sb.toString();
    }
}
