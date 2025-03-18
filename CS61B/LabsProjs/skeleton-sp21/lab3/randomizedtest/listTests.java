package randomizedtest;

import static org.junit.Assert.*;
import org.junit.Test;

public class listTests {
    @Test
    public void testThreeAddThreeRemove() {
        // Init both lists
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();

        // Add 3 items to each list
        L.addLast(4);
        B.addLast(4);
        L.addLast(5);
        B.addLast(5);
        L.addLast(6);
        B.addLast(6);
        assertEquals(L.getLast(), B.getLast());
        assertEquals(L.size(), B.size());

        // Remove 3 items from each list
        assertEquals(L.removeLast(), B.removeLast());
        assertEquals(L.removeLast(), B.removeLast());
        assertEquals(L.removeLast(), B.removeLast());
    }

    @Test
    public void randomizedTest() {

    }
}
