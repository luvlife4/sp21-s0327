package deque;
public interface Deque<T> {

    public int size();
    public T get(int x);
    public void addLast(T x);
    public void addFirst(T x);
    public T removeLast();
    public T removeFirst();
    public void resetItem(int index,T x);

}

