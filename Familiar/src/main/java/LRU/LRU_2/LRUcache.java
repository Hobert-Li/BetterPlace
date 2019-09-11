package LRU.LRU_2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 14:04
 */

public class LRUcache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUcache(int capacity) {
        super((int) (Math.ceil(capacity / 0.75) + 1), 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry entry : entrySet()) {
            sb.append(String.format("%s : %s\n", entry.getKey(), entry.getValue()));
        }

        return sb.toString();
    }
}
