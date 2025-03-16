public class AList<DataType> {
    private DataType [] items;
    private int size;

    public AList() {
        items = (DataType[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        // Generic array creation is not allowed in Java
        DataType[] a = (DataType[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addLast(DataType x) {
        if (size == items.length) {
            resize(size * 2);
        }

        items[size] = x;
        size += 1;
    }

    public DataType getLast() {
        return items[size - 1];
    }

    public DataType get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public DataType removeLast() {
        DataType x = getLast();
        // Set the last element to null to destroy the reference
        items[size - 1] = null;
        size -= 1;
        return x;
    }
}