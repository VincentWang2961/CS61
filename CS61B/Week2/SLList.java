public class SLList {
    private IntNode first;
    private int size;

    // Create an empty list of integers
    public SLList() {
        first = null;
        size = 0;
    }

    // Create a list of integers using the IntNode class
    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size = size + 1;
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x ) {
        size += 1;
        
        if (first == null) {
            first = new IntNode(x, null);
            return;
        }

        // Create a pointer to the first element of the list
        IntNode p = first;
        // Move p until it reaches the end of the list
        while (p.next != null) {
            p = p.next;
        }
        // Add the new element to the end of the list
        p.next = new IntNode(x, null);
    }

    /*
    public int sizeOld() {
        IntNode p = first;
        int size = 0;

        while (p != null) {
            size = size + 1;
            p = p.next;
        }

        return size;
    }
    

    // Return the size of the list using recursion
    // This is a helper method
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }
    */

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L = new SLList(10);
        L = new SLList(5);

        System.out.println(L.getFirst());

        L.addFirst(20);
        L.addLast(30);
        System.out.println(L.getFirst());
        System.out.println(L.size());

        SLList s1 = new SLList();
        s1.addLast(5);
        s1.addLast(10);
        System.out.println(s1.size());
    }
}