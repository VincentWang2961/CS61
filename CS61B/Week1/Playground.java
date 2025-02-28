public class Playground {

    public static void main(String[] args) {

        // Can use two diff ways
        Dog smallDog = new Dog(5);

        Dog bigDog = new Dog(10);
        //bigDog.weight = 10;

        smallDog.makeNoise();

        // Two diff ways to call a method, but the result the same
        Dog bigger1 = Dog.maxDog(smallDog, bigDog);
        bigger1.makeNoise();
        Dog bigger2 = smallDog.maxDog(bigDog);
        bigger2.makeNoise();

        System.out.println("Finished...");
    }
}