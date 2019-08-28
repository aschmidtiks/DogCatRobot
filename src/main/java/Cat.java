import interfaces.AnimalSoundInterface;

public class Cat extends AnimalWithFur implements AnimalSoundInterface {

    public Cat(String furColor) {
        super(furColor);
    }

    public Cat() {
        super("brown");
    }

    public void animalSound() {
        System.out.println("Meow");
    }

    void poop() {
        System.out.println("I pooped");
    }
}
