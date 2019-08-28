import interfaces.KillMethodInterface;

public class MurderRobot extends Robot implements KillMethodInterface {
    public void kill() {
        System.out.println("I kill you");
    }
}
