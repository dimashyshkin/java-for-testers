public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloDmitry();
        printHello("Olga");
        printHello("Roman");
        getSum(5, 5);
        getSum(1, 2);
        getSum(3.5, 4.5);
        getSum(3, 4, 5);
        printAge("Dmitry", 33);
        printAge("Roman", 3);
    }

    private static void helloWorld () {
        System.out.println("Hello, world!");
    }

    private static void helloDmitry () {
        System.out.println("Hello, Dmitry!");
    }

    private static void printHello (String name) {
        System.out.println("Hello, " + name);
    }

    private static void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void getSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    private static void getSum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    // Create a method
    // That prints name and age of a person
    private static void printAge(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }
}
