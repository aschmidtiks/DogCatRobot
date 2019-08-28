import interfaces.FlyableAnimalInterface;

public class Blackbird extends LandBird implements FlyableAnimalInterface {
    void poop() {
        System.out.println("Blackbird pooped from above");
    }

    public void fly() {
        System.out.println("Fly blackbird fly");
    }
}
