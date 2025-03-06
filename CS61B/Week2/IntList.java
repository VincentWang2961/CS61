public class IntList {
    public int first;
    public IntList rest;

    // Create a list of integers
    // An important thing to say, the name of the class and the name of the constructor must be the same
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    // Return the size of the list using recursion
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }
    
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        L = new IntList(0, L);

        System.out.println(L.size());
    }
} 