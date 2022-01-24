public class JavaExceptions {
    public static void main(String[] args) {
        String[] students = {"Dmitry", "Olga", "Roman"};
        try {
            System.out.println(students[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception happened: " + e.getMessage());
        }
        System.out.println("Continue");
    }
}
