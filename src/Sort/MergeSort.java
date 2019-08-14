/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 15:35</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public abstract class MergeSort<T extends Comparable<T>> extends Sort<T> {

    protected T[] aux;


    protected void merge(T[] nums,int l,int m,int h) {
        int i = l, j = m + 1;

        for (int k = l; k <= h; k++) {
            aux[k] = nums[k];
        }

        for (int k = 0; k <= h ; k++) {
            if (i > m) {
                nums[k] = aux[j++];
            } else if (j > h) {
                nums[k] = aux[i++];
            } else if (aux[i].compareTo(aux[j]) <= 0) {
                nums[k] = aux[i++];
            } else {
                nums[k] = aux[j++];
            }
        }
    }
}

class Up2DownMergeSort<T extends Comparable<T>> extends MergeSort<T> {

    @Override
    public void sort(T[] nums) {
        aux = (T[]) new Comparable[nums.length];
        sort(nums,0,nums.length-1);
    }

    private void sort(T[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int mid = l + (h - l)/2;
        sort(nums, l, mid);
        sort(nums, mid + 1,h);
        merge(nums,l,mid,h);
    }
}

class Down2UpMergeSort<T extends Comparable<T>> extends MergeSort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        aux = (T[]) new Comparable[N];

        for (int sz = 1; sz < N; sz+=sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(nums,lo,lo + sz - 1,Math.min(lo + sz + sz - 1,N - 1));
            }
        }
    }
}
