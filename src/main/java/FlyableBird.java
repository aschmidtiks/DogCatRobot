import interfaces.Flyable;

public abstract class FlyableBird extends Bird implements Flyable {
    public void fly() {
        System.out.println("I can flyyyy");
    }
}
