public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "American shorthair");
        cat.setName("Simba");

        System.out.println("We have a " + cat.getBreed() + " cat named " + cat.getName());

        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();


    }
}
