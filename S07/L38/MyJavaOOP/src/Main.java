public class Main {
    public static void main(String[] args) {
        /*ClassDemo instance = new ClassDemo();
        instance.printNumber();

        ClassDemo instance2 = new ClassDemo();
        instance2.printNumber();*/

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp bedroomLamp = new Lamp("Bedroom");

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();

        kitchenLamp.lightStatus = true;

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();


    }
}
