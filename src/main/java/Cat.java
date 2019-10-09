import interfaces.Noise;

public class Cat extends AnimalWithFur implements Noise {

    public Cat(String furColor) {
        super(furColor);
    }

    public Cat() {
        super("brown");
    }

    public void makeSound() {
        System.out.println("Meow");
    }

}
