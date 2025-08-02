package deque;

public class LinkedListDeque<just_stay> {


    //    内部类，定义了节点
    public static class node<just_stay> {
        just_stay item;
        node<just_stay> next;
        node<just_stay> prev;

        //节点构造函数
        public node(just_stay x, node<just_stay> Next, node<just_stay> Prev) {
            this.item = x;
            this.next = Next;
            this.prev = Prev;
        }
    }

    //定义了头节点尾节点和大小，这是一个class应该有的基本元素
    public node<just_stay> theHead;
    public node<just_stay> theTail;
    int size;

    //初始化了一个列表,列表构造函数
    public LinkedListDeque() {
        just_stay x = null;
        this.theHead = new node<just_stay>(x,null,null);
        this.theTail = new node<just_stay>(x,null,null);
        theHead.prev = theTail;  // 头哨兵的prev指向尾哨兵
        theHead.next = theTail;  // 头哨兵的next指向尾哨兵（空队列时）
        theTail.next = theHead;  // 尾哨兵的next指向头哨兵
        theTail.prev = theHead;
        this.size = 0;
    }

    //取出一个元素
    public just_stay get(int x) {
        node<just_stay> pointer = null;
        pointer.next = theHead;
        for (int i = 0; i <= x; i++) {
            pointer = pointer.next;
        }
        return pointer.item;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printDeque() {
        node<just_stay> pointer = theHead.next;
        for (int i = 0; i < this.size; i++) {
            System.out.print(pointer.item);
            System.out.print(" ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void addFirst(just_stay x) {
        node<just_stay> theNewOne = new node(x, theHead.next, theHead);
        theHead.next.prev = theNewOne;
        theHead.next = theNewOne;
        size += 1;
    }

    public void addLast(just_stay x) {
        node<just_stay> theNewOne = new node(x, theTail, theTail.prev);
        theTail.prev.next = theNewOne;
        theTail.prev = theNewOne;
        size ++;
    }

    public just_stay removeFirst() {
        just_stay x = theHead.next.item;
        theHead.next = theHead.next.next;
        theHead.next.next.prev = theHead.next.next.prev.prev;
        if (size > 0) {
            size--;
            return x;
        }
        return null;
    }

    public just_stay removeLast() {
        just_stay x = theTail.prev.item;
        theTail.prev = theTail.prev.prev;
        theTail.prev.prev.next = theTail;
        if (size > 0) {
            size--;
            return x;
        }
        return null;
    }

}
