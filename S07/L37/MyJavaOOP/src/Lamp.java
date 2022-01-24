public class Lamp {
    public boolean lightStatus = false;

    public void printLightStatus() {
        if (lightStatus) {
            System.out.println("The lamp is ON");
        } else {
            System.out.println("The lamp is OFF");
        }
    }
}
