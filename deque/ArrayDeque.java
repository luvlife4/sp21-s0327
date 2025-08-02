package deque;


public class ArrayDeque<glorp> implements Deque<glorp>{
    public glorp[] items;
    public int size = 0;

    private void addSize() {
        glorp[] a = (glorp[]) new Object[size * 2];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    private void reduceSize() {
        glorp[] a = (glorp[]) new Object[size / 3];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
        size = items.length;
    }

    public ArrayDeque() {
        items = (glorp[]) new Object[8];
    }

    @Override
    public glorp get(int x) {
        return items[x];
    }

    @Override
    public int size() {
        return size;
    }

    public void printDeque(){
        for (int i=0;i<size;i++){
            System.out.print(items[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    @Override
    public void addFirst(glorp x) {
        if (size >= items.length && size != 0) {
            addSize();
        }
        if (items.length >= size * 3 && size > 5) {
            reduceSize();
        }
        glorp[] a = (glorp[]) new Object[size+1];
        System.arraycopy(items, 0, a, 1, size);
        a[0] = x;
        items=a;
        size++;
    }

    @Override
    public void addLast(glorp x) {
        if (size >=items.length&&size!=0) {
            addSize();
        }
        if (items.length >= size * 3&&size>5) {
            reduceSize();
        }
        items[size] = x;
        size++;
    }

    @Override
    public glorp removeFirst() {
        if(size==0){
            return null;
        }
        glorp[] a=(glorp[]) new Object[size];
        System.arraycopy(items,1,a,0,size-1);
        glorp x=items[0];
        items=a;
        size--;
        return x;
    }

    @Override
    public glorp removeLast() {
        if(size==0){
            return null;
        }
        size--;
        return items[size];
    }
    @Override
    public void resetItem(int index,glorp x){
            items[index-1]=x;
    }

}
