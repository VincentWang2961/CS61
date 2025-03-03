public class Inclass {
    public static void main(String[] args) {
        Dog smalDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog bigDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smalDog;
        manyDogs[1] = bigDog;
        manyDogs[2] = new Dog(130);

        int i = 0;
        while(i < manyDogs.length) {
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
            i = i + 1;
        }
    }
}