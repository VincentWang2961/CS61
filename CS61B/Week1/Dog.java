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

    // Compare with two dogs by two parameters
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weight > d2.weight) {
            return d1;
        }
        return d2;
    }

    // Self compare with another dog
    public Dog maxDog(Dog d2) {
        if (this.weight > d2.weight) {
            return this;
        }
        return d2;
    }
}