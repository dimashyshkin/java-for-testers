public class Homework1 {
    public static void main(String[] args) {
        int number = 101;
        if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number <= 10) {
            System.out.println("Small");
        } else if (number < 100 && number != 23) {
            System.out.println("Less than 100");
        } else if (number == 23) {
            System.out.println("Jordan");
        } else {
            System.out.println("Too big");
        }


        // Print "Jordan" if the number is 23
    }
}
