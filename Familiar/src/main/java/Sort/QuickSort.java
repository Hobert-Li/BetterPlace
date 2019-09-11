package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 16:15</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class QuickSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        //shuffle(nums);
        sort(nums,0,nums.length - 1);
    }

//    private void shuffle(T[] nums) {
//        List<Comparable> list = (List<Comparable>) Arrays.asList(nums);
//        Collections.shuffle(list);
//        list.toArray();
//    }

    protected void sort(T[] nums, int l, int h) {
        if (h <= l) {
            return;
        }

        int j = partition(nums, l, h);
        sort(nums, l, j - 1);
        sort(nums, j, h);
    }

    private int partition(T[] nums, int l, int h) {
        int i = l, j = h + 1;
        T v =  nums[l];
        while (true) {
            while (less(nums[++i],v) && i != h);
            while (less(v,nums[--j]) && j != l);
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    public T select(T[] nums,int k) {
        int l = 0, h = nums.length - 1;
        while (h > l) {
            int j = partition(nums, l, h);

            if (j == k) {
                return nums[k];
            } else if (j > k) {
                h = j - 1;
            } else {
                l = j + 1;
            }
        }
        return nums[k];
    }
}

class ThreeWayQuickSort<T extends Comparable<T>> extends QuickSort<T> {

    @Override
    protected void sort(T[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int lt = l, i = l + 1, gt = h;
        T v = nums[l];
        while (i <= gt) {
            int cmp = nums[i].compareTo(v);
            if (cmp < 0) {
                swap(nums, lt++, i++);
            } else if(cmp > 0) {
                swap(nums, i, gt--);
            } else {
                i++;
            }
        }
        sort(nums, l, lt - 1);
        sort(nums,gt + 1,h);
    }
}
