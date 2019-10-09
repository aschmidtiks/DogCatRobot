import interfaces.Noise;

public class Dog extends AnimalWithFur implements Noise {

    public Dog(String furColor) {
        super(furColor);
    }

    public Dog() {

    }

    public void makeSound() {
        System.out.println("Wuff");
    }

    public void poop() {
        System.out.println("bad dog pooped");
    }
}
