public class Dog {

    public int weight;

    public Dog(int initWeight) {
        weight = initWeight;
    }

    public void makeNoise() {
        if (weight < 10) {
            System.out.println("bark!");
        } else {
            System.out.println("woof!");
        }
    }
}