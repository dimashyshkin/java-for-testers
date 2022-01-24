public class Main {
    public static void main(String[] args) {
        // Create 3 classes: Car, Sedan, Coupe
        // Create relationships between these classes, which class extends which
        // Create variables like: make, model, miles, price, doors
        // Create method drive, it should increase miles by given number and print something to the console
        // Each class should have constructor, that accepts some or all of the above parameters
        // Create forSale method, that set the new price and will print general car info
        // In main method, create two objects: Toyota Corolla and Chevrolet Camaro
        // Drive those cars for some time, set new price and then list them for sale

        Sedan corolla = new Sedan("Toyota", "Corolla", 0, 20000);
        Coupe camaro = new Coupe("Chevrolet", "Camaro", 15000, 35000);

        corolla.drive(12000);
        camaro.drive(5000);

        corolla.forSale(18000);
        camaro.forSale(30000);

    }
}
