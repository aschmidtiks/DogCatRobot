import interfaces.AnimalSoundInterface;

public class MurderRobotDog extends MurderRobot implements AnimalSoundInterface {
        public void kill() {
        System.out.println("Robodog is killing");
    }

        public void animalSound() {
        System.out.println("Robotic Wuff");
    }
}
