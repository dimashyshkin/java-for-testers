public class Homework5 {
    public static void main(String[] args) {
        // Write a Java method that calculates and returns the average of three given numbers.
        System.out.println(getAverage(3,4,5));
        System.out.println(getAverage(5,10,15));
    }

    private static int getAverage(int a, int b, int c) {
        return (a + b + c)/3;
    }
}
