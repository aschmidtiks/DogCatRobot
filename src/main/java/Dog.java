import interfaces.AnimalSoundInterface;

public class Dog extends AnimalWithFur implements AnimalSoundInterface {

    public Dog(String furColor) {
        super(furColor);
    }

    public void animalSound() {
        System.out.println("Wuff");
    }

    public void poop() {
        System.out.println("bad dog pooped");
    }
}
