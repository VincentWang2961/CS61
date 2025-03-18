package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
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
        AListNoResizing<Integer> L = new AListNoResizing<>();

        int N = 500;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            } else if (operationNumber == 2) {
                // getLast
                int LL =L.getLast();
                System.out.println("getLast(" + LL + ")");
            } else if (operationNumber == 3) {
                int LR = L.removeLast();
                System.out.println("removeLast(" + LR + ")");
            }
        }
    }
}
