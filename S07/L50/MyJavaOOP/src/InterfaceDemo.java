public class InterfaceDemo implements A, B {
    @Override
    public void printMessage() {
        System.out.println("Implemented interface A");
    }

    @Override
    public void printNewMessage() {
        System.out.println("Implemented interface B");
    }
}
