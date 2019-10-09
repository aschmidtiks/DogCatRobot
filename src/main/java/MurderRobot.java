import interfaces.Killer;

public class MurderRobot extends Robot implements Killer {
    public void kill() {
        System.out.println("I kill you");
    }
}
