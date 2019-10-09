import interfaces.Driveable;

public abstract class Robot implements Driveable {
    public void drive(){
        System.out.println("Driving around");
    }
}
