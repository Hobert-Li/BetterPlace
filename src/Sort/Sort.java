/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/11 14:47</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    protected boolean less(T v,T w) {
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a,int i,int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
