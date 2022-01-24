public class Dog extends Animal{

    public Dog (String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Dog is sleeping ... zzzzz");
    }

    public void goodBoy() {
        System.out.println(super.name + ", come here, who is a good boy?");
    }
}
