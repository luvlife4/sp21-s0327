package deque;

import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayDequeTest {
    @Test
    public void addEmptySizeLastTest() {
        ArrayDeque<String> l1 = new ArrayDeque<String>();
        assertTrue("A newly initialized LLDeque should be empty", l1.isEmpty());
        l1.addLast("front");
        l1.addLast("middle");
        l1.addLast("last");
        assertEquals("addLast Wrong", 3, l1.size);
    }

    @Test
    public void addEmptySizeFirstTest() {
        ArrayDeque<String> l1 = new ArrayDeque<String>();
        assertTrue("A newly initialized LLDeque should be empty", l1.isEmpty());
        l1.addFirst("last");
        assertEquals(1, l1.size());
        l1.addFirst("middle");
        assertEquals(2, l1.size());
        l1.addFirst("first");
        assertEquals(3, l1.size());
        l1.removeFirst();
        assertEquals(2, l1.size());
    }

    @Test
    /* Check if you can create LinkedListDeques with different parameterized types*/
    public void multipleParamTest() {


        ArrayDeque<String> lld1 = new ArrayDeque<>();
        ArrayDeque<Double> lld2 = new ArrayDeque<>();
        ArrayDeque<Boolean> lld3 = new ArrayDeque<>();

        lld1.addFirst("string");
        lld2.addFirst(3.14159);
        lld3.addFirst(true);

        String s = lld1.removeFirst();
        double d = lld2.removeFirst();
        boolean b = lld3.removeFirst();

    }
    @Test
    /* check if null is return when removing from an empty ArrayDeque. */
    public void emptyNullReturnTest() {
        ArrayDeque<Integer> lld1 = new ArrayDeque<>();

        boolean passed1 = false;
        boolean passed2 = false;
        assertEquals("Should return null when removeFirst is called on an empty Deque,", null, lld1.removeFirst());
        assertEquals("Should return null when removeLast is called on an empty Deque,", null, lld1.removeLast());

    }
}
