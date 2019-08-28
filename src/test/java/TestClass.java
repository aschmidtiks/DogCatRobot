import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClass {

    Dog dog1;
    Dog dog2;
    Cat cat1;
    Cat cat2;
    CleaningRobot cleaningCleaningRobot;
    MurderRobot murderRobot;
    MurderRobotDog murderRobotDog;

    @BeforeEach
    public void testSetup() {
        dog1 = new Dog("Brown");
        dog2 = new Dog("Brown");

        cat1 = new Cat("Black");
        cat2 = new Cat("Black");

        cleaningCleaningRobot = new CleaningRobot();

        murderRobot = new MurderRobot();

        murderRobotDog = new MurderRobotDog();
    }

    @Test
    public void testAufgabe101() {
        System.out.println("------------------------------------Aufgabe1-Anfang-----------------------------------------");
        dog1.animalSound();
        dog2.animalSound();
        System.out.println("------------------------------------Aufgabe1-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe102() {
        System.out.println("------------------------------------Aufgabe2-Anfang-----------------------------------------");
        cat1.animalSound();
        cat2.animalSound();
        System.out.println("------------------------------------Aufgabe2-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe103() {
        System.out.println("------------------------------------Aufgabe3-Anfang-----------------------------------------");
        cat1.animalSound();
        cat1.poop();
        dog1.animalSound();
        dog1.poop();
        System.out.println("------------------------------------Aufgabe3-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe104() {
        System.out.println("------------------------------------Aufgabe4-Anfang-----------------------------------------");
        cleaningCleaningRobot.drive();
        cleaningCleaningRobot.clean();
        System.out.println("------------------------------------Aufgabe4-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe105() {
        System.out.println("------------------------------------Aufgabe5-Anfang-----------------------------------------");
        murderRobot.drive();
        murderRobot.kill();
        System.out.println("------------------------------------Aufgabe5-Ende-----------------------------------------");
    }


    @Test
    public void testAufgabe106() {
        System.out.println("------------------------------------Aufgabe6-Anfang-----------------------------------------");
        murderRobotDog.kill();
        murderRobotDog.drive();
        murderRobotDog.animalSound();
        System.out.println("------------------------------------Aufgabe6-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe107() {
        System.out.println("------------------------------------Aufgabe7-Anfang-----------------------------------------");
        dog1.poop();
        cat1.poop();
        murderRobot.kill();
        murderRobotDog.kill();
        System.out.println("------------------------------------Aufgabe7-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe108() {
        System.out.println("------------------------------------Aufgabe8-Anfang-----------------------------------------");
        System.out.println("MurderRobot erbt von Robot kann also fahren, dazu wird KillMethodInterface implementiert wodurch MurderRobot eine kill funktion erhält.\n" +
                           "MurderRobotDog erbt von MurderRobot wodurch es eine drive und kill funktion hat, die kill funktion wird allerdings überschrieben.\n" +
                           "Außerdem implementiert MurderRobotDog AnimalSoundInterface womit es eine bark methode bekommt.");
        System.out.println("------------------------------------Aufgabe8-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe109() {
        System.out.println("------------------------------------Aufgabe9-Anfang-----------------------------------------");
        System.out.println("The cats fur color is: " + cat1.getFurColor());
        System.out.println("The dogs fur color is: " + dog1.getFurColor());
        System.out.println("------------------------------------Aufgabe9-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe110() {
        System.out.println("------------------------------------Aufgabe10-Anfang-----------------------------------------");
        cat1.setFurColor("Brown");
        System.out.println("The cats fur color is: " + cat1.getFurColor());
        System.out.println("------------------------------------Aufgabe10-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe111() {
        System.out.println("------------------------------------Aufgabe11-Anfang-----------------------------------------");
        Cat cat3 = new Cat();
        System.out.println("The cats fur color is: " + cat3.getFurColor());
        System.out.println("------------------------------------Aufgabe11-Ende-----------------------------------------");
    }

    @Test
    public void testAufgabe112() {
        System.out.println("------------------------------------Aufgabe12-Anfang-----------------------------------------");
        Blackbird blackbird = new Blackbird();
        blackbird.poop();
        blackbird.fly();
        Penguin penguin = new Penguin();
        penguin.poop();
        System.out.println("------------------------------------Aufgabe12-Ende-----------------------------------------");
    }
}
