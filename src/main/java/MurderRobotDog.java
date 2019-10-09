import interfaces.Noise;

public class MurderRobotDog extends MurderRobot implements Noise {
        public void kill() {
        System.out.println("Robodog is killing");
    }

        public void makeSound() {
        System.out.println("Robotic Wuff");
    }
}
