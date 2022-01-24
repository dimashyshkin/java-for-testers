public class Cat extends Animal {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
