public class Lamp {
    public boolean lightStatus = false;
    private String roomName;

    public Lamp(String room) {
        roomName = room;
        System.out.println("Creating " + room + " instance");
    }

    public void printLightStatus() {
        if (lightStatus) {
            System.out.println("The lamp in the "+ roomName + " is ON");
        } else {
            System.out.println("The lamp in the "+ roomName + "  is OFF");
        }
    }
}
