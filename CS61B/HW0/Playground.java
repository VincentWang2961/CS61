public class Playground {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x > y) {
            System.out.println("X is bigger than Y!");
        } else if (x < y) {
            System.out.println("X is smaller than Y!");
        } else if (x == y) {
            System.out.println("X is equal to Y!");
        } else {
            System.out.println("Error!");
        }
    }
}